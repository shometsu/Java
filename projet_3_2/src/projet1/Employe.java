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
public class Employe extends Personne implements Salarie {
    
    
    // Liste des attributs 
    
    private int salaire;
    private String duréeContrat;
    
    
    // Liste des constructeurs
    
    public Employe() {        
        
    }
    
    // Liste des méthodes 

    public int getSalaire() {
        return salaire;
    }
    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    @Override
    public void recevoirPaiement() {
        System.out.println(" Vous avez été payé très chère ");
    }
      
    public void travailler() {
        
    }
}
