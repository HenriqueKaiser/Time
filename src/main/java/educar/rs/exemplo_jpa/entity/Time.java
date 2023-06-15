package educar.rs.exemplo_jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Time {
    @Id
    private Long id;
    private String nome;
    private int quantTorcedores;
    private String estadio;
    private String tecnico;
    private String anoFundacao;

}
