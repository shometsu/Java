/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdd;

import java.sql.*;

/**
 *
 * @author steeven.renaut
 */
public class DBConnect {
    
    
    // Liste des attributs
    
   private Connection con;
   private Statement st;
   private ResultSet rs;
   private PreparedStatement pst; // PreparedStatement = Meilleure sécurité pour les requêtes SQL 
    
    
    
    
    // Liste des constructeurs
    
    
    public DBConnect() {
        
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/travel-in-live", "root", "root");
            st = con.createStatement();
            
        }catch (Exception ex) {
                System.out.println("Erreur ! " + ex);
                
                }
    }
    
    
    // Liste des méthodes 
    
    public void getData() {
        
        try {
            String query = "select * from users";
            rs = st.executeQuery(query);
            
            while (rs.next()) {
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                
                System.out.println(firstname +" "+ lastname);
            }
            
        } catch(Exception ex) {
            System.out.println("Erreur "+ ex);
        }
        
        
        
    }
    public void getDataWhere( Menu newMenu ) {
        
        try {

        System.out.println( newMenu.getId() ); // Je regarde si je récupère bien la valeur de ID 
        String query = "SELECT * FROM users WHERE user_id = ?"; // Création de ma requête SQL 
        pst = con.prepareStatement(query);
        
        pst.setInt(1, newMenu.getId());
        
        rs = pst.executeQuery();
        
        System.out.println( query ); // Affichage de ma requête

        System.out.println(" Records from Database \n"); // J'affiche un message pour dire que je passe à la suite.
         
        rs.first(); 
        rs.absolute(1);
        
  
        String firstname = rs.getString("firstname");
        String lastname = rs.getString("lastname");
                
                System.out.println(firstname +" "+ lastname);

        

            } catch(Exception ex) {
                ex.printStackTrace();
        }
    } 
    public void saveUser(Utilisateur newUser) {
        
        try {
            System.out.println( newUser.getFirstname() ); // Je regarde si je récupère bien la valeur du prénom
            System.out.println( newUser.getLastname() ); // Je regarde si je récupère bien la valeur du nom
            System.out.println( newUser.getCity() ); // Je regarde si je récupère bien la valeur de la ville
            System.out.println( newUser.getEmail() ); // Je regarde si je récupère bien la valeur de l'email
            System.out.println( newUser.getPassword() ); // Je regarde si je récupère le mot de passe 
            System.out.println( newUser.getConfidentialite() ); // Je regarde si je récupère la confidentialité
            

            String query = "INSERT INTO users ( firstname, lastname, city, email, password, user_confidentiality ) VALUES ( ?, ?, ?, ?, ?, ?  )";
            System.out.println( query ); // Affichage de ma requête
            
            pst = con.prepareStatement(query);
            
            pst.setString(1, newUser.getFirstname());
            pst.setString(2, newUser.getLastname());
            pst.setString(3, newUser.getCity());
            pst.setString(4, newUser.getEmail());
            pst.setString(5, newUser.getPassword());
            pst.setString(6, newUser.getConfidentialite());
            
            
            pst.executeUpdate(); // J'exécute la requête sql spécifique a l'update sans parametre :D
            
            System.out.println(" Records from Database \n"); // J'affiche un message pour dire que je passe à la suite.
            
            System.out.println(" L'utilisateur "+ newUser.getFirstname()+" "+ newUser.getLastname()+ " à bien été créer ");
            
        }   catch( Exception ex ) {
                ex.printStackTrace();
        }

    }
    
    public void friendList(Menu newMenu) {

        try {

            String query = "SELECT U.firstname, U.lastname FROM users AS U "+
                            "JOIN friends ON U.user_id = friends.user_1_id "+
                            "JOIN users as U1 ON U1.user_id = friends.user_2_id "+
                            "WHERE U1.user_id = ? OR U1.user_id = ? ";


            pst = con.prepareStatement(query);
            
            pst.setInt(1, newMenu.getId() );
            pst.setInt(2, newMenu.getId() );  
            
            rs = pst.executeQuery();
            
            while (rs.next()) {
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                
                System.out.println(firstname +" "+ lastname);
            }
            
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        
        
    }
}


