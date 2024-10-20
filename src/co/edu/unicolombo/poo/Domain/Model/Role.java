
package co.edu.unicolombo.poo.Domain.Model;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author PC
 */
public class Role {
    private int id;
    private String name;
    private String description;
    private List<Player> players;
    
    private static AtomicInteger incrementId;
    
    public Role(){
        id = getIncrementeId();
    }

    public Role(String name) throws Exception {
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

    public String getDescription() {
        return description;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public static AtomicInteger getIncrementId() {
        return incrementId;
    }
    
    public int getIncrementeId(){
        if(incrementId == null){
            incrementId = new AtomicInteger(1);
        }
        return incrementId.incrementAndGet();
    }
}
