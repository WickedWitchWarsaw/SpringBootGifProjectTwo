package pl.akademiakodu.giflib.model;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by ZuZ on 2016-11-19.
 */
@Entity
@Table(name = "ADS_PROV")
public class AdvertismentProvider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "NAME", unique = true)
    private String companyName;

    @Column(name = "DESC", nullable = false)
    private String description;

    @Column(name = "CREATED")
    private int yearCreated;

}
