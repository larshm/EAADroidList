public class vare {
	private String navn;
	private int m�ngde;
	private double pris;
	private m�ngdeenhed m�ngdeenhed;

	
	public vare(){
		
	}

	public vare(String navn, int m�ngde, double pris, m�ngdeenhed m�ngdeenhed) {
		this.navn = navn;
		this.m�ngde = m�ngde;
		this.pris = pris;
		this.m�ngdeenhed = m�ngdeenhed;
	}

	public synchronized final String getNavn() {
		return navn;
	}

	public synchronized final void setNavn(String navn) {
		this.navn = navn;
	}

	public synchronized final int getM�ngde() {
		return m�ngde;
	}

	public synchronized final void setM�ngde(int m�ngde) {
		this.m�ngde = m�ngde;
	}

	public synchronized final double getPris() {
		return pris;
	}

	public synchronized final void setPris(double pris) {
		this.pris = pris;
	}

	public synchronized final m�ngdeenhed getM�ngdeenhed() {
		return m�ngdeenhed;
	}

	public synchronized final void setM�ngdeenhed(m�ngdeenhed m�ngdeenhed) {
		this.m�ngdeenhed = m�ngdeenhed;
	}
}
