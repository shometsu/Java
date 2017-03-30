/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet1;


/**
 *
 * @author steeven.renaut
 */
public class Utilisateur extends Personne implements Relation  {
    
    
    // Liste des Attributs

 

    
    
    // Liste des Constructeurs
    public Utilisateur() {
        
    }
    
    // Liste des méthodes

   

    @Override
    public void ajouterPersonne() {
       System.out.println(" En tant que directeur j'ajoute un utilisateur ");
    }
       
    
    public void addUser(String pPrenom){
        this.allUsers.add(pPrenom);
    }    
}
             

