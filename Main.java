public class Main{
    public static void main(String[] args){

    Sword sword1 = new Sword();
    sword1.name = "The DragonFlame";
    sword1.damage = 59;

    System.out.println("La espada seleccionada es: "+ sword1.name + " con un daño de "+ sword1.damage);

    Axe axe = new Axe();
axe.damage = 100;
            System.out.println("Oh, un arbol.. Equipando "+ axe.type +" El damage es de "+ axe.damage);
            axe.talarArbol();
            

    //       // Metodo que sumen dos numeros
    //     //sumMethod(10, 30);

    //     //Metodos para iterar una cadena con forEach;
    //     String nombre = "MelanieHernandez";
    //     //forEachStringLetter(nombre);
    //     //System.out.println(nombre.toCharArray());

    //     // Otra forma con forEach (expresion lambda)
    //     // nombre.chars().forEach(c -> System.out.println((char) c));

    //         for(int i = 0 ; i < nombre.length(); i++ ){
    //             System.out.println(nombre.charAt(i));
    //         }
    //     // Arrays Iteracion

    //     String[] nombres = {"Melanie", "Delanie", "Virginia", "Daniel", "Maniga", "Luis"};

    //       //nombres.forEach(nombr -> System.out.println(nombr));

    //     for(String i : nombres){
    //         System.out.println(i);
    //     }



    // }

    // static void sumMethod(int num1, int num2){
    //     System.out.println( num1+num2);
    // }

    // static void forEachStringLetter(String string){
    //     for(char letter : string.toCharArray()){ System.out.println(letter);} ;
    }
}

// Scanner Class found in java.util package
//Javac Main.java compila nuestro codigo