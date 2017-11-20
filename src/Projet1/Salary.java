/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projet1;

/**
 *
 * @author Abgoudja Mahamat
 */


class Salary {
	public static void main(String[] args) {
		Personnel p = new Personnel();
		p.ajouterEmploye(new Vendeur("TOTO", "Business", 45, "1995", 30000));
		p.ajouterEmploye(new Representant("TATI", "Mht", 25, "2001", 20000));
		p.ajouterEmploye(new Technicien("TATA", "Bosseur", 28, "1998", 1000));
		p.ajouterEmploye(new Manutentionnaire("TITI", "Stocketout", 32, "1998", 45));
		p.ajouterEmploye(new TechnARisque("TATO", "Flippe", 28, "2000", 1000));
		p.ajouterEmploye(new ManutARisque("TATE", "Abordage", 30, "2001", 45));

		p.afficherSalaires();
		System.out.println("Le salaire moyen dans l'entreprise est de "
				+ p.salaireMoyen() + " francs.");

	}

}