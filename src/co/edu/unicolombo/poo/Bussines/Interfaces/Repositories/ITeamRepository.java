
package co.edu.unicolombo.poo.Bussines.Interfaces.Repositories;

import co.edu.unicolombo.poo.Domain.Model.Team;
import java.util.List;

/**
 *
 * @author PC
 */
public interface ITeamRepository {
    public Team saveTeam(Team shop) throws Exception;
    public Team findById(int shopId) throws Exception;
    public Team findByName(String name) throws Exception;
    public List<Team> findAll() throws Exception;
    public void deleteTeam(int id) throws Exception;
    public Team updateTeam(int shopId)throws Exception;
}
