package pl.strefakursow.elunchapp.dto;

import jakarta.annotation.Nullable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor @AllArgsConstructor
public class DelivererDTO extends EmployeeDTO {

    @Nullable
    private List<OrderDTO> orderDTOS;

//    @Builder(builderMethodName = "delivererDTOBuilder")
//    public DelivererDTO (UUID uuid, PersonalDataDTO personalDataDTO, LoginDataDTO loginDataDTO, Archive archive, List<OrderDTO> orderDTOS) {
//        super(uuid, personalDataDTO, loginDataDTO, archive);
//        this.orderDTOS = orderDTOS;
//    }


}
