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
public class Utilisateur {
    
    
// Attribut
    
    private String firstname;
    private String lastname;
    private String city;
    private String confidentialite;
    private String email;
    private String password;

    Scanner sc = new Scanner(System.in);

   
// Constructeur
    
    public Utilisateur() {
        
    }
    


// Methodes
    // Getter Setter
    
    public String getConfidentialite() {
        return confidentialite;
    }
    public void setConfidentialite(String confidentialite) {
        this.confidentialite = confidentialite;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {    
        this.password = password;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    
    
    // Simple methode 
    
    public void createUser() {
        
        System.out.println(" - Saisissez votre prénom ");
        this.firstname = sc.nextLine();
        
        System.out.println(" - Saisissez votre nom ");
        this.lastname = sc.nextLine();
        
        System.out.println(" - Saisissez votre ville ");
        this.city = sc.nextLine();       
                 
        System.out.println(" - Saisissez votre Email ");
        this.email = sc.nextLine();   
        
        
        System.out.println(" - Votre profil est il privé ou public ");
        this.confidentialite = sc.nextLine();
       
        System.out.println(" - votre mot de passe ? ");            
        this.password = sc.nextLine();
    }
}
