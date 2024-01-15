import java.io.*;
import java.lang.*;
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

        // Création d'un objet inputStreamReader
        InputStreamReader lecteur = new InputStreamReader(System.in);

        // Création d'un objet bufferedReader lié à l'objet inputStreamReader
        BufferedReader entree = new BufferedReader(lecteur);

        //Demande à l'utilisateur de saisir le premier nombre au clavier
        System.out.println("Entrez le premier nombre :");

        try
        {
            //Récupération du nombre saisi au clavier par l'utilisateur
            nombre1 = scanner.nextDouble();
        }
        catch (NumberFormatException err)
        {
           System.out.println("Mauvais type de données !");
        }

        //Demande à l'utilisateur de saisir le deuxième nombre au clavier
        System.out.println("Entrez le deuxième nombre :");

        try
        {
            //Récupération du nombre saisi au clavier par l'utilisateur
            nombre2 = scanner.nextDouble();
        }
        catch (NumberFormatException err)
        {
            System.out.println("Mauvais type de données !");
            err.printStackTrace(); // this will print the stack trace of the exception
        }

        //Demande à l'utilisateur de choisir l'opération
        System.out.println("Choisissez l'opération (+, _, *, / : ");

        //Récupération du choix de l'opération au clavier par l'utilisateur
        operation = entree.readLine();

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
                    resultat = nombre1 / nombre2;
                    System.out.println("Résultat : " + resultat);
                }
                catch (ArithmeticException err)
                {
                    System.out.println("Impossible de diviser par zéro !");
                }
                break;
            default:
                System.out.println("Mauvaise opération");
                break;
        }
    }
}