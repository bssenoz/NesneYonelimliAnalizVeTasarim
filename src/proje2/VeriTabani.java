package proje2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class VeriTabani implements IVeriTabani {

	private Connection connect() {
		Connection conn = null;
		try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/iot-login",
                    "postgres", "buse8597");
            if (conn == null) {
            	System.out.println("Baglantı girisimi basarisiz!");
            	System.exit(1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
		return conn;
	}
	public boolean userName(String name) {
		try {
			boolean username;
			Connection conn = this.connect();
			String sql = "select *  from \"user\" where \"name\"='" + name + "' ";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            conn.close();

            Thread.sleep(500);
            
            if (!rs.next()) { 
                System.out.println("\nBoyle bir kullanici adi bulunamadi...");
                username = false;
                System.exit(1);
            } else { 
                username = true;
            }
            rs.close();
            stmt.close();
            return username;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}

	}
	@Override
	public boolean login(String name, String password) {
		
		try {
			boolean girisDurumu;
			Connection conn = this.connect();
			String sql = "select *  from \"user\" where \"name\"='" + name + "' and \"password\"='" + password + "'";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            conn.close();

            Thread.sleep(500);
            
            if (!rs.next()) { 
                System.out.println("\nBoyle bir kullanici bulunamadi...");
                girisDurumu = false;
                System.exit(1);
            } else { 
                System.out.println("\nGiriş başarılı...");

                girisDurumu = true;
            }

            rs.close();
            stmt.close();
            return girisDurumu;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
			
		}
	}

}
