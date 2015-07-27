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

	public Station(int stationIdentity, String stationName, long stationTerminalName, float stationLatitude, float stationLongitude, boolean stationInstalled, boolean stationLocked, long stationInstallDate, long stationRemovalDate, boolean stationTemporaryStatus, int stationNumberOfBikes, int stationNumberOfEmptyDocks, int stationNumberOfDocks) {
		id = stationIdentity;
		name = stationName;
		terminalName = stationTerminalName;
		latitude = stationLatitude;
		longitude = stationLongitude;
		installed = stationInstalled;
		locked = stationLocked;
		installDate = stationInstallDate;
		removalDate = stationRemovalDate;
		temporaryStatus = stationTemporaryStatus;
		numberOfBikes = stationNumberOfBikes;
		numberOfEmptyDocks = stationNumberOfEmptyDocks;
		numberOfDocks = stationNumberOfDocks;
	}

	public int getStationIdentity() {
		return id;
	}

	public String getStationName() {
		return name;
	}

	public long getStationTerminalName() {
		return terminalName;
	}

	public float getStationLatitude() {
		return latitude;
	}

	public float getStationLongitude() {
		return longitude;
	}

	public boolean isStationInstalled() {
		return installed;
	}

	public boolean isStationLocked() {
		return locked;
	}

	public long getStationInstallDate() {
		return installDate;
	}

	public long getStationRemovalDate() {
		return removalDate;
	}

	public boolean isStationTemporaryStatus() {
		return temporaryStatus;
	}

	public int getStationNumberOfBikes() {
		return numberOfBikes;
	}

	public int getStationNumberOfEmptyDocks() {
		return numberOfEmptyDocks;
	}

	public int getStationNumberOfDocks() {
		return numberOfDocks;
	}

}
