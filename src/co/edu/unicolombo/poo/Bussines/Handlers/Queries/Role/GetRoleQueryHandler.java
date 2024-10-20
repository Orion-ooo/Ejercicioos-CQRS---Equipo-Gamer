
package co.edu.unicolombo.poo.Bussines.Handlers.Queries.Role;

import co.edu.unicolombo.poo.Bussines.Interfaces.Queries.IGetRoleQuery;
import co.edu.unicolombo.poo.Bussines.Interfaces.Repositories.IRoleRepository;
import co.edu.unicolombo.poo.Domain.Model.Role;

/**
 *
 * @author PC
 */
public class GetRoleQueryHandler implements IGetRoleQuery{
    private IRoleRepository roleRepository;
    
    public GetRoleQueryHandler(IRoleRepository roleRepository){
        this.roleRepository = roleRepository;
    }

    @Override
    public Role getRole(int roleid) throws Exception {
        return roleRepository.findRoleById(roleid);
    }

    @Override
    public Role getRole(String roleName) throws Exception {
        return roleRepository.findRoleByName(roleName);
    }
}
