package pl.strefakursow.elunchapp.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class DeliveryAddress {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    @NotNull
    private UUID uuid;

    @Nullable
    private String description;

    @Nullable
    private String street;

    @NotNull
    private String streetNumber;

    @Nullable
    private String localNumber;

    @NotNull
    private String city;

    @NotNull
    private String postCode;

    @NotNull
    @ManyToOne
    private User user;

}
