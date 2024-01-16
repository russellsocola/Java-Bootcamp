package socola.russell.panelAdm.springBoot.controllers;

import org.springframework.web.bind.annotation.*;
import socola.russell.panelAdm.springBoot.models.Usuario;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {
    static List <Usuario> users = new ArrayList<>();    
    @GetMapping("/api/usuarios")
    public List<Usuario> listarUsuarios(){
        return users;
    }
    @DeleteMapping("/api/usuarios/{id}")
    public void eliminarUsuario(@PathVariable String id){
        for(Usuario user : users){
            if (id.equals(user.getId().toString())){
                users.remove(user);
            }
        }
        //users.removeIf(user -> id.equals(user.getId().toString()));
        //users.removeIf(user ->user.getId().equals(id));
        //Usuario usuarioEncontrado = users.stream().filter(user -> user.getId().equals(id)).findFirst().get();
        //users.remove(usuarioEncontrado);
    }
    @PostMapping("/api/usuarios")
    public void agregarUsuario(@RequestBody Usuario user){
        users.add(user);
    }
}
