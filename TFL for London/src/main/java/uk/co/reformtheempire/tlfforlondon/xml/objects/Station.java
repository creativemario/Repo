package uk.co.reformtheempire.tlfforlondon.xml.objects;

import org.jdom2.Element;

import ch.mather.quicklogger.impl.Logger;
import ch.mather.quicklogger.impl.LoggerFactory;

public class Station {

	private int id;
	private String name;
	private long terminalName;
	private double latitude;
	private double longitude;
	private boolean installed;
	private boolean locked;
	private long installDate;
	private long removalDate;
	private boolean temporary;
	private int numberOfBikes;
	private int numberOfEmptyDocks;
	private int numberOfDocks;

	private Logger LOG;
	
	public Station(int id, String name, long terminalName, double latitude, double longitude, boolean installed, boolean locked, long installDate, long removalDate, boolean temporary, int numberOfBikes, int numberOfEmptyDocks, int numberOfDocks) {
		LOG = LoggerFactory.getLogger(this);
		this.id = id;
		this.name = name;
		this.terminalName = terminalName;
		this.latitude = latitude;
		this.longitude = longitude;
		this.installed = installed;
		this.locked = locked;
		this.installDate = installDate;
		this.removalDate = removalDate;
		this.temporary = temporary;
		this.numberOfBikes = numberOfBikes;
		this.numberOfEmptyDocks = numberOfEmptyDocks;
		this.numberOfDocks = numberOfDocks;
	}

	public Station(Element stationElement) {
		LOG = LoggerFactory.getLogger(this);
		this.id = Integer.parseInt(stationElement.getChildText("id"));
		this.name = stationElement.getChildText("name");
		this.terminalName = Long.parseLong(stationElement.getChildText("terminalName"));
		this.latitude =  Double.parseDouble(stationElement.getChildText("lat"));
		this.longitude = Double.parseDouble(stationElement.getChildText("long"));
		this.installed = Boolean.parseBoolean(stationElement.getChildText("installed"));
		this.locked = Boolean.parseBoolean(stationElement.getChildText("locked"));
		
		try{
			this.installDate =  Long.parseLong(stationElement.getChildText("installDate"));
		}catch (NumberFormatException e){
			LOG.error("No Install Date", e);
		}
		
		try{
			this.removalDate =  Long.parseLong(stationElement.getChildText("removalDate"));			
		}catch (NumberFormatException e){
			LOG.error("No Removal Date", e);
		}
		
		this.temporary = Boolean.parseBoolean(stationElement.getChildText("temporary"));
		this.numberOfBikes = Integer.parseInt(stationElement.getChildText("nbBikes"));
		this.numberOfEmptyDocks = Integer.parseInt(stationElement.getChildText("nbEmptyDocks"));
		this.numberOfDocks = Integer.parseInt(stationElement.getChildText("nbDocks"));
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

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
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
		return temporary;
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

	@Override
    public String toString() {
	    return "Station [id=" + id + ", name=" + name + ", terminalName=" + terminalName + ", latitude=" + latitude + ", longitude=" + longitude + ", installed=" + installed + ", locked=" + locked + ", installDate=" + installDate + ", removalDate=" + removalDate + ", temporary=" + temporary + ", numberOfBikes=" + numberOfBikes + ", numberOfEmptyDocks=" + numberOfEmptyDocks + ", numberOfDocks=" + numberOfDocks + "]";
    }

	
	
}