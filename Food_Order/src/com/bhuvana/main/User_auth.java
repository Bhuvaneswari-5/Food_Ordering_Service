package com.bhuvana.main;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

//connection establishment
 class DBConnection
 {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "system";
    private static final String PASSWORD = "bhuvana"; 

    public static Connection getConnection() throws SQLException
    {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

 //class for resginter and login methods
 class UserService 
{
    private UserDC userDC;

    public UserService() 
    {
        this.userDC = new UserDC();
    }

    public void register(User user) throws SQLException 
    {
        userDC.registerUser(user);
    }

    public User login(String username, String password) throws SQLException 
    {
        return userDC.loginUser(username, password);
    }
}

 

//method for regitration
 class UserDC
 {
     public void registerUser(User user) throws SQLException
     {
         String sql = "INSERT INTO users (username, password, email) VALUES (?, ?, ?)";
         
         Connection conn = DBConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql);
         try (conn;stmt) 
         {
             stmt.setString(1, user.getUsername());
             stmt.setString(2, user.getPassword());
             stmt.setString(3, user.getEmail());
             stmt.executeUpdate();
         }
     }
//method(login) for user
  public User loginUser(String username, String password) throws SQLException
     {
         String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
         
         Connection conn = DBConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql);
         
         try (conn;stmt )
          {
             stmt.setString(1, username);
             stmt.setString(2, password);
             
             ResultSet rs = stmt.executeQuery();
             
             if (rs.next()) 
             {
                 User user = new User(rs.getString("username"), rs.getString("password"), rs.getString("email"));
                 user.setId(rs.getInt("id"));
                 return user;
             }
         }
         return null;
     }
 }

 //user deta
 class User
 {
	    private int id;
	    private String username;
	    private String password;
	    private String email;

	    public User(String username, String password, String email) {
	        this.username = username;
	        this.password = password;
	        this.email = email;
	    }

	    // Getters and Setters
	    public int getId()
	    { 
	    	return id; 
	    }
	    public void setId(int id) { this.id = id; }

	    public String getUsername() { return username; }
	    public void setUsername(String username) { this.username = username; }

	    public String getPassword() { return password; }
	    public void setPassword(String password) { this.password = password; }

	    public String getEmail() { return email; }
	    public void setEmail(String email) { this.email = email; }
	}


public class User_auth 
{

		private static UserService userService = new UserService();

		    public static void main(String[] args) throws InterruptedException 
		    {
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.println("1. Register");
		        System.out.println("2. Login");
		        System.out.print("Choose an option: ");
		        int choice = scanner.nextInt();
		        scanner.nextLine(); 

		        switch (choice) {
		            case 1:
		                registerUser(scanner);
		                break;
		            case 2:
		                loginUser(scanner);
		                break;
		            default:
		                System.out.println("Invalid option!");
		        }
		        
		        scanner.close();
		    }

		    private static void registerUser(Scanner scanner) throws InterruptedException 
		    {
		        System.out.print("Enter username: ");
		        String username = scanner.nextLine();
		        
		        System.out.print("Enter password: ");
		        String password = scanner.nextLine();
		        
		        System.out.print("Enter email: ");
		        String email = scanner.nextLine();
		        
		        User user = new User(username, password, email);
		        
		        try {
		            userService.register(user);
		            System.out.println("User registered successfully!");
		            System.out.println("......Login........");
		            loginUser(scanner);
		            	Home h=new Home();
		            	h.meth1();
		            } catch (SQLException e) {
		            System.out.println("Error registering user: " + e.getMessage());
		        }
		    }

		    private static void loginUser(Scanner scanner) throws InterruptedException 
		    {
		        System.out.print("Enter username: ");
		        String username = scanner.nextLine();
		        
		        System.out.print("Enter password: ");
		        String password = scanner.nextLine();
		        
		        try 
		        {
		            User user = userService.login(username, password);
		            if (user != null) 
		            {
		                System.out.println("Login successful! Welcome, " + user.getUsername());
		                Thread t1=new Thread();
		                t1.sleep(4000);
		                Home h1=new Home();
		                h1.meth1();
		            } else {
		                System.out.println("Invalid username or password.");
		                
		            }
		        } catch (SQLException e) {
		            System.out.println("Error logging in: " + e.getMessage());
		        }
		    }
		}




