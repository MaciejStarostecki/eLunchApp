package pl.strefakursow.elunchapp.dto;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.strefakursow.elunchapp.model.*;
import pl.strefakursow.elunchapp.model.enums.Archive;

import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor @AllArgsConstructor
public class UserDTO {


    @NotNull
    private UUID uuid;

    @NotNull
    @Embedded
    private PersonalDataDTO personalData;

    @Nullable
    private List<DeliveryAddressDTO> addresses;

    @NotNull
    @Embedded
    private LoginDataDTO loginData;

    @Nullable
    private List<OrderDTO> orders;

    @NotNull
    private List<OperationEvidenceDTO> operationEvidences;

    @Nullable
    private List<PromoCodeDTO> promoCodes;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Archive archive;

}
