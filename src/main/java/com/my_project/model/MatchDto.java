package com.my_project.model;
import java.util.List;
import lombok.*;

@Data
public class MatchDto {
	private MetadataDto metadata;
	private InfoDto info;
	@Data
	private class MetadataDto{
		private String dataVersion;
		private String matchId;
		List<String> participants;
	}
	@Data
	public class InfoDto{
		private long gameCreation;
		private long gameDuration;
		private long gameEndTimestamp;
		private long gameId	;
		private String gameMode;
		private String gameName	;
		private long gameStartTimestamp;
		private String gameType	;
		private String gameVersion;
		private int mapId;
		private List<participantDto> participants;	
		private String platformId;
		private int queueId;
		private List<TeamDto> teams;	
		private String tournamentCode;
		@Data
		public class participantDto{
			private int assists;
			private int baronKills;
			private int bountyLevel;
			private int champExperience;
			private int champLevel;
			private int championId;
			private String championName;	
			private int championTransform;
			private int consumablesPurchased;	
			private int damageDealtToBuildings;	
			private int damageDealtToObjectives;	
			private int damageDealtToTurrets;	
			private int damageSelfMitigated;	
			private int deaths;	
			private int detectorWardsPlaced;	
			private int	doubleKills;	
			private int dragonKills;	
			private boolean firstBloodAssist;	
			private boolean firstBloodKill;	
			private boolean firstTowerAssist;	
			private boolean firstTowerKill;	
			private boolean gameEndedInEarlySurrender;	
			private boolean gameEndedInSurrender;	
			private int goldEarned;	
			private int goldSpent;	
			private String individualPosition;
			private int inhibitorKills;	
			private int inhibitorTakedowns;	
			private int inhibitorsLost;	
			private int item0;	
			private int item1;	
			private int item2;	
			private int item3;	
			private int item4;	
			private int item5;	
			private int item6;	
			private int itemsPurchased;	
			private int killingSprees;	
			private int kills;	
			private String lane;	
			private int largestCriticalStrike;	
			private int largestKillingSpree;	
			private int largestMultiKill;	
			private int longestTimeSpentLiving;	
			private int magicDamageDealt;	
			private int magicDamageDealtToChampions;	
			private int magicDamageTaken;	
			private int neutralMinionsKilled;	
			private int nexusKills;	
			private int nexusTakedowns;	
			private int nexusLost;	
			private int objectivesStolen;	
			private int objectivesStolenAssists;	
			private int participantId;	
			private int pentaKills;	
			private PerkDto perks;	
			private int physicalDamageDealt;	
			private int physicalDamageDealtToChampions;	
			private int physicalDamageTaken;	
			private int profileIcon;	
			private String puuid;	
			private int quadraKills;	
			private String riotIdName;	
			private String riotIdTagline;	
			private String role;	
			private int sightWardsBoughtInGame;	
			private int spell1Casts;	
			private int spell2Casts;	
			private int spell3Casts;	
			private int spell4Casts;	
			private int summoner1Casts;	
			private int summoner1Id;	
			private int summoner2Casts;	
			private int summoner2Id;	
			private String summonerId;	
			private int summonerLevel;	
			private String summonerName;	
			private boolean teamEarlySurrendered;	
			private int teamId;	
			private String teamPosition;
			private int timeCCingOthers;	
			private int timePlayed;	
			private int totalDamageDealt;	
			private int totalDamageDealtToChampions;	
			private int totalDamageShieldedOnTeammates;	
			private int totalDamageTaken;	
			private int totalHeal;	
			private int totalHealsOnTeammates;	
			private int totalMinionsKilled;	
			private int totalTimeCCDealt;	
			private int totalTimeSpentDead;	
			private int totalUnitsHealed;	
			private int tripleKills;	
			private int trueDamageDealt;	
			private int trueDamageDealtToChampions;	
			private int trueDamageTaken;	
			private int turretKills;	
			private int turretTakedowns;	
			private int turretsLost;	
			private int unrealKills;	
			private int visionScore;	
			private int visionWardsBoughtInGame;	
			private int wardsKilled;	
			private int wardsPlaced;	
			private boolean win;
			@Data
			public class PerkDto{
				private PerkStatsDto statPerks;	
				private List<PerkStyleDto> styles;
				@Data
				public class PerkStatsDto{
					private int defense;	
					private int flex;		
					private int offense;
				}
				@Data
				public class PerkStyleDto{
					private String description;	
					private List<PerkStyleSelectionDto> selections;	
					private int style;
					@Data
					public class PerkStyleSelectionDto{
						private int perk;	
						private int var1;	
						private int var2;	
						private int var3;
					}
				}
			}
		}
		@Data
		public class TeamDto{
			private List<BanDto> bans;	
			private ObjectivesDto objectives;	
			private int	teamId;	
			private boolean	win;
			@Data
			public class BanDto{
				private int	championId;
				private int	pickTurn;
			}
			@Data
			public class ObjectivesDto{
				private ObjectiveDto baron;	
				private ObjectiveDto champion;	
				private ObjectiveDto dragon;	
				private ObjectiveDto inhibitor;	
				private ObjectiveDto riftHerald;	
				private ObjectiveDto tower;
				@Data
				public class ObjectiveDto{
					private boolean first;	
					private int kills;
				}
			}
		}
	}
}
