package pl.strefakursow.elunchapp.dto;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor @AllArgsConstructor
public class DishDTO {


    @NotNull
    private UUID uuid;

    @NotNull
    @Min(1)
    private Integer quantity;

    @NotNull
    private ProductDTO productDTO;

    @Nullable
    private List<MenuItemDTO> menuItemDTOS;

}
