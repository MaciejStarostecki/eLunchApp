package pl.strefakursow.elunchapp.dto;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
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
public class ProductDTO {

    @NotNull
    private UUID uuid;

    @NotBlank
    private String name;

    @NotNull
    private List<IngredientDTO> ingredientDTOS;

    @Nullable
    private DishDTO dishDTO;


}
