package pl.strefakursow.elunchapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor @AllArgsConstructor
@Embeddable
public class CompanyData {

    @NotNull
    @Column(name = "companyName")
    private String name;

    @Embedded
    @NotNull
    private Address address;

    @NotNull
    private String NIP;

    @NotNull
    private String REGON;

    @NotNull
    private String phone;

    @NotNull
    @Email
    private String email;

}
