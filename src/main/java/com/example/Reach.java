package com.example;

/**
 *
 * @author dmsibley
 */
public class Reach {
	
	private final String reachName;
	private final String upstreamStation;
	private final String upstreamDisplayName;
	private final String downstreamStation;
	private final String downstreamDisplayName;
	private final String downstreamDischargeStation;
	private final String downstreamDischargeName;
	private final String network;
	private final String displayOrder;

	public Reach() {
		this.reachName = null;
		this.upstreamStation = null;
		this.upstreamDisplayName = null;
		this.downstreamStation = null;
		this.downstreamDisplayName = null;
		this.downstreamDischargeStation = null;
		this.downstreamDischargeName = null;
		this.network = null;
		this.displayOrder = null;
	}
	
	public Reach(String reachName, String upstreamStation, String upstreamDisplayName, String downstreamStation, String downstreamDisplayName, String downstreamDischargeStation, String downstreamDischargeName, String network, String displayOrder) {
		this.reachName = reachName;
		this.upstreamStation = upstreamStation;
		this.upstreamDisplayName = upstreamDisplayName;
		this.downstreamStation = downstreamStation;
		this.downstreamDisplayName = downstreamDisplayName;
		this.downstreamDischargeStation = downstreamDischargeStation;
		this.downstreamDischargeName = downstreamDischargeName;
		this.network = network;
		this.displayOrder = displayOrder;
	}

	public String getReachName() {
		return reachName;
	}

	public String getUpstreamStation() {
		return upstreamStation;
	}

	public String getUpstreamDisplayName() {
		return upstreamDisplayName;
	}

	public String getDownstreamStation() {
		return downstreamStation;
	}

	public String getDownstreamDisplayName() {
		return downstreamDisplayName;
	}

	public String getDownstreamDischargeName() {
		return downstreamDischargeName;
	}

	public String getDownstreamDischargeStation() {
		return downstreamDischargeStation;
	}

	public String getNetwork() {
		return network;
	}

	public String getDisplayOrder() {
		return displayOrder;
	}
	
	
	
}
