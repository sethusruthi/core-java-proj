package IplCoreStats;

import java.util.*;
import java.util.stream.Collectors;

public class IplStatsServiceImp implements IplStatsService{
    private List<Player> players;

    public IplStatsServiceImp() {
        players = PlayerDataReaderUtil.loadPlayersData();
    }

    @Override
    public List<String> teamNames() {
        /*List<String> teamNames = new ArrayList<>();
        for (Player player : players) {
            if(!teamNames.contains(player.getTeam())) {
                teamNames.add(player.getTeam());
            }
        }
        return teamNames;*/

        return players.stream()
                .map(Player::getTeam)
                .distinct()
                .toList();
    }

    @Override
    public List<Player> playersByTeam(String teamName) {
        /*List<Player> teamPlayers = new ArrayList<>();
        for (Player player : players) {
            if(player.getTeam().equalsIgnoreCase(teamName)) {
                teamPlayers.add(player);
            }
        }
        return teamPlayers;*/
        return players.stream()
                .filter(player -> player.getTeam().equalsIgnoreCase(teamName))
                .toList();
    }

    @Override
    public List<TeamRoleAmountRecord> roleCountByTeam(String teamName) {
        List<Player> teamPlayers = playersByTeam(teamName);
        Map<String,Integer> roleCountMap = new HashMap<>();
        for (Player player : teamPlayers) {
            String role = player.getRole();
            roleCountMap.put(role,roleCountMap.getOrDefault(role,0)+1);
        }
        return getTeamRoleCountRecords(teamName, roleCountMap);
    }

    @Override
    public List<TeamRoleAmountRecord> roleAmountByTeam(String teamName) {
        List<TeamRoleAmountRecord> list = new ArrayList<>();
        List<Player> players = playersByTeam(teamName);
        Set<String> sets = new HashSet<>();
        for(Player p:players){
            sets.add(p.getRole());
        }
        for (String s: sets){
            double amount =0;
            for (Player p:players){
                if(s.equalsIgnoreCase(p.getRole())){
                    amount += p.getAmount();
                }
            }
            TeamRoleAmountRecord record = new TeamRoleAmountRecord(teamName, s, amount);
            list.add(record);
        }
        return list;
    }

    @Override
    public List<TeamAmountRecord> amountByTeam() {
        List<TeamAmountRecord> t = new ArrayList<>();
        List<String> teamNames = teamNames();
        for(String team:teamNames){
            double amount =0;
            List<Player> players = playersByTeam(team);
            for(Player p:players){
                amount+=p.getAmount();
            }
            TeamAmountRecord record = new TeamAmountRecord(team,amount);
            t.add(record);
        }
        return t;
    }

    @Override
    public List<TeamCountRecord> playerCountOfEachTeam() {
        List<TeamCountRecord> teamCount = new ArrayList<>();
        List<String> teams = teamNames();
        for(String t:teams) {
            List<Player> players = playersByTeam(t);
            TeamCountRecord teamCountRecord = new TeamCountRecord(t,players.size());
            teamCount.add(teamCountRecord);
        }
        return teamCount;
    }

    @Override
    public Map<String, List<Player>> getTopPaidPlayersOfEachTeam() {
        // Group the players by team
        Map<String,List<Player>> playerAndTeamMap = players.stream()
                .collect(Collectors.groupingBy(Player::getTeam));

        Map<String, List<Player>> topPaidPlayersMap = new HashMap<>();
        for (Map.Entry<String, List<Player>> entry : playerAndTeamMap.entrySet()) {
            List<Player> players = entry.getValue();
            double maxAmount = maxAmount(players);
            List<Player> topPaidPlayers = players.stream()
                    .filter(player -> player.getAmount() == maxAmount)
                    .toList();
            topPaidPlayersMap.put(entry.getKey(), topPaidPlayers);
        }
        return topPaidPlayersMap;
    }

    @Override
    public List<Player> getTopPaidPlayers() {
        double maxAmount = maxAmount(players);
        return players.stream()
                .filter(player -> player.getAmount() == maxAmount)
                .toList();
    }

    @Override
    public List<Player> getTopPaidPlayers(int n) {
        List<Player> playerList = new ArrayList<>();
        for (int i=0; i<n; i++){
            Player player = new Player();
            player.setAmount(0);
            playerList.add(player);
        }
        for (Player player: players){
            for(Player player1: playerList) {
                if(player.getAmount()>player1.getAmount()){
                    player1=player;
                }
            }
        }
        return playerList;
    }

    private void copyList(List<Player> newList, List<Player> players) {
        for (Player player:players) {
            Player newPlayer = new Player();
            copyPlayer(newPlayer,player);
            newList.add(newPlayer);
        }
    }

    private void copyPlayer(Player newPlayer, Player player) {
        newPlayer.setName(player.getName());
        newPlayer.setAmount(player.getAmount());
        newPlayer.setCountry(player.getCountry());
        newPlayer.setTeam(player.getTeam());
        newPlayer.setRole(player.getRole());
    }

    private static List<TeamRoleAmountRecord> getTeamRoleCountRecords(String teamName, Map<String, Integer> roleCountMap) {
        List<TeamRoleAmountRecord> teamRoleCountList =  new ArrayList<>();
        for (Map.Entry<String, Integer> entry : roleCountMap.entrySet()) {
            String roleName = entry.getKey();
            int count = entry.getValue();
            TeamRoleAmountRecord teamRoleCountDto = new TeamRoleAmountRecord(teamName, roleName, count);
            teamRoleCountList.add(teamRoleCountDto);
        }
        return teamRoleCountList;
    }

    private double maxAmount(List<Player> players) {
        return players.stream()
                .mapToDouble(Player::getAmount)
                .max()
                .orElse(0);
    }



}
