package potrosnjaGoriva;
public class Vozilo {
    private String marka;
    private String model;
    private int godiste;
    private String tipGoriva;
    private double potrosnja;
    
    public Vozilo() {
    	
    }
    
    public Vozilo(String marka, String model, int godiste,String tipGoriva,double prosecnaPotrosnja) {
        this.marka = marka;
        this.model = model;
        this.godiste = godiste;
        this.tipGoriva = tipGoriva;
        this.potrosnja = potrosnja;
    }
    
	public String getMarka() {
        return marka;
    }
    
    public void setMarka(String marka) {
        this.marka = marka;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public int getGodiste() {
        return godiste;
    }
    
    public void setGodiste(int godiste) {
        this.godiste = godiste;
    }
    public String getTipGoriva() {
		return tipGoriva;
	}

	public void setTipGoriva(String tipGoriva) {
		this.tipGoriva = tipGoriva;
	}

    
	 public double getPotrosnja() {
		return potrosnja;
	}

	public void setPotrosnja(double potrosnja) {
		this.potrosnja = potrosnja;
	}

	public double potrosnjaGoriva(double predjeniKilometri) {
	        double cenaGoriva = 0;
	        switch (tipGoriva) {
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
	        double potrosenoGorivo = (predjeniKilometri / 100) * 8; 
	        return potrosenoGorivo * cenaGoriva;
	    }
    
    @Override
    public String toString() {
        return "Vozilo (marka = " + marka + ", model = " + model + ", godiste = " + godiste + ", tip goriva = " + tipGoriva + ")";
    }
}
