package pl.strefakursow.elunchapp.dto;

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
public class OpenTimeDTO {

    @NotNull
    private UUID uuid;

    @NotNull
    @Enumerated(EnumType.STRING)
    private DayOfWeek dayOfWeek;

    @NotNull
    @Embedded
    private PeriodTimeDTO periodTimeDTO;

    @NotNull
    private RestaurantDTO restaurantDTO;
}
