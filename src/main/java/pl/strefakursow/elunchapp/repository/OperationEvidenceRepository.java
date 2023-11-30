package pl.strefakursow.elunchapp.repository;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.strefakursow.elunchapp.model.Deliverer;
import pl.strefakursow.elunchapp.model.User;
import pl.strefakursow.elunchapp.model.enums.EvidenceType;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface OperationEvidenceRepository extends JpaRepository<Deliverer, Long> {

    @Query("SELECT coalesce(SUM(" +
            "CASE " +
            "WHEN e.type = pl.strefakursow.elunchapp.model.enums.EvidenceType.DEPOSIT THEN e.amount " +
            "WHEN e.type = pl.strefakursow.elunchapp.model.enums.EvidenceType.WITHDRAW " +
            "OR e.type = pl.strefakursow.elunchapp.model.enums.EvidenceType.PAYMENT THEN -e.amount " +
            "ELSE 0" +
            " END " +
            "),0) FROM OperationEvidence e WHERE e.user = :user ")
    BigDecimal getUserAccountBalance(@Param("user") User user);

}
