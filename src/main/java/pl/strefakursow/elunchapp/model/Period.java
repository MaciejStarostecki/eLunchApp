package pl.strefakursow.elunchapp.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.Embeddable;
import lombok.Data;
import pl.strefakursow.elunchapp.validator.PeriodConstraint;

import java.time.LocalDateTime;

@Data
@PeriodConstraint
@Embeddable
public class Period {

    @Nullable
    private LocalDateTime begin;

    @Nullable
    private LocalDateTime end;



}
