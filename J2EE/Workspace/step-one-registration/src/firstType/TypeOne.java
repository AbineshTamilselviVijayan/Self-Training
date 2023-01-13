package firstType;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class TypeOne {
	public static void main(String[] args) {
		try {
			java.sql.Driver d = new Driver();
			DriverManager.registerDriver(d);
			System.out.println("Registration successful");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
