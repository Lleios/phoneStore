import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

/**
* Classe Magasin
*
* Classe de test
*
* @author  Gonnord Kevin, Chcouropat Youri
*/

public class Magasin {

	static ListeArticles listeArticles = new ListeArticles();
	
	/** 
	 * main 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Article article;
		Scanner sc;
		while(true){
			sc = new Scanner(System.in);
			menu();
			try{
				switch(sc.nextInt()){
				case 1: article = creeArticle();
					listeArticles.add(article);
				break;
				case 2: if(listeArticles.getListeArticles().isEmpty()){
					System.out.println("La liste est vide pas d'article à supprimer !");
				}else{
					article = supprimerArticle();
					listeArticles.delete(article);
				}
				break;
				case 3: listeArticles.afficher();
				break;
				case 4:listeArticles.tousLesArticles_ParRef();
				break;
				case 5:listeArticles.tousLesArticles_ParIntitule();
				break;
				case 6:listeArticles.tousLesArticles_ParPrix();;
				break;
				case 7: System.exit(0);
				break;
				case 8 : if(listeArticles.getListeArticles().isEmpty()){
							System.out.println("La liste est vide pas d'article à sauvegarder !");
						 }
						 else {
							 listeArticles.sauvegarde("listeArticles.txt");
						 }
				break;
				default: System.out.println("??? Veuillez choisir chiffre"
						+ " de la liste pour faire votre choix ???\n");
				}
			}catch(InputMismatchException e){
				System.out.println("!!! Les chaines de caractères ne sont pas autorisées !!!\n");
			}
		}
//		Coque co1 = new Coque(17256, "Coque", (float) 12.90, 
//				new HashSet<String>(Arrays.asList(new String[] {"Iphone 4", "Iphone 4S"})),
//				Couleur.rose);
//		
//		listeArticles.add(co1);
//		
//		listeArticles.afficher();
		
	}
	/**
	 * Méthode qui affiche un menu
	 * 
	 */
	public static void menu(){
		System.out.println("-----------Menu Principal--------------");
		System.out.println("1 - Ajouter un articles dans le magasin");
		System.out.println("2 - Supprimer un article du magasin");
		System.out.println("3 - Afficher la liste d'article du magasin");
		System.out.println("4 - Afficher la liste d'article trier par référence");
		System.out.println("5 - Afficher la liste d'artcle trier par intitulé");
		System.out.println("6 - Afficher la liste d'article trier par prix");
		System.out.println("8 - Sauvegarder les articles dans un fichiers");
		System.out.println("7 - Quitter l'application");
		System.out.println("(appuyer sur le numero correspondant)");
	}
	
	/**
	 * Méthode de création d'article
	 * 
	 * @return Article
	 */
	public static Article creeArticle(){
		int reference;
		String intitule;
		float prix;
		int longueur;
		String marque;
		Set<String> marques = new HashSet<String>();
		Types type = null;
		Operateurs operateur = null;
		Couleurs couleur = null;
		boolean defaut = true;
		
		System.out.println("-------------Ajout d'un article-----------");
		System.out.println("Choisissez l'article que vous voulez ajouter au magasin:");
		System.out.println("1 - Telephone");
		System.out.println("2 - Coque");
		System.out.println("3 - Cordon");
		System.out.println("4 - Chargeur");
		System.out.println("5 - Revenir au menu principal");
		Scanner sc = new Scanner(System.in);
		
		while(defaut){
			defaut = false;
			switch(sc.nextInt()){
			//--------------------Ajouter un Telephone-------------------
			case 1: System.out.println("Indiquez la reference du téléphone:");
				reference = sc.nextInt();
				System.out.println("Tapez le nom du telephone:");
				intitule = sc.next();
				System.out.println("Quel est le prix du téléphone:");
				prix = sc.nextFloat();
				System.out.println("Quel est l'opérateur associer:");
				System.out.print("Opérateurs : ");
				for (Operateurs oper : Operateurs.values()){
					System.out.print(oper.toString()+" ");
				}
				operateur = Operateurs.get(sc.next()); 
				while ( operateur == null){
					System.out.println("Operateur inexistant");
					System.out.println("veuillez entrer un opérateur appartenant a la liste");
					operateur = Operateurs.get(sc.next()); 
				}
				Telephone tel = new Telephone(reference, intitule, prix, operateur);
				System.out.println("Téléphone ajouté au magasin !");
				return tel;
				
			//----------------------Ajouter une coque------------------
			case 2: System.out.println("Indiquez la reference de la coque:");
				reference = sc.nextInt();
				System.out.println("Tapez l'intitule de la coque:");
				intitule = sc.next();
				System.out.println("Quel est le prix de la coque:");
				prix = sc.nextFloat();
				System.out.println("Quel est la couleur de la coque:");
				System.out.print("Couleurs : ");
				for (Couleurs coul : Couleurs.values()){
					System.out.print(coul.toString()+" ");
				}
				couleur = Couleurs.get(sc.next()); 
				while ( couleur == null){
					System.out.println("Couleur non valide");
					System.out.println("veuillez entrer une couleur appartenant a la liste");
					couleur = Couleurs.get(sc.next()); 
				}
				System.out.println("Quel sont les marques associées:");
				System.out.println("(Appuyer sur * pour quitter l'ajout de marque)");
				System.out.println("Ajouter une marque:");
				marque = sc.next();
				while(marque.equals("*") == false){
					marques.add(marque);
					System.out.println("Ajouter une marque:");
					marque = sc.next();
				}
				Coque coque = new Coque(reference, intitule, prix, marques, couleur);
				System.out.println("Coque ajoutée au magasin !");
				return coque;
				
			//---------------------Ajouter un cordon--------------------
			case 3: System.out.println("Indiquez la reference du cordon:");
				reference = sc.nextInt();
				System.out.println("Tapez l'intitule du cordon:");
				intitule = sc.next();
				System.out.println("Quel est le prix du cordon:");
				prix = sc.nextFloat();
				System.out.println("Quel est la longeur du cordon:");
				longueur = sc.nextInt();
				System.out.println("Quel sont les marques associées:");
				System.out.println("(Appuyer sur * pour quitter l'ajout de marque)");
				marque = sc.next();
				while(marque.equals("*") == false){
					marques.add(marque);
					System.out.println("Ajouter une marque:");
					marque = sc.next();
				}
				Cordon cordon = new Cordon(reference, intitule, prix, marques, longueur);
				System.out.println("Coque ajoutée au magasin !");
				return cordon;
				
			//---------------------Ajouter un chargeur---------------------
			case 4: System.out.println("Indiquez la reference du chargeur:");
				reference = sc.nextInt();
				System.out.println("Tapez l'intitule du chargeur:");
				intitule = sc.next();
				System.out.println("Quel est le prix du chargeur:");
				prix = sc.nextFloat();
				System.out.println("Quel sont les marques associées:");
				System.out.println("(Appuyer sur * pour quitter l'ajout de marque)");
				marque = sc.next();
				while(marque.equals("*") == false){
					marques.add(marque);
					System.out.println("Ajouter une marque:");
					marque = sc.next();
				}
				System.out.println("Quel est le type de chargeur");
				System.out.print("Chargeur : ");
				for (Types types : Types.values()){
					System.out.print(types.toString()+" ");
				}
				type = Types.get(sc.next()); 
				while ( type == null){
					System.out.println("Type non valide");
					System.out.println("veuillez entrer un type appartenant a la liste");
					type = Types.get(sc.next());
				}
				Chargeur chargeur = new Chargeur(reference, intitule ,prix, marques, type);
				return chargeur;
				
			//---------------------Retourner au menu principal-------------------------
			case 5: return null;
			
			//--Message d'information si le choix choisi ne correspond pas à ceux proposés
			default: System.out.println("Je n'ai pas compris, veuillez choisir un entier"
					+ " pour faire votre choix.");
				defaut = true;
			break;
			}
		}
		return null;
		
	}
	
	/**
	 * Méthode de suppresion d'un article qui retourne l'article supprimé
	 * 
	 * @return Article l'article supprimé
	 */
	public static Article supprimerArticle(){
		int reference;
		System.out.println("-------------Supprimmer article------------");
		System.out.println("Quel est l'article que vous voulez supprimer:");
		System.out.println("(indiquez sa référence)");
		listeArticles.afficher();
		Scanner sc = new Scanner(System.in);
		reference = sc.nextInt();
		return listeArticles.trouverArticle(reference);
	}

}