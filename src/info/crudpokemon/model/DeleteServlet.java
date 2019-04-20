package info.crudpokemon.model;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter salida = response.getWriter();
		String url = "jdbc:mysql://localhost:3306/pokemon?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String user = "root";
		String password = "root";
		int nRegistro = 0;
		
		PokemonAgua miPokemon = new PokemonAgua();
		miPokemon.setIdDexNacional(Integer.parseInt(request.getParameter("txtNatDex")));
		String query = "DELETE FROM pokemonagua WHERE idDexNacional=?";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection miConexion = DriverManager.getConnection(url, user, password);
			PreparedStatement miPreparedStatement = miConexion.prepareStatement(query);
			miPreparedStatement.setInt(1, miPokemon.getIdDexNacional());
			nRegistro = miPreparedStatement.executeUpdate();
			if(nRegistro>0) {
				salida.append("SUCCESSFUL TASK!");
				salida.append("<a href='Delete.jsp'>Back</a>");
			}else {
				salida.append("UNSUCCESSFUL TASK!");
				salida.append("<a href='Delete.jsp'>Back</a>");
			}
		}catch(Exception e) {
			System.out.println("It's not working!");
			e.printStackTrace();
		}
	}

}
