package semana1.viernes;

class Animal{
    String color = "Blanco";
    void eat(){
        System.out.printf("\nComiendo...");
    }

    Animal(){
        System.out.println("Se crea un animal");
    }
}

class Gato extends Animal{
    String color = "Cafe";

    void printColor(){
        System.out.printf("Color gato: "+color);
        System.out.printf("\nColor animal: "+super.color);
    }

    void eat(){
        System.out.println("\nCome atún");
    }

    void sleep(){
        System.out.println("\nYa se durmio el michi");
    }

    void call(){
        super.eat();
        sleep();
    }

    Gato(){
        super();
        System.out.println("Se ha creado un gato");
    }
}

public class Polimorfismo {
    public static void main(String[] args) {
        /*new Gato().printColor();
        new Gato().call();
        new Gato();*/
        Animal dander;
        dander = new Animal();
        dander.eat();
        dander = new Dog();
        dander.eat();
        dander = new Puppy();
        dander.eat();
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("Comiendo croquetas");
    }
}

class Puppy extends Animal{
    void eat(){
        System.out.println("Tomando awa uwu");
    }
}