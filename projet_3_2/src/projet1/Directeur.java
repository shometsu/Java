/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet1;

/**
 *
 * @author Steeven.RENAUT
 */
public class Directeur extends Employe implements Relation {
    
    
    // Liste des attributs
    
    
    // Liste des constructeurs
    
    public Directeur () {
        
    }
    
    // Liste des méthodes 

    @Override
    public void ajouterPersonne() {
       System.out.println(" En tant que directeur j'ajoute un utilisateur ! ");
    }
}
