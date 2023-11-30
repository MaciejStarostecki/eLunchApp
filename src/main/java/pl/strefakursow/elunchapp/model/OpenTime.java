package pl.strefakursow.elunchapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.strefakursow.elunchapp.model.enums.DayOfWeek;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor @AllArgsConstructor
@Entity
public class OpenTime {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    @NotNull
    private UUID uuid;

    @NotNull
    @Enumerated(EnumType.STRING)
    private DayOfWeek dayOfWeek;

    @NotNull
    @Embedded
    private PeriodTime periodTime;

    @NotNull
    @ManyToOne
    private Restaurant restaurant;
}
