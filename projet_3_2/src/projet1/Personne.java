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
 * @author Steeven.RENAUT
 */
public class Personne {
    
    
    // Liste des attributs 
    
    private String prenom;
    private String nom;
    private int birthdate;
    Scanner sc = new Scanner(System.in);
    ArrayList<String> Messages =  new ArrayList <>();
    ArrayList<String> Amis =  new ArrayList <>();   
    ArrayList<String> allUsers = new ArrayList();
    private String pseudo;
    String response = "O";
    private String moderateur;
    
    
    // Liste des constructeurs
    
    public Personne () {
        
        
    }
    
        // Liste des méthodes 

    // <editor-fold defaultstate="collapsed" desc="all getters and setters">
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(int birthdate) {
        this.birthdate = birthdate;
    }
    public ArrayList<String> getMessages() {
        return Messages;
    }
    public void setMessages(ArrayList<String> Messages) {
        this.Messages = Messages;
    }
    public ArrayList<String> getAmis() {
        return Amis;
    }
    public void setAmis(ArrayList<String> Amis) {
        this.Amis = Amis;
    }
    public ArrayList<String> getAllUsers() {
        return allUsers;
    }
    public void setAllUsers(ArrayList<String> allUsers) {
        this.allUsers = allUsers;
    }
    public String getPseudo() {
        return pseudo;
    }
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
    public String getResponse() {
        return response;
    }
    public void setResponse(String response) {
        this.response = response;
    }
    public String getModerateur() {
        return moderateur;
    }
    public void setModerateur(String moderateur) {
        this.moderateur = moderateur;
    }
    // </editor-fold>

    
    public void switchInfo() {
        
        System.out.println("Veuillez saisir votre prénom :");
        String vPrenom = sc.nextLine();
        setPrenom(vPrenom);
        
        
        System.out.println("Veuillez saisir votre nom :");
        String vNom = sc.nextLine();
        setNom(vNom);
        
        
        System.out.println("Veuillez saisir votre année de naissance ( YYYY ) :");
        int vBirthdate = sc.nextInt();
        setBirthdate(vBirthdate);
        
        System.out.println("Votre nom complet est :" + vPrenom+" "+ vNom + " votre année de naissance est "+vBirthdate);
        
    }  
    public void afficherInfo() {
        
        System.out.println("Votre nom est "+getPrenom()+" "+getNom()+" Votre année de naissance est "+getBirthdate());
        
    }
    public void message() {
        
        System.out.println("Saisissez le contenu de votre message ");
        String message = sc.nextLine();
        Messages.add(message+"\n");
        
    }  
    public void messageList() {
       
    System.out.println("Voici tout les messages que vous avez saisis ");
                            
        for (int i = 0; i<Messages.size(); i++) {
            System.out.println( Messages.get(i));
          
        }             
    
        
    }
    public void leave() {
         
        this.response = "N";
        System.out.println(" Merci d'être venu !  ");
        System.out.println(response);
    }
    public void userList() {
        
        System.out.println("Voici la liste des utilisateurs ");
                            
        for (int i = 0; i<allUsers.size(); i++) {
            System.out.println( allUsers.get(i)+i);
          
        }             
        
    }
    public void supressMsg() {
        
        for (int i = 0; i<Messages.size(); i++) {
            System.out.println( Messages.get(i));

        }  
        
        System.out.println("Quel message voulez vous supprimer ? ");
        int choix = sc.nextInt();

        Messages.remove(choix);
    }
    public void addFriend() {

        System.out.println("Quel ami voulez vous ajouter ?");
        String ami = sc.nextLine();
        Amis.add(ami);
         
     }
    public void friendList () {
          
        System.out.println(" Voici votre liste d'ami : ");
                            
        for (int i = 0; i<Amis.size(); i++) {
            System.out.println( Amis.get(i));
            
            }      
    }  



}
