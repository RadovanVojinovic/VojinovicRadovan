package potrosnjaGoriva;
public class Kamion extends Vozilo {
    public Kamion(String marka, String model, int godiste,String tipGoriva) {
        super(marka, model, godiste,tipGoriva);
    }

    @Override
    public double potrosnjaGoriva(double predjeniKilometri) {
        double cenaGoriva = 0;
        switch (getTipGoriva()) {
            case "Benzin":
                cenaGoriva = 191;
                break;
            case "Dizel":
                cenaGoriva = 191;
                break;
            case "TNG":
                cenaGoriva = 100;
                break;
            default:
                System.out.println("Nepoznat tip goriva.");
                break;
        }
        double potrosenoGorivo = (predjeniKilometri / 100) * 16;
        return potrosenoGorivo * cenaGoriva;
    }
}