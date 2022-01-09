package Singleton;

public class Singleton {
    /*
    * Singleton: Bir nesneyi sadece Bir kere yaratibelecğimiz başka yaratmayacağımızı bir tasarım desenidir.
    * Mesele DataBase gibi
    */

    public static void main(String[] args) {
        Database.DatabaseOlustur().Dbyaz("Db oluşturdu");
    }
}
