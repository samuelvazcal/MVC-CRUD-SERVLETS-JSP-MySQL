package info.crudpokemon.model;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ReadServlet")
public class ReadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter salida = response.getWriter();
		String usuario = "root";
		String password = "root";
		String urlServidor = "jdbc:mysql://localhost:3306/pokemon?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	
		String idDexNacionalToRead = request.getParameter("txtNatDex");
		int idDexNacional = 0;
		String nombrePokemon = "";
		String tipoPokemon = "";
		double pesoPokemon = 0.0;
		double alturaPokemon = 0.0;
		String sentenciaSql = "SELECT * FROM pokemonagua WHERE idDexNacional='"+idDexNacionalToRead+"'";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection miConexion = DriverManager.getConnection(urlServidor, usuario, password);
			PreparedStatement miPreparedStatement = miConexion.prepareStatement(sentenciaSql);
			ResultSet miResultSet = miPreparedStatement.executeQuery();
			miResultSet.next();
			idDexNacional = miResultSet.getInt(2);
			nombrePokemon = miResultSet.getString(3);
			tipoPokemon = miResultSet.getString(4);
			pesoPokemon = miResultSet.getDouble(5);
			alturaPokemon = miResultSet.getDouble(6);
			salida.append("<table>");
			salida.append("<tr>");
			salida.append("<th>Id Dex Nacional</th>");
			salida.append("<th>Nombre Pokemon</th>");
			salida.append("<th>Tipo Pokemon</th>");
			salida.append("<th>Peso</th>");
			salida.append("<th>Altura</th>");
			salida.append("</tr>");
			salida.append("<tr><td>"+idDexNacional+"</td><td>"+nombrePokemon+"</td><td>"+tipoPokemon+"</td><td>"+pesoPokemon+"</td><td>"+alturaPokemon+"</td></tr>");
			salida.append("</table>");
			salida.append("<br>");
			salida.append("<a href='Read.jsp'>Back</a>");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
