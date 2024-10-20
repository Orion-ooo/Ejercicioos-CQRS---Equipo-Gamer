
package co.edu.unicolombo.poo.Bussines.Interfaces.Queries;

import co.edu.unicolombo.poo.Domain.Model.Role;

/**
 *
 * @author PC
 */
public interface IGetRoleQuery {
    public Role getRole(int roleid) throws Exception;
    public Role getRole(String roleName) throws Exception;
}
