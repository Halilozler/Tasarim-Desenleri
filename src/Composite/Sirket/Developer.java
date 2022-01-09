package Composite.Sirket;

public class Developer implements Employee{
    public String ad;
    public String pozisyon;
    public int id;

    public Developer(String ad, String pozisyon, int id){
        this.ad = ad;
        this.pozisyon = pozisyon;
        this.id = id;
    }
    @Override
    public void EmployeDetails() {
        System.out.println(id + ad + pozisyon);
    }
}
