
package co.edu.unicolombo.poo.Bussines.Interfaces.Repositories;

import co.edu.unicolombo.poo.Domain.Model.Player;
import java.util.List;

/**
 *
 * @author PC
 */
public interface IPlayerRepository {
    public int savePlayer(Player player) throws Exception;
    public Player findPlayerById(int playerId) throws Exception;
    public Player findPlayerByName(String name) throws Exception;
    public void editPlayer(Player player) throws Exception;
    public int deletePlayer(int playerId) throws Exception;
    public List<Player> getPlayerAll();
}
