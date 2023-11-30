package pl.strefakursow.elunchapp.dto;

import jakarta.annotation.Nullable;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor @AllArgsConstructor
@Embeddable
public class AddressDTO {

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
