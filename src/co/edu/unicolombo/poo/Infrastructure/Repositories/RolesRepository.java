
package co.edu.unicolombo.poo.Infrastructure.Repositories;

import co.edu.unicolombo.poo.Bussines.Interfaces.Repositories.IRoleRepository;
import co.edu.unicolombo.poo.Domain.Model.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class RolesRepository implements IRoleRepository{
    public static List<Role> rolesDb;
    
    public RolesRepository(){
        createRolesDb();
    }
    
    public void createRolesDb(){
        if (rolesDb == null){
            rolesDb = new ArrayList<>();
        }
    }

    @Override
    public int saveRole(Role role) throws Exception {
        if (role == null){
            throw new Exception("El rol es requerido");
        }
        
        try {
            Role foundRole = findRoleByName(role.getName());
            throw new Exception("El rol ya existe");
        } catch (Exception e) {
            rolesDb.add(role);
        }
        return rolesDb.size();
    }

    @Override
    public Role findRoleById(int roleId) throws Exception {
        if(rolesDb.isEmpty()){
            throw new Exception("El rol " + roleId + " no existe");
        }
        
        Role foundRole = null;
        for(Role r : rolesDb){
            if(r.getId() == roleId){
                foundRole = r;
                break;
            }
        }
        
        if(foundRole == null){
            throw new Exception("El rol " + roleId + " no existe");
        }
        
        return foundRole;
    }

    @Override
    public Role findRoleByName(String name) throws Exception {
        if(rolesDb.isEmpty()){
            throw new Exception("El rol " + name + " no existe");
        }
        
        Role roleFound = null;
        for(Role r : rolesDb){
            if(r.getName().equalsIgnoreCase(name)){
                roleFound = r;
                break;
            }
        }
        
        if(roleFound == null){
            throw new Exception("El rol " + name + " no existe");
        }
        
        return roleFound;
    }

    @Override
    public void editRole(Role role) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int deleteRole(int roleId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Role> getRoleAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
