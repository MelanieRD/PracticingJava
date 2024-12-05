public class Main{
    public static void main(String[] args){

          // Metodo que sumen dos numeros
        sumMethod(10, 30);

        //Metodos para iterar una cadena con forEach;
        String nombre = "MelanieHernandez";
        //forEachStringLetter(nombre);
        //System.out.println(nombre.toCharArray());

        // Otra forma con forEach (expresion lambda)
        nombre.chars().forEach(c -> System.out.println((char) c));


       
    }

    static void sumMethod(int num1, int num2){
        System.out.println( num1+num2);
    }

    static void forEachStringLetter(String string){
        for(char letter : string.toCharArray()){ System.out.println(letter);} ;
    }
}

// Scanner Class found in java.util package
//Javac Main.java compila nuestro codigo