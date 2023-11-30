package pl.strefakursow.elunchapp.dto;

import jakarta.annotation.Nullable;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.strefakursow.elunchapp.validator.PeriodConstraint;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor @AllArgsConstructor
@PeriodConstraint
@Embeddable
public class PeriodDTO {

    @Nullable
    private LocalDateTime begin;

    @Nullable
    private LocalDateTime end;



}
