package com.example.miniproject;

public class vare {
	private String navn;
	private int volume;
	private double pris;
	private volumeUnit volumeUnit;

	public vare() {

	}

	/**
	 * @return the navn
	 */
	public synchronized final String getNavn() {
		return navn;
	}

	/**
	 * @param navn
	 *            the navn to set
	 */
	public synchronized final void setNavn(String navn) {
		this.navn = navn;
	}

	/**
	 * @return the volume
	 */
	public synchronized final int getVolume() {
		return volume;
	}

	/**
	 * @param volume
	 *            the volume to set
	 */
	public synchronized final void setVolume(int volume) {
		this.volume = volume;
	}

	/**
	 * @return the pris
	 */
	public synchronized final double getPris() {
		return pris;
	}

	/**
	 * @param pris
	 *            the pris to set
	 */
	public synchronized final void setPris(double pris) {
		this.pris = pris;
	}

	/**
	 * @return the volumeUnit
	 */
	public synchronized final volumeUnit getVolumeUnit() {
		return volumeUnit;
	}

	/**
	 * @param volumeUnit
	 *            the volumeUnit to set
	 */
	public synchronized final void setVolumeUnit(volumeUnit volumeUnit) {
		this.volumeUnit = volumeUnit;
	}

	/**
	 * 
	 * @param navn
	 * @param volume
	 * @param pris
	 * @param volumeUnit
	 */
	public vare(String navn, int volume, double pris,
			com.example.miniproject.volumeUnit volumeUnit) {
		this.navn = navn;
		this.volume = volume;
		this.pris = pris;
		this.volumeUnit = volumeUnit;
	}

}
