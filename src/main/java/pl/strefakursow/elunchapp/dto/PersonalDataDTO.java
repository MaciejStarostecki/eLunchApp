package pl.strefakursow.elunchapp.dto;

import jakarta.annotation.Nullable;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.strefakursow.elunchapp.model.enums.Sex;

@Data
@Builder
@NoArgsConstructor @AllArgsConstructor
@Embeddable
public class PersonalDataDTO {

    @Nullable
    private String name;

    @Nullable
    private String surname;

    @Nullable
    @Enumerated(EnumType.STRING)
    private Sex sex;

    @Nullable
    private String phone;

    @Nullable
    private String email;

}
