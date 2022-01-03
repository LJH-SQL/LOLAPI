package com.my_project.model;

import lombok.*;

@Data
public class SummonerDTO {
	private String id;
	private String accountId;
	private String puuid;
	private String name;
	private int profileIconId;
	private long revisionDate;
	private long summonerLevel;
}
