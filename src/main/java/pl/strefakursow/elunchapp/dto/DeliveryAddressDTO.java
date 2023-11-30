package pl.strefakursow.elunchapp.dto;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.strefakursow.elunchapp.model.User;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor @AllArgsConstructor
public class DeliveryAddressDTO {


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
    private User user;

}
