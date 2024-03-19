package IplCoreStats;

import java.util.List;
import java.util.Map;

public class IplStatManager {
    public static void main(String[] args) {

        IplStatsService iplStatsService = new IplStatsServiceImp();
        // 1. Get team names
        List<String> teamNames = iplStatsService.teamNames();
        System.out.println("Team names : "+teamNames);
        // 2. Get players by team name
        String teamName = "RCB";
        List<Player> players = iplStatsService.playersByTeam(teamName);
        System.out.println("The team "+teamName+" has "+players.size()+" players");

        // 3. Get role count by team name
        List<TeamRoleAmountRecord> teamRoleCountRecords = iplStatsService.roleCountByTeam(teamName);
        System.out.println("Role count by team : "+teamRoleCountRecords);

        //4.Role amount by team
        List<TeamRoleAmountRecord> teamRoleAmountRecords = iplStatsService.roleAmountByTeam(teamName);
        System.out.println("Role amount by team : "+teamRoleAmountRecords);

        //5. get amount by team
        List<TeamAmountRecord> amountByTeam = iplStatsService.amountByTeam();
        System.out.println("Amount by team : "+amountByTeam);

        //6. Get player count of each team
        List<TeamCountRecord> teamCount = iplStatsService.playerCountOfEachTeam();
        System.out.println("The player count of each team is " +teamCount);

        //7.Get top paid player of each team
        Map<String, List<Player>> topPaidPlayer = iplStatsService.getTopPaidPlayersOfEachTeam();
        System.out.println("The top Paid player of each team is " +topPaidPlayer);

        //8. get Top paid player
        List<Player> topPaid = iplStatsService.getTopPaidPlayers();
        System.out.println("The top paid player or players are " +topPaid);

        //9. Get top paid n players
        int n = 4;
        List<Player> topPaidNPlayers = iplStatsService.getTopPaidPlayers(n);
        System.out.println("The top paid N players are " +topPaidNPlayers);
    }
}
