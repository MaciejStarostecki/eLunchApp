package pl.strefakursow.elunchapp.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.strefakursow.elunchapp.model.User;
import pl.strefakursow.elunchapp.model.enums.EvidenceType;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor @AllArgsConstructor
public class OperationEvidenceDTO {

    @NotNull
    private Instant date;

    @NotNull
    @Enumerated(EnumType.STRING)
    private EvidenceType type;

    @Digits(integer = 10, fraction = 2)
    @Min(0)
    @NotNull
    private BigDecimal amount;

    @NotNull
    private User user;



}
