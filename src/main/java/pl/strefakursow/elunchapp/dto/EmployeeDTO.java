package pl.strefakursow.elunchapp.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import pl.strefakursow.elunchapp.model.enums.Archive;

import java.util.UUID;

@Data
@SuperBuilder
@NoArgsConstructor @AllArgsConstructor
public class EmployeeDTO {

    @NotNull
    private UUID uuid;

    @NotNull
    @Embedded
    private PersonalDataDTO personalDataDTO;

    @NotNull
    @Embedded
    private LoginDataDTO loginDataDTO;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Archive archive;

}
