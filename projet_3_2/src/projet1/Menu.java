/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author steeven.renaut
 */
public class Menu {
     
     //Liste des Attributs 
    
     private String response;
     Scanner sc = new Scanner(System.in);
     private String poste;
     private String typeEmploye;
     Personne personn;
     String poste2;
     private ArrayList<String> allUsers = new ArrayList();
    // public int exeption;
        
     // Liste des Constructeurs
     
     public Menu() {
         
     }



    // Liste des Methodes
    public void setTypeEmploye(String typeEmploye) {
        this.typeEmploye = typeEmploye;
    }
    public String getTypeEmploye() {
        return typeEmploye;
    }
    public ArrayList<String> getAllUsers() {
        return allUsers;
    }
    public void setAllUsers(ArrayList<String> allUsers) {
        this.allUsers = allUsers;
    } 
    public String getResponse() {
        return response;
    }
    public void setResponse(String response) {
        this.response = response;
    }
    public String getPoste() {
        return poste;
    }
    public void setPoste(String moderateur) {
        this.poste = poste;
    } 
   
    public void affichermenu( ) {

        this.response="";        
        while (!"N".equals(response)) {

            System.out.println("- Voulez-vous quittez le programme ? (0/N)  ");
            System.out.println("- Afficher votre profil ? : 1  ");                
            System.out.println("- Modifier vos information personnelles ? : 2  ");
            System.out.println("- Ecrire un message ? : 3  ");
            System.out.println("- Liste des messages : 4  "); 
            System.out.println("- Ajouter un ami ? : 5 ");
            System.out.println("- Voir vos amis ? : 6  ");
            System.out.println("- Supprimer un message : 7  ");
            System.out.println("- Saisir un nouvelle utilisateur : 8  ");
            System.out.println("- Afficher la liste des utilisateurs : 9  ");
                       
            if ( !"2".equals(poste)) {
                System.out.println("- Voulez vous supprimer des utilisateurs ? 10  ");
                System.out.println("- Recevoir votre cheque cadeau 11 "); // A faire dans le switch
            }
            else if("1".equals(typeEmploye)) {
                System.out.println(" = a 1 ( Développeur )");
                System.out.println("- Recevoir votre cheque  ( 12 )  ");
            }
            else if("2".equals(typeEmploye)) {
                System.out.println(" = a 2 ( Marketeur ) ");
                System.out.println("- Recevoir votre cheque  ( 12 )  ");
                 // Recevoir paiement argent 
            }
            else if("3".equals(typeEmploye)) {
                System.out.println(" = a 3 ( Directeur ) ");
                System.out.println("- Recevoir votre cheque  ( 12 )  ");
                
            }
        }
    }
        
    public void choixMenu(Personne user) {
        
                String choix = sc.nextLine();
                               
                    switch (choix) {
                        case "1": user.afficherInfo();
                            break;
                        case "2": user.switchInfo();                            
                            break;
                        case "3": user.message();
                            break;
                        case "4": user.messageList();     
                            break;
                        case "5": response = sc.nextLine();
                                  user.addFriend();
                            break;
                        case "6": user.friendList();                            
                            break;
                        case "7": user.supressMsg();  
                            break;
                        case "8": demarrage(user);
                            break;
                        case"9": user.userList();
                            break;
                        case"10":
                            Moderateur m = (Moderateur)user;
                                  m.supressUser();
                          //  ((Moderateur)user).supressUser();
                            break;
                        case"11":                              
                            break;
                        case"12": // Executer la fonction dans Employé )
                            break;
                        case "N": user.leave(); 
                                  this.response = "N";
                            break;
                        default: System.out.println("Commande inconnu, veuillez réessayez \n ");
                            break; 

                    }
                          
                }
                        

    
    public void moderateur() {
        
        
        this.response = "";
        
            while (!"O".equals(response) && !"N".equals(response)) {
        
                System.out.println("- êtes vous un utilisateur ( 1 ) ou un employé ( 2 )  ");
                this.poste = sc.nextLine();
                
                    if ("2".equals(poste)) {
                        
                        System.out.println(" - Etes vous un développeur ? ( 1 )");
                        System.out.println(" - Etes vous un Marketeur ? ( 2 )");
                        System.out.println(" - Etes vous un Directeur ? ( 3 )");
                        typeEmploye = sc.nextLine();
                        
                        switch(typeEmploye) {
                            
                            case "1":
                                System.out.println("Je créer donc un Développeur !");
                                response="O";
                                Personne personn = new Developpeur();
                                this.typeEmploye = "1";
                            break;
                            
                            
                            case "2":
                                System.out.println("Je créer donc un Marketeur !"); 
                                personn = new Marketeur();
                                response="O";
                                this.typeEmploye = "2";
                            break;
                            
                            
                            case "3":
                                System.out.println("Je créer donc un Directeur !"); 
                                personn = new Directeur();
                                response="O";
                                this.typeEmploye = "3";
                            break;
                                     
                            
                            default:
                                System.out.println("Je n'ai pas compris votre saisi !");    
                            break;
                            
                        }
                    }
                    else {
                        
                           System.out.println( " - Etes vous un utilisateur Moderateur ? ( 1 ) ou un simple Utilisateur ( 2 )");
                           this.poste2 = sc.nextLine();
                           System.out.println( poste2+ " " );
                           switch (poste2) {
                             
                            case "1":     
                                System.out.println(" Je suis un modérateur ");
                                personn = new Moderateur();
                            response = "O";
                            break;

                            case "2": 
                                System.out.println(" Je suis un utilisateur  ");
                                personn = new Utilisateur();
                            response = "N";                        
                            break;

                            default :
                                System.out.println(" Je n'ai pas compris votre demande. Veuillez reessayer \n ");                           
                            break;           
                          }     
                        
                                

                    }
    
        
            }
    }
    
    public void demarrage(Personne user) {
           
       
        System.out.println("- Veuillez saisir votre prénom : ");   
        String prenom = sc.nextLine();        
        user.setPrenom(prenom);        
        
        if ( "Utilisateur".equals(user.getClass().toString()) ) {
        
            ( (Utilisateur)user).addUser(prenom);
        }

        System.out.println("- Veuillez saisir un pseudo : ");
        String vPseudo = sc.nextLine();
        user.setPseudo(vPseudo);
         
        System.out.println("- Veuillez saisir votre nom :  ");        
        String nom = sc.nextLine();
        user.setNom(nom);
       
        System.out.println("- Veuillez saisir votre année de naissance ( YYYY ) :  ");
        int birthdate = sc.nextInt();
        user.setBirthdate(birthdate);
        
        
        
        System.out.println("Bienvenu :" + prenom+" "+ nom);
        
        
    }
    
}
