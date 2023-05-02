package it.epicode.be;

import java.util.Arrays;
import java.util.Scanner;

public class Helloworld {

    public static void main(String[] args) {
        System.out.println("This is my first Epicode Java Project!");
        
        int a = 5;
        int b = 8;
        int prodotto = Moltiplica(a, b);
        System.out.println("Il prodotto di " + a + " e " + b + " è " + prodotto);
        
        String s = "gatti";
        int n = 44;
        String concatenazione = Concatena(s, n);
        System.out.println("Concatenazione: " + concatenazione);
        
        String arrayDiPartenza [] = {"Simone", "Francesca", "Marco", "Gianni", "Daniela"};
        String stringaDaInserire = "Ajeje";
        String newArray [] = InserisciInArray(arrayDiPartenza, stringaDaInserire);
        System.out.println("Array di partenza: " + Arrays.toString(arrayDiPartenza));
        System.out.println("Stringa da inserire: " + stringaDaInserire);
        System.out.println("Nuovo array: " + Arrays.toString(newArray));
        
        InserisciEConcatena();
        
        double lunghezza = 5.2;
        double larghezza = 3.1;
        double perimetro = PerimetroRettangolo(lunghezza, larghezza);
        System.out.println("Il perimetro del rettangolo è: " + perimetro);
        
        int numero = 17;
        int risultato = PariDispari(numero);
        System.out.println("Il numero " + numero + " è " + (risultato == 0 ? "pari" : "dispari"));
        
        double lato1 = 2.2;
        double lato2 = 3.2;
        double lato3 = 2.8;
        double area = AreaTriangolo(lato1, lato2, lato3);
        System.out.println("L'area del triangolo è: " + area);
        
    }
    
    public static int Moltiplica(int x, int y) {
        return x * y;
    }
    
    public static String Concatena(String s, int n) {
        String numeroStringa = Integer.toString(n);
        return s + numeroStringa;
    }

    
    public static String [] InserisciInArray(String[] arrayDiStringhe, String nuovaStringa) {
        String newArray [] = new String[6];
        for (int i = 0; i < 3; i++) {
            newArray[i] = arrayDiStringhe[i];
        }
        newArray[3] = nuovaStringa;
        newArray[4] = arrayDiStringhe[3];
        newArray[5] = arrayDiStringhe[4];
        return newArray;
    }
    
    public static void InserisciEConcatena() {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci la prima stringa: ");
        String primaStringa = input.nextLine();

        System.out.print("Inserisci la seconda stringa: ");
        String secondaStringa = input.nextLine();

        System.out.print("Inserisci la terza stringa: ");
        String terzaStringa = input.nextLine();

        String concatOrdinata = primaStringa + secondaStringa + terzaStringa;
        System.out.println("Concatenazione in ordine di inserimento: " + concatOrdinata);

        String concatInversa = terzaStringa + secondaStringa + primaStringa;
        System.out.println("Concatenazione in ordine inverso: " + concatInversa);
        
        input.close();
    }
    
    public static double PerimetroRettangolo(double lunghezza, double larghezza) {
        double perimetro = 2 * (lunghezza + larghezza);
        return perimetro;
    }
    
    public static int PariDispari(int numero) {
        if (numero % 2 == 0) {
            return 0;  
        } else {
            return 1;
        }
    }
    
    public static double AreaTriangolo(double lato1, double lato2, double lato3) {
        double semiPerimetro = (lato1 + lato2 + lato3) / 2.0;

        double area = Math.sqrt(semiPerimetro * (semiPerimetro - lato1) * (semiPerimetro - lato2) * (semiPerimetro - lato3));

        return area;
    }



}



