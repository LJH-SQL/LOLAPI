package com.my_project.model;

public class APIDTO {
/*
{
    "id": "5qtWLCQqE4jFbUZ9woaGwpRh_XIkKLSsFN-vsjsK1a12Ng",
    "accountId": "E9BX_qjari2Z1x0YfNwfNyBCjWyY1LBubi-TUp44NOEt",
    "puuid": "q4mReq0TIC252MF5078fNXGs__MZjjBNhfA71YhJjhhVhYZpRqAtb7G1TANfh5_qT8L7edl5GlkYEg",
    "name": "Hide on bush",
    "profileIconId": 6,
    "revisionDate": 1639217034000,
    "summonerLevel": 514
}
 */
	private String id;
	private String accountId;
	private String puuid;
	private String name;
	private int profileIconId;
	private long revisionDate;
	private long summonerLevel;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getPuuid() {
		return puuid;
	}
	public void setPuuid(String puuid) {
		this.puuid = puuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getProfileIconId() {
		return profileIconId;
	}
	public void setProfileIconId(int profileIconId) {
		this.profileIconId = profileIconId;
	}
	public long getRevisionDate() {
		return revisionDate;
	}
	public void setRevisionDate(long revisionDate) {
		this.revisionDate = revisionDate;
	}
	public long getSummonerLevel() {
		return summonerLevel;
	}
	public void setSummonerLevel(long summonerLevel) {
		this.summonerLevel = summonerLevel;
	}
	
}
