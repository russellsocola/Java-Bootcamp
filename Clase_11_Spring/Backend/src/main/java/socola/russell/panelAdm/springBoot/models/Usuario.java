package socola.russell.panelAdm.springBoot.models;

import lombok.*;

//@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
@Data @AllArgsConstructor
public class Usuario {
    private Integer id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;


}
