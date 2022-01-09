package Template.Database;

public abstract class ConnectionTemplate {

    //Sırasını belirleyen metodumuzu:
    public final void run(){
        setDbDriver();
        setUserLogin();
        connect();
        setData();
        //... Adımları yazarız.
    }

    //alt sınıflarda olması gereken zorunlu adımlar.
    public abstract void setDbDriver();
    public abstract void setUserLogin();
    public  abstract void setData();

    public void connect(){
        System.out.println("bağlandı");
    }


}
