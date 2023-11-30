package pl.strefakursow.elunchapp.repository;

import jakarta.annotation.Nullable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.strefakursow.elunchapp.model.Deliverer;
import pl.strefakursow.elunchapp.model.PromoCode;
import pl.strefakursow.elunchapp.model.User;
import pl.strefakursow.elunchapp.model.enums.DiscountUnit;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface PromoCodeRepository extends JpaRepository<PromoCode, Long> {

    Optional<PromoCode> findByUuid(UUID uuid);

}
