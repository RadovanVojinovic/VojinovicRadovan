package potrosnjaGoriva;

//TODO Auto-generated method stub
public class Test {
public static void main(String[] args) {
Vozilo vozilo1 = new Vozilo("Opel", "Astra", 2004, "Benzin");
Vozac vozac1 = new Vozac("Marko Olujic",39,1233);

System.out.println(vozilo1.toString());
System.out.println(vozac1.toString());

Kamion kamion1 = new Kamion("MAN", "330", 2018, "Dizel");
System.out.println(kamion1.toString());
System.out.println("Cena goriva na 100 km: " + vozilo1.potrosnjaGoriva(400));
System.out.println("Cena goriva na 100 km: " + kamion1.potrosnjaGoriva(400));
}
}

