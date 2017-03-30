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
public class Moderateur extends Utilisateur implements Salarie {
   
    // Attribut 

    private int niveau;
    // Liste desConstructeur 
    
    public Moderateur() {
               
    }
       
    // Liste des Methodes    
    public void supressUser() {
        
        
        for (int i = 0; i<getAllUsers().size(); i++) {
            System.out.println( getAllUsers().get(i) + i);

        }  
        
        System.out.println("- Quel utilisateur voulez vous supprimer ? \n ");
        int choix = sc.nextInt();

        getAllUsers().remove(choix);
          
        }          
    public int getNiveau() {
        return niveau;
    }
    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    @Override
    public void recevoirPaiement() {
       System.out.println(" Vous avez reçu votre cheque cadeau, y'en a d'autre qui recoivent de l'argent, quitter ce travail ! :B ");
    }
       
              
     
}
        
    
