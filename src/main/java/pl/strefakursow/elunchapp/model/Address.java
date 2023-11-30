package pl.strefakursow.elunchapp.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Embeddable
public class Address {

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
}
