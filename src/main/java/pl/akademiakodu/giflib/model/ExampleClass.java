package pl.akademiakodu.giflib.model;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by ZuZ on 2016-11-19.
 */

@Entity
@Table(name = "OMG_CRAZY_GIF")
public class ExampleClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "GO", nullable = false)
    private String columnA;
    @Column(name = "AND", columnDefinition = "CLOB NOT NULL")
    private String columnB;
    @Column(name = "DEBUG", unique = true)
    private String columnC;
    @Column(name = "THIS", precision = 12)
    private BigDecimal columnD;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getColumnA() {
        return columnA;
    }

    public void setColumnA(String columnA) {
        this.columnA = columnA;
    }

    public String getColumnB() {
        return columnB;
    }

    public void setColumnB(String columnB) {
        this.columnB = columnB;
    }

    public String getColumnC() {
        return columnC;
    }

    public void setColumnC(String columnC) {
        this.columnC = columnC;
    }

    public BigDecimal getColumnD() {
        return columnD;
    }

    public void setColumnD(BigDecimal columnD) {
        this.columnD = columnD;
    }
}
