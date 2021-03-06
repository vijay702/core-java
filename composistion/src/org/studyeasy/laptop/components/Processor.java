package org.studyeasy.laptop.components;

public class Processor {
	
	private String brand ;
	private String series;
	private int genaration;
	private int core;
	private int threads;
	private String cachememory;
	private String frequency;
	private String minFrequency;
	private String maxFrequency;
	public Processor() {
		
		this.brand = "intel";
		this.series = "6000u";
		this.genaration = 7;
		this.core = 2;
		this.threads = 4;
		this.cachememory = "3mb";
		this.frequency = "2.5ghz";
		this.minFrequency = "3.5ghz";
		this.maxFrequency = "12ghz";
		
	}
	public Processor(String brand, String series, int genaration, int core, int threads, String cachememory,
			String frequency, String minFrequency, String maxFrequency) {
		super();
		this.brand = brand;
		this.series = series;
		this.genaration = genaration;
		this.core = core;
		this.threads = threads;
		this.cachememory = cachememory;
		this.frequency = frequency;
		this.minFrequency = minFrequency;
		this.maxFrequency = maxFrequency;
	}
	@Override
	public String toString() {
		return "Processor [brand=" + brand + ", series=" + series + ", genaration=" + genaration + ", core=" + core
				+ ", threads=" + threads + ", cachememory=" + cachememory + ", frequency=" + frequency
				+ ", minFrequency=" + minFrequency + ", maxFrequency=" + maxFrequency + "]";
	}
	public String getBrand() {
		return brand;
	}
	public String getSeries() {
		return series;
	}
	public int getGenaration() {
		return genaration;
	}
	public int getCore() {
		return core;
	}
	public int getThreads() {
		return threads;
	}
	public String getCachememory() {
		return cachememory;
	}
	public String getFrequency() {
		return frequency;
	}
	public String getMinFrequency() {
		return minFrequency;
	}
	public String getMaxFrequency() {
		return maxFrequency;
	}
	
	
	

}
