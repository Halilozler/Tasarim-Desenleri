package Composite;

import Composite.Sirket.CompanyDirectory;
import Composite.Sirket.Developer;
import Composite.Sirket.Manager;

public class Composite {
    public static void main(String[] args) {
        /*
        *   Composite: Bir sınıfı tüm alt sınıflarını oluşturabilir ve böylece alt sınıflarına nesneymiş gibi ulaşabiliriz.
        */

        /*      örnek-1(Sirket)
        * Bir Şirket var. Çalışanların(Employee) altında, Developer ve Managerlar bulunmakta.
        * Burada üst sınıfımız employee.
        */
        Developer d1 = new Developer("ad","yazılımcı",1);
        Developer d2 = new Developer("ad","yazılımcı",2);

        CompanyDirectory eng_D = new CompanyDirectory();
        eng_D.addEmployee(d1);
        eng_D.addEmployee(d2);
        eng_D.EmployeDetails();
        //1adyazılımcı
        //2adyazılımcı çıkıyor karşımıza.

        Manager m1 = new Manager("ad", "manager",1);
        Manager m2 = new Manager("ad", "manager",2);

        CompanyDirectory mng_D = new CompanyDirectory();
        mng_D.addEmployee(m1);
        mng_D.addEmployee(m2);

        CompanyDirectory companyDirectory = new CompanyDirectory();
        companyDirectory.addEmployee(eng_D);
        companyDirectory.addEmployee(mng_D);
        companyDirectory.EmployeDetails();
        //1adyazılımcı
        //2adyazılımcı
        //1admanager
        //2admanager çıktılarını alıyoruz.

    }
}
