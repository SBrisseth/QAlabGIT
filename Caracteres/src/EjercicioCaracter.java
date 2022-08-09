import java.util.Scanner;

public class EjercicioCaracter {
    public static void main(String[] args){
        Scanner cmd = new Scanner(System.in);
        String palabra ="";
        String frase1="",frase2="",frase3="";
        System.out.println("Ingrese frase:" );
        palabra = cmd.nextLine();
        //usamos el metodos String#split
        String[] parts = palabra.split(" ");
        String part1 = parts[0];
        String part2 = parts[1];
        String part3 = parts[2];

        frase1 = part1;
        frase2 = part2;
        frase3 = part3;

        System.out.println("Frase1:" + frase1);
        System.out.println("Longitud:" + frase1.length());
        System.out.println("Frase2:" + frase2);
        System.out.println("Longitud:" + frase2.length());
        System.out.println("Frase3:" + frase3);
        System.out.println("Longitud:" + frase3.length());

    }
}
