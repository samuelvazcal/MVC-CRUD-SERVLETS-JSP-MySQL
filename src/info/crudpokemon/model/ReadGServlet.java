package info.crudpokemon.model;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ReadGServlet")
public class ReadGServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter salida = response.getWriter();
		String usuario = "root";
		String password = "root";
		String urlServidor = "jdbc:mysql://localhost:3306/pokemon?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection miConexion = DriverManager.getConnection(urlServidor, usuario, password);
			Statement miStatement = miConexion.createStatement();
			ResultSet miResultSet = miStatement.executeQuery("SELECT * FROM pokemonagua");
			while(miResultSet.next())
			{
				salida.append("<table>");
				salida.append("<tr>");
				salida.append("<th>Id Dex Nacional</th>");
				salida.append("<th>Nombre Pokemon</th>");
				salida.append("<th>Tipo Pokemon</th>");
				salida.append("<th>Peso</th>");
				salida.append("<th>Altura</th>");
				salida.append("</tr>");
				salida.append("<tr><td>"+miResultSet.getInt(2)+"</td><td>"+miResultSet.getString(3)+"</td><td>"+miResultSet.getString(4)+"</td><td>"+miResultSet.getDouble(5)+"</td><td>"+miResultSet.getDouble(6)+"</td></tr>");
				salida.append("</table>");
				salida.append("<a href='Read.jsp'>Back</a>");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
				
	}

}
