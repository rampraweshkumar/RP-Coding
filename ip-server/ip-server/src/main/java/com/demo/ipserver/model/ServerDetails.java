package com.demo.ipserver.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ServerDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int serverId;
	private String serverName;
	private String serverIp;
	private String serverRegion;
	private String serverStatus;
	
	public int getServerId() {
		return serverId;
	}
	public void setServerId(int serverId) {
		this.serverId = serverId;
	}
	public String getServerName() {
		return serverName;
	}
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	public String getServerIp() {
		return serverIp;
	}
	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}
	public String getServerRegion() {
		return serverRegion;
	}
	public void setServerRegion(String serverRegion) {
		this.serverRegion = serverRegion;
	}
	public String getServerStatus() {
		return serverStatus;
	}
	public void setServerStatus(String serverStatus) {
		this.serverStatus = serverStatus;
	}
	
}
