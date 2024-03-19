package IplCoreStats;

import java.util.List;
import java.util.Map;

public interface IplStatsService {
    List<String> teamNames();
    List<Player> playersByTeam(String teamName);
    List<TeamRoleAmountRecord> roleCountByTeam(String teamName);
    List<TeamRoleAmountRecord> roleAmountByTeam(String teamName);
    List<TeamAmountRecord> amountByTeam();
    List<TeamCountRecord> playerCountOfEachTeam();
    Map<String,List<Player>> getTopPaidPlayersOfEachTeam();
    List<Player> getTopPaidPlayers();
    List<Player> getTopPaidPlayers(int n);
}
