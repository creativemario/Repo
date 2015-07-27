package uk.co.reformtheempire.tlfforlondon.xml.objects;

public class Station {

	private int StationIdentity;

	private String StationName;

	private long StationTerminalName;

	private float StationLatitude;

	private float StationLongitude;

	private boolean StationInstalled;

	private boolean StationLocked;

	private long StationInstallDate;

	private long StationRemovalDate;

	private boolean StationTemporaryStatus;

	private int StationNumberOfBikes;

	private int StationNumberOfEmptyDocks;

	private int StationNumberOfDocks;

	public Station(int stationIdentity, String stationName, long stationTerminalName, float stationLatitude, float stationLongitude, boolean stationInstalled, boolean stationLocked, long stationInstallDate, long stationRemovalDate, boolean stationTemporaryStatus, int stationNumberOfBikes, int stationNumberOfEmptyDocks, int stationNumberOfDocks) {
		;
		StationIdentity = stationIdentity;
		StationName = stationName;
		StationTerminalName = stationTerminalName;
		StationLatitude = stationLatitude;
		StationLongitude = stationLongitude;
		StationInstalled = stationInstalled;
		StationLocked = stationLocked;
		StationInstallDate = stationInstallDate;
		StationRemovalDate = stationRemovalDate;
		StationTemporaryStatus = stationTemporaryStatus;
		StationNumberOfBikes = stationNumberOfBikes;
		StationNumberOfEmptyDocks = stationNumberOfEmptyDocks;
		StationNumberOfDocks = stationNumberOfDocks;
	}

	public int getStationIdentity() {
		return StationIdentity;
	}

	public String getStationName() {
		return StationName;
	}

	public long getStationTerminalName() {
		return StationTerminalName;
	}

	public float getStationLatitude() {
		return StationLatitude;
	}

	public float getStationLongitude() {
		return StationLongitude;
	}

	public boolean isStationInstalled() {
		return StationInstalled;
	}

	public boolean isStationLocked() {
		return StationLocked;
	}

	public long getStationInstallDate() {
		return StationInstallDate;
	}

	public long getStationRemovalDate() {
		return StationRemovalDate;
	}

	public boolean isStationTemporaryStatus() {
		return StationTemporaryStatus;
	}

	public int getStationNumberOfBikes() {
		return StationNumberOfBikes;
	}

	public int getStationNumberOfEmptyDocks() {
		return StationNumberOfEmptyDocks;
	}

	public int getStationNumberOfDocks() {
		return StationNumberOfDocks;
	}

}
