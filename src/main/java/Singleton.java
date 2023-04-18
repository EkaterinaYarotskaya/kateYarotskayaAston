package main.java;

public class Singleton {

    private static Singleton instanсe;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if ((instanсe == null)) {
            instanсe = new Singleton();
        }
        return instanсe;
    }
}