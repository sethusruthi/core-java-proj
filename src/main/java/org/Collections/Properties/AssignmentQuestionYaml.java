package org.Collections.Properties;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import org.Collections.Yaml.ReadingPlayerData;
import org.yaml.snakeyaml.Yaml;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Data
class Player{
    private String name;
    private String role;
    private String team;
    private double amount;
    private String country;
}
public class AssignmentQuestionYaml {
    public static void main(String[]args){
        List<Player> players = getPlayerDetails();
        players.forEach(System.out::println);
    }
    public static List<Player> getPlayerDetails() {

        // Read the players.yaml file and return the list of players
        Yaml yaml = new Yaml();
        ObjectMapper mapper = new ObjectMapper();
        List<Player> players = new ArrayList<>();
        try {
//            Iterable<Object> data = yaml.loadAll(new FileReader("C:\\Users\\Y. Sethu Sruthi\\IdeaProjects\\core-java-proj\\src\\main\\resources\\player.yaml"));
            Iterable<Object> data = yaml.loadAll(ReadingPlayerData.class.getResourceAsStream("/player.yaml"));
            for(Object o: data) {
                Player player = mapper.convertValue(o, Player.class);
                players.add(player);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return players;
    }

}
