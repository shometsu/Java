/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdd;

/**
 *
 * @author steeven.renaut
 */
public class BDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

            Menu newMenu = new Menu();
            newMenu.demarrage();
            DBConnect newDBConnect = new DBConnect();

            
            
            if ( newMenu.getSaisi() == 1) {
                // Tout les utilisateurs
                newMenu.checkAllUser();      
            }
            else if ( newMenu.getSaisi () == 2 ) {
                
                // Un utilisateur spécifique
                
                newMenu.checkSpecifiqueUser();

                newDBConnect.getDataWhere( newMenu );
                
            }
            else if (newMenu.getSaisi() == 3 ) {
                
              // Ajouter un utilisateur en BDD 
              
              Utilisateur newUser = new Utilisateur();
              newUser.createUser();
              
              newDBConnect.saveUser(newUser);
            }
            else if ( newMenu.getSaisi() == 4 ) {

                // Affichage des amis 

                
                newMenu.selectUserId();
                newDBConnect.friendList(newMenu);
                
                
                
                
                
            }
            else {
                System.out.println( " Je n'ai pas compris, veuillez relancer le programme ");
            }
    }
    
}
