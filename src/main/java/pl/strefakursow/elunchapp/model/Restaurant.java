package pl.strefakursow.elunchapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import pl.strefakursow.elunchapp.model.enums.Archive;

import java.util.List;
import java.util.UUID;

@Data
@Entity
public class Restaurant {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    @NotNull
    private UUID uuid;

    @NotBlank
    private String name;

    @NotNull
    @Embedded
    private LoginData loginData;

    @NotNull
    @Embedded
    private CompanyData companyData;

    @NotNull
    @Size(max = 7)
    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OpenTime> openTimes;

    @NotNull
    @OneToMany(mappedBy = "restaurant")
    private List<MenuItem> menuItems;

    @NotNull
    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Order> orders;

    @NotNull
    @ManyToMany(mappedBy = "restaurants")
    private List<PromoCode> promoCodes;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Archive archive;

}
