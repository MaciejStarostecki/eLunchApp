package pl.strefakursow.elunchapp.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.strefakursow.elunchapp.validator.PeriodTimeConstraint;

import java.time.LocalTime;

@Data
@Builder
@NoArgsConstructor @AllArgsConstructor
@PeriodTimeConstraint
@Embeddable
public class PeriodTime {

    @Nullable
    private LocalTime begin;

    @Nullable
    private LocalTime end;



}
