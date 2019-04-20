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

import com.mysql.cj.jdbc.Driver;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter salida = response.getWriter();
		String urlServidor = "jdbc:mysql://localhost:3306/pokemon?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String usuario = "root";
		String password = "root";
		int nRegistros=0;
		
		PokemonAgua miPokemon = new PokemonAgua();
		miPokemon.setIdDexNacional(Integer.parseInt(request.getParameter("txtNatDex")));
		miPokemon.setPesoPokemon(Double.parseDouble(request.getParameter("txtPesoPokemon")));
		miPokemon.setAlturaPokemon(Double.parseDouble(request.getParameter("txtAlturaPokemon")));
		String sentenciaSql = "UPDATE pokemonagua SET pesoPokemon=?, alturaPokemon=? WHERE idDexNacional=?";
		//String sentenciaSql = "UPDATE pokemonagua SET pesoPokemon=? WHERE idDexNacional=?";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection miConexion = DriverManager.getConnection(urlServidor, usuario, password);
			PreparedStatement miPreparedStatement = miConexion.prepareStatement(sentenciaSql);
			//miPreparedStatement.setInt(3, miPokemon.getIdDexNacional());
			miPreparedStatement.setDouble(1, miPokemon.getPesoPokemon());
			miPreparedStatement.setDouble(2, miPokemon.getAlturaPokemon());
			miPreparedStatement.setInt(3, miPokemon.getIdDexNacional());
			nRegistros=miPreparedStatement.executeUpdate();
			if(nRegistros>0) {
				System.out.println("ABNB <3");
				salida.append("SUCCESSFUL TASK! ");
				salida.append("<table>");
				salida.append("<tr>");
				salida.append("<th>Id Dex Nacional</th>");
//				salida.append("<th>Nombre Pokemon</th>");
//				salida.append("<th>Tipo Pokemon</th>");
				salida.append("<th>Peso</th>");
				salida.append("<th>Altura</th>");
				salida.append("</tr>");
				//salida.append("<tr><td>"+miResultSet.getInt(2)+"</td><td>"+miResultSet.getString(3)+"</td><td>"+miResultSet.getString(4)+"</td><td>"+miResultSet.getDouble(5)+"</td><td>"+miResultSet.getDouble(6)+"</td></tr>");
				salida.append("<tr><td>"+miPokemon.getIdDexNacional()+"</td><td>"+miPokemon.getPesoPokemon()+"</td><td>"+miPokemon.getAlturaPokemon()+"</td></tr>");
				salida.append("</table>");
				salida.append("<a href='Update.jsp'>Back</a>");
			}else {
				salida.append("UNSUCCESSFUL TASK! ");
			}
		}catch(Exception e) {
			System.out.println(":(");
			e.printStackTrace();
		}
		
	}

}
