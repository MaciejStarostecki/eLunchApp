package pl.strefakursow.elunchapp.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.strefakursow.elunchapp.model.enums.Archive;

import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor @AllArgsConstructor
public class RestaurantDTO {

    @NotNull
    private UUID uuid;

    @NotBlank
    private String name;

    @NotNull
    @Embedded
    private LoginDataDTO loginDataDTO;

    @NotNull
    @Embedded
    private CompanyDataDTO companyDataDTO;

    @NotNull
    @Size(max = 7)
    private List<OpenTimeDTO> openTimeDTOS;

    @NotNull
    private List<MenuItemDTO> menuItemDTOS;

    @NotNull
    private List<OrderDTO> orderDTOS;

    @NotNull
    private List<PromoCodeDTO> promoCodeDTOS;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Archive archive;

}
