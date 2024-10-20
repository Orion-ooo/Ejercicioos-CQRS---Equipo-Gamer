
package co.edu.unicolombo.poo.Domain.Model;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author PC
 */
public class Team {
    private int id;
    private String name;
    private List<Player> players;
    private String description;
    
    private static AtomicInteger incrementId;
    
    public Team(){
        id = getIncrementeId();
    }
    
    public Team(String name) throws Exception {
        if(name == null || name.trim().isEmpty()){
            throw new Exception("El nombre es requerido");
        }
        this.name = name;
        id = getIncrementeId();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public String getDescription() {
        return description;
    }
    
    public int getIncrementeId(){
        if(incrementId == null){
            incrementId = new AtomicInteger(1);
        }
        return incrementId.incrementAndGet();
    }
}
