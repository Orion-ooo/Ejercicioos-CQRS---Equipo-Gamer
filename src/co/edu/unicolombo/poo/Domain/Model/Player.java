
package co.edu.unicolombo.poo.Domain.Model;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Daniel
 */
public class Player {
    private String code;
    private String name;
    private String email;
    private String password;
    private Role role;
    private Team team;
    
    public Player(String code, String name, Role role) throws Exception{
        if (code == null || code.trim().isEmpty()){
            throw new Exception("El codigo es requerido");
        }
        
        if (name == null || name.trim().isEmpty()){
            throw new Exception("El nombre es requerido");
        }
        
        if (role == null) {
            throw new Exception("El rol es requerido");
        }
        
        this.code = code;
        this.name = name;
        this.role = role;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
    
    
}
