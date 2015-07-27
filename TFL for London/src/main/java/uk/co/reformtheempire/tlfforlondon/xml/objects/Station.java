package uk.co.reformtheempire.tlfforlondon.xml.objects;

public class Station {

	private int id;
	private String name;
	private long terminalName;
	private float latitude;
	private float longitude;
	private boolean installed;
	private boolean locked;
	private long installDate;
	private long removalDate;
	private boolean temporaryStatus;
	private int numberOfBikes;
	private int numberOfEmptyDocks;
	private int numberOfDocks;

	public Station(int id, String name, long terminalName, float latitude, float longitude, boolean installed, boolean locked, long installDate, long removalDate, boolean temporaryStatus, int numberOfBikes, int numberOfEmptyDocks, int numberOfDocks) {
		this.id = id;
		this.name = name;
		this.terminalName = terminalName;
		this.latitude = latitude;
		this.longitude = longitude;
		this.installed = installed;
		this.locked = locked;
		this.installDate = installDate;
		this.removalDate = removalDate;
		this.temporaryStatus = temporaryStatus;
		this.numberOfBikes = numberOfBikes;
		this.numberOfEmptyDocks = numberOfEmptyDocks;
		this.numberOfDocks = numberOfDocks;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public long getTerminalName() {
		return terminalName;
	}

	public float getLatitude() {
		return latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public boolean isInstalled() {
		return installed;
	}

	public boolean isLocked() {
		return locked;
	}

	public long getInstallDate() {
		return installDate;
	}

	public long getRemovalDate() {
		return removalDate;
	}

	public boolean isTemporaryStatus() {
		return temporaryStatus;
	}

	public int getNumberOfBikes() {
		return numberOfBikes;
	}

	public int getNumberOfEmptyDocks() {
		return numberOfEmptyDocks;
	}

	public int getNumberOfDocks() {
		return numberOfDocks;
	}

}