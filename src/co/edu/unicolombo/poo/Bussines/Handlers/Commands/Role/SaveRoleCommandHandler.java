
package co.edu.unicolombo.poo.Bussines.Handlers.Commands.Role;

import co.edu.unicolombo.poo.Bussines.Interfaces.Commands.Role.ISaveRoleCommand;
import co.edu.unicolombo.poo.Bussines.Interfaces.Repositories.IRoleRepository;
import co.edu.unicolombo.poo.Domain.Model.Role;

/**
 *
 * @author Daniel
 */
public class SaveRoleCommandHandler implements ISaveRoleCommand{
    private IRoleRepository roleRepository;

    @Override
    public int createRole(Role role) throws Exception {
        return roleRepository.saveRole(role);
    }
    
    
}
