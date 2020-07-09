package models;

public class Camera {

	public static final int BATTERY_CAPACITY_IN_MILLIAMPERES = 6000;

	private String producerName;

	private int memoryCapacityInMegabytes;

	private int zoomRatio;

	private int pixelCountInMegaPixels;

	private String componentsOfInterfaceOfCamera;

	protected String countryOfProduction;

	protected String colourOfCamera;

	public String getProducerName() {
		return producerName;
	}

	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}

	public Camera() {
	}

	public int getMemoryCapacityInMegabytes() {
		return memoryCapacityInMegabytes;
	}

	public void setMemoryCapacityInMegabytes(int memoryCapacityInMegabytes) {
		this.memoryCapacityInMegabytes = memoryCapacityInMegabytes;
	}

	public int getZoomRatio() {
		return zoomRatio;
	}

	public void setZoomRatio(int zoomRatio) {
		this.zoomRatio = zoomRatio;
	}

	public int getPixelCountInMegaPixels() {
		return pixelCountInMegaPixels;
	}

	public void setPixelCountInMegaPixels(int pixelCountInMegaPixels) {
		this.pixelCountInMegaPixels = pixelCountInMegaPixels;
	}

	public String getComponentsOfInterfaceOfCamera() {
		return componentsOfInterfaceOfCamera;
	}

	public void setComponentsOfInterfaceOfCamera(String componentsOfInterfaceOfCamera) {
		this.componentsOfInterfaceOfCamera = componentsOfInterfaceOfCamera;
	}

	public String getCountryOfProduction() {
		return countryOfProduction;
	}

	public void setCountryOfProduction(String countryOfProduction) {
		this.countryOfProduction = countryOfProduction;
	}

	public String getColourOfCamera() {
		return colourOfCamera;
	}

	public void setColourOfCamera(String colourOfCamera) {
		this.colourOfCamera = colourOfCamera;
	}

	public Camera(String producerName, int memoryCapacityInMegabytes, int zoomRatio, int pixelCountInMegaPixels) {
		this.producerName = producerName;
		this.memoryCapacityInMegabytes = memoryCapacityInMegabytes;
		this.zoomRatio = zoomRatio;
		this.pixelCountInMegaPixels = pixelCountInMegaPixels;
	}

	public Camera(String producerName, int memoryCapacityInMegabytes, int zoomRatio, int pixelCountInMegaPixels,
			String componentsOfInterfaceOfCamera, String countryOfProduction, String colourOfCamera) {
		this(producerName, memoryCapacityInMegabytes, zoomRatio, pixelCountInMegaPixels);
		this.componentsOfInterfaceOfCamera = componentsOfInterfaceOfCamera;
		this.countryOfProduction = countryOfProduction;
		this.colourOfCamera = colourOfCamera;
	}

	public void resetValues(String producerName, int memoryCapacityInMegabytes, int zoomRatio,
			int pixelCountInMegaPixels, String componentsOfInterfaceOfCamera, String countryOfProduction,
			String colourOfCamera) {
		this.producerName = producerName;
		this.memoryCapacityInMegabytes = memoryCapacityInMegabytes;
		this.zoomRatio = zoomRatio;
		this.pixelCountInMegaPixels = pixelCountInMegaPixels;
		this.componentsOfInterfaceOfCamera = componentsOfInterfaceOfCamera;
		this.countryOfProduction = countryOfProduction;
		this.colourOfCamera = colourOfCamera;
	}

	@Override
	public String toString() {
		return "Camera [producerName=" + producerName + ", memoryCapacityInMegabytes=" + memoryCapacityInMegabytes
				+ ", zoomRatio=" + zoomRatio + ", pixelCountInMegaPixels=" + pixelCountInMegaPixels
				+ ", componentsOfInterfaceOfCamera=" + componentsOfInterfaceOfCamera + ", countryOfProduction="
				+ countryOfProduction + ", colourOfCamera=" + colourOfCamera + "]";
	}

	public static void PrintStaticBatteryCapacityInMilliamperes() {
		System.out.println(BATTERY_CAPACITY_IN_MILLIAMPERES);
	}

	public void PrintBatteryCapacityInMilliamperes() {
		System.out.println(BATTERY_CAPACITY_IN_MILLIAMPERES);
	}
}
