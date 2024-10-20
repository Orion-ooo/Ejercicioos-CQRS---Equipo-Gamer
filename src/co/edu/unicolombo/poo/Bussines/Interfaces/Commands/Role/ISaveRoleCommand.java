
package co.edu.unicolombo.poo.Bussines.Interfaces.Commands.Role;

import co.edu.unicolombo.poo.Domain.Model.Role;

/**
 *
 * @author PC
 */
public interface ISaveRoleCommand {
    public int createRole(Role role) throws Exception;
}
