package pl.strefakursow.elunchapp.dto;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor @AllArgsConstructor
@Embeddable
public class OrderStatusDTO {

    @NotNull
    private Instant orderTime;

    @NotNull
    private Boolean isPaid;

    @NotNull
    private Instant giveOutTime;

    @NotNull
    private Instant deliveryTime;

}
