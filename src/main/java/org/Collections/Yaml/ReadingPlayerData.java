package org.Collections.Yaml;

import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;


public class ReadingPlayerData {
    public static void main(String[]args){
        LoaderOptions options = new LoaderOptions();

        Constructor constructor = new Constructor(Player.class,options);
        Yaml yaml = new Yaml(constructor);

        Iterable<Object> players = yaml.loadAll(ReadingPlayerData.class.getResourceAsStream("/players.yaml"));
        for(Object obj:players){
            if(obj instanceof Player player){
                System.out.println(player);
            }
        }
    }
}
