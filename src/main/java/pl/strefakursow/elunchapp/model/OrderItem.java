package pl.strefakursow.elunchapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class OrderItem {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    @NotNull
    private UUID uuid;

    @NotNull
    @Min(1)
    private Integer quantity;

    @NotNull
    @OneToOne
    private MenuItem menuItem;

}