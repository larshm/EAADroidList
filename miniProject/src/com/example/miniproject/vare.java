public class vare {
	private String navn;
	private int mængde;
	private double pris;
	private mængdeenhed mængdeenhed;

	
	public vare(){
		
	}

	public vare(String navn, int mængde, double pris, mængdeenhed mængdeenhed) {
		this.navn = navn;
		this.mængde = mængde;
		this.pris = pris;
		this.mængdeenhed = mængdeenhed;
	}

	public synchronized final String getNavn() {
		return navn;
	}

	public synchronized final void setNavn(String navn) {
		this.navn = navn;
	}

	public synchronized final int getMængde() {
		return mængde;
	}

	public synchronized final void setMængde(int mængde) {
		this.mængde = mængde;
	}

	public synchronized final double getPris() {
		return pris;
	}

	public synchronized final void setPris(double pris) {
		this.pris = pris;
	}

	public synchronized final mængdeenhed getMængdeenhed() {
		return mængdeenhed;
	}

	public synchronized final void setMængdeenhed(mængdeenhed mængdeenhed) {
		this.mængdeenhed = mængdeenhed;
	}
}
