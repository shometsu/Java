/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet1;

class Executable {
          
    public static void main(String[] args) {

             
        
        Utilisateur user; // Attribut 
        Menu newMenu = new Menu(); 
        newMenu.moderateur();

        
        // Si c'est un employé on créer un new employé
        
        if ("2".equals(newMenu.getPoste())) {
            System.out.println(" C'est A CE MOMENT LA QUE JE CREER UN EMPLOYE ");
            System.out.println(newMenu.getPoste());
            Personne newPersonne = new Employe();
        }
        
        // Si c'est un utilisateur on lui demande si il est un modérateur ou un simple utilisateur, et on instancie le choix.
        
        
        
        
        
        if (!"2".equals(newMenu.getPoste())) {
            
            user = new Utilisateur();
            newMenu.demarrage(user);
            newMenu.affichermenu();
            
        }
        
        else {
            
            user = new Moderateur();
            newMenu.demarrage(user);
            newMenu.affichermenu();
            
        }          
         
    }
}
    