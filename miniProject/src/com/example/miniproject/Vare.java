package com.example.miniproject;

public class Vare {
	private String navn;
	private int volume;
	private double pris;
	private VolumeUnit volumeUnit;

	public Vare() {

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
	public synchronized final VolumeUnit getVolumeUnit() {
		return volumeUnit;
	}

	/**
	 * @param volumeUnit
	 *            the volumeUnit to set
	 */
	public synchronized final void setVolumeUnit(VolumeUnit volumeUnit) {
		this.volumeUnit = volumeUnit;
	}

	/**
	 * 
	 * @param navn
	 * @param volume
	 * @param pris
	 * @param volumeUnit
	 */
	public Vare(String navn, int volume, double pris,
			com.example.miniproject.VolumeUnit volumeUnit) {
		this.navn = navn;
		this.volume = volume;
		this.pris = pris;
		this.volumeUnit = volumeUnit;
	}

	@Override
	public String toString() {
		return this.navn;
	}
}
