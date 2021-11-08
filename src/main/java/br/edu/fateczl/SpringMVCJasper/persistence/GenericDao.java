package br.edu.fateczl.SpringMVCJasper.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

@Component
public class GenericDao {

	private Connection c;

	public Connection getConnection() throws ClassNotFoundException, SQLException {

		String hostName = "127.0.0.1";
		String dbName = "dbreport1";
		String user = "sa";
		String senha = "P4ssw0rd";
		Class.forName("net.sourceforge.jtds.jdbc.Driver");
		c = DriverManager.getConnection(String.format(
				"jdbc:jtds:sqlserver://%s:1433;databaseName=%s;user=%s;password=%s;", hostName, dbName, user, senha));

		return c;
	}

}