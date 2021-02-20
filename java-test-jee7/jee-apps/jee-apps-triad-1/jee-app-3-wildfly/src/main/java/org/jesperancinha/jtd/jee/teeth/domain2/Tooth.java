package org.jesperancinha.jtd.jee.teeth.domain2;

import org.jesperancinha.jtd.jee.teeth.domain.FinalToothType;
import org.jesperancinha.jtd.jee.teeth.domain.ToothType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity(name = "tooth2")
@Table(name = "tooth2")
public class Tooth {

    @Id
    @Column
    @NotNull
    private UUID uuid;

    private ToothType toothType;

    private ToothType toothTypeNumber;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String toString() {
        return uuid.toString();
    }

    @Version
    private Long version;


    @Column
    @Enumerated(EnumType.STRING)
    public ToothType getToothType() {
        return toothType;
    }

    public void setToothType(ToothType toothType) {
        this.toothType = toothType;
    }

    @Column
    @Enumerated(EnumType.ORDINAL)
    public ToothType getToothTypeNumber() {
        return toothTypeNumber;
    }

    public void setToothTypeNumber(ToothType toothTypeNumber) {
        this.toothTypeNumber = toothTypeNumber;
    }
}
