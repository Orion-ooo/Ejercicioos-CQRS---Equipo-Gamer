
package co.edu.unicolombo.poo.Bussines.Interfaces.Repositories;

import co.edu.unicolombo.poo.Domain.Model.Role;
import java.util.List;

/**
 *
 * @author PC
 */
public interface IRoleRepository {
    public int saveRole(Role role) throws Exception;
    public Role findRoleById(int roleId) throws Exception;
    public Role findRoleByName(String name) throws Exception;
    public void editRole(Role role) throws Exception;
    public int deleteRole(int roleId) throws Exception;
    public List<Role> getRoleAll();
}
