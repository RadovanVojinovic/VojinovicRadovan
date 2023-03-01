package potrosnjaGoriva;
public class Vozac {
	    private String ime;
	    private int godine;
	    private int brojDozvole;
	    
	    public Vozac() {
	    	
	    }
	    
	    public Vozac(String ime, int godine, int brojDozvole) {
	        this.ime = ime;
	        this.godine = godine;
	        this.brojDozvole = brojDozvole;
	    }
	    
	    public String getIme() {
	        return ime;
	    }
	    
	    public void setIme(String ime) {
	        this.ime = ime;
	    }
	    
	    public int getGodine() {
	        return godine;
	    }
	    
	    public void setGodine(int godine) {
	        this.godine = godine;
	    }
	    
	    public int getBrojDozvole() {
	        return brojDozvole;
	    }
	    
	    public void setBrojDozvole(int brojDozvole) {
	        this.brojDozvole = brojDozvole;
	    }
	    
	    @Override
	    public String toString() {
	        return "Vozac (ime = " + ime + ", godine = " + godine + ", brojDozvole = " + brojDozvole + ")";
	    }
	}
