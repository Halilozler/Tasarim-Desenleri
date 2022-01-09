package Composite.Sirket;

public class Manager implements Employee{
    public String ad;
    public String pozisyon;
    public int id;

    public Manager(String ad, String pozisyon, int id){
        this.ad = ad;
        this.pozisyon = pozisyon;
        this.id = id;
    }

    @Override
    public void EmployeDetails() {
        System.out.println(id + ad + pozisyon);
    }
}
