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

/**
 * Servlet implementation class CreateServlet
 */
@WebServlet("/CreateServlet")
public class CreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter salida = response.getWriter();
		String urlServidor = "jdbc:mysql://localhost:3306/pokemon?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String usuario = "root";
		String password = "root";
		//String sentenciaSql = "INSERT INTO pokemonagua VALUES ('0',?,?,'"+defaul+"',?,?)";
		String sentenciaSql = "INSERT INTO pokemonagua (idPokemon, idDexNacional,nombrePokemon,pesoPokemon,alturaPokemon) VALUES ('0',?,?,?,?)";
		int nRegistros = 0;
		
		PokemonAgua miPokemon = new PokemonAgua();
		miPokemon.setIdDexNacional(Integer.parseInt(request.getParameter("txtNatDex")));
		miPokemon.setNombrePokemon(request.getParameter("txtNombrePokemon"));
		//miPokemon.setTipoPokemon(request.getParameter(""));
		miPokemon.setPesoPokemon(Double.parseDouble(request.getParameter("txtPesoPokemon")));
		miPokemon.setAlturaPokemon(Double.parseDouble(request.getParameter("txtAlturaPokemon")));
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection miConexion = DriverManager.getConnection(urlServidor,usuario,password);
			PreparedStatement miPreparedStatement = miConexion.prepareStatement(sentenciaSql);
			miPreparedStatement.setInt(1,miPokemon.getIdDexNacional());
			miPreparedStatement.setString(2, miPokemon.getNombrePokemon());
			miPreparedStatement.setDouble(3, miPokemon.getPesoPokemon());
			miPreparedStatement.setDouble(4, miPokemon.getAlturaPokemon());
			nRegistros=miPreparedStatement.executeUpdate();
			if(nRegistros>0){
				salida.append("SI FUNCIONO! ABNB<3!");
			}
			else {
				salida.append("NO FUNCIONA!");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			salida.append("<a href='Create.jsp'>BACK</a>");
		}
	}

}
