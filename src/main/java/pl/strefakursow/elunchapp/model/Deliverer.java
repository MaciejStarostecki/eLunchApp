package pl.strefakursow.elunchapp.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor @AllArgsConstructor
@Entity
@DiscriminatorValue("deliverer")
public class Deliverer extends Employee {

    @Nullable
    @OneToMany(mappedBy = "deliverer")
    private List<Order> orders;

//    @Builder(builderMethodName = "delivererBuilder")
//    public Deliverer(Long id, UUID uuid, PersonalData personalData, LoginData loginData, Archive archive, List<Order> orders){
//        super(id, uuid, personalData, loginData, archive);
//        this.orders = orders;
//
//    }

}
