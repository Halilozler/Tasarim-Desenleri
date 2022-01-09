package Singleton;

public class Database {
    //Burada bir Database nesnesi tanımlamamız lazım.
    //Çünkü: DatabaseOlustur() metodu ile içinde bulunan private db nesnesini oluşturmuş oluyoruz
    private static Database db;
    //static yapmamızın nedeni bellekte saklanmasını istmememiz böylece nesneye ulaşabiliriz.

    //bunu:
    //private static Database db = new Database();
    //Tarzında yaparsak Singleton Eager denir.

    //constructer private olmalıdır nesne oluşturmamamız için.
    private Database() {}

    public static Database DatabaseOlustur(){
        if (db == null){
            db = new Database();
        }
        return db;
    }

    public void Dbyaz(String text){
        System.out.println(text);
    }
}
