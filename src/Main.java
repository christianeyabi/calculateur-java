import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //Déclaration de variables
        double nombre1, nombre2, resultat;
        String operation;

        //Initialisation de variables

        nombre1 = 0.0;
        nombre2 = 0.0;
        resultat = 0.0;
        operation = "";
        // Création d'un objet scanner
        Scanner scanner = new Scanner(System.in);

        //Demande à l'utilisateur de saisir le premier nombre au clavier
        System.out.println("Entrez le premier nombre :");

        try
        {
            //Récupération du nombre saisi au clavier par l'utilisateur
            nombre1 = scanner.nextDouble();
        } catch (InputMismatchException err)
        {
           System.out.println("Mauvais type de données !");
           err.printStackTrace(); // this will print the stack trace of the exception
           System.exit(0); // Fin prématurée du programme si une erreur de saise se produit
        } finally {
            scanner.nextLine(); // Nettoyage du buffer d'entrée
        }

        //Demande à l'utilisateur de saisir le deuxième nombre au clavier
        System.out.println("Entrez le deuxième nombre :");

        try
        {
            //Récupération du nombre saisi au clavier par l'utilisateur
            nombre2 = scanner.nextDouble();
        } catch (InputMismatchException err) {
            System.out.println("Mauvais type de données !");
            err.printStackTrace(); // this will print the stack trace of the exception
            System.exit(0); // Fin prématurée du programme si une erreur de saise se produit
        } finally {
            scanner.nextLine(); // Nettoyage du buffer d'entrée
        }

        //Demande à l'utilisateur de choisir l'opération
        System.out.println("Choisissez l'opération (+, _, *, / : ");

        //Récupération du choix de l'opération au clavier par l'utilisateur
        operation = scanner.nextLine();

        //Utilisation de la structure switch-case pour exécuter l'opération correspondant au choix de l'utilisateur
        switch (operation)
        {
            case "+" :
                //Opération correspondante
                resultat = nombre1 + nombre2;
                System.out.println("Résultat : " + resultat);
                break;
            case "-" :
                //Opération correspondante
                resultat = nombre1 - nombre2;
                System.out.println("Résultat : " + resultat);
                break;
            case "*" :
                //Opération correspondante
                resultat = nombre1 * nombre2;
                System.out.println("Résultat : " + resultat);
                break;
            case "/" :
                try
                {
                    //Opération correspondante
                    if(nombre2 == 0)
                    {
                        throw new ArithmeticException("Impossible de diviser par zéro !");
                    }
                    resultat = nombre1 / nombre2;
                    System.out.println("Résultat : " + resultat);
                } catch (ArithmeticException err) {
                    err.printStackTrace(); // this will print the stack trace of the exception
                    System.exit(0); // Fin prématurée du programme si une erreur de saisie se produit
                } finally {
                    scanner.nextLine(); // Nettoyage du buffer d'entrée
                }

                break;
            default:
                System.out.println("Mauvaise opération");
                break;
        }

        //Fermer le scanner
        scanner.close();
    }
}