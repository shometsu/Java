/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdd;

import java.util.Scanner;

/**
 *
 * @author steeven.renaut
 */
public class Menu {
    
    
    // Attribut
    
    public int id;
    private int saisi;
    Scanner sc = new Scanner(System.in);
    
    
    // Constructeur
    
    public Menu() {
        
    }
    
    // Methodes

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getSaisi() {
        return saisi;
    }
    public void setSaisi(int saisi) {
        this.saisi = saisi;
    }
    
    
    
    public void demarrage() {
        
        System.out.println(" - Voulez vous afficher tout les utilisateurs ? (1)");
        System.out.println(" - Trouver un utilisateur via un ID ? (2)");
        System.out.println(" - Créer une utilisateur (3)");
        System.out.println(" - Afficher les amis d'un utilisateur ? (4)");
        this.saisi = sc.nextInt();
        
    }
         
         
        
    public void checkAllUser() {
    
         DBConnect connection = new DBConnect();
         connection.getData();     
         
        
    }
    
    public void checkSpecifiqueUser() {
        
            System.out.println(" - Veuillez choisir l'id de la personne que vous voulez retrouver ");
            this.id = sc.nextInt();
            System.out.println(" - l'id choisis est "+ id);
            
            
            
    }
    
    public void selectUserId() {
        
            System.out.println(" - a quel utilisateur faut il fouiller la liste d'ami ? ( par l'id )");
            this.id = sc.nextInt();
            System.out.println(" - l'utilisateur choisis est le n°"+ id);
            
    }
    


}
       
            

            

    

