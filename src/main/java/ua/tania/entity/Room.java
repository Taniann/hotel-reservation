package ua.tania.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;


/**
 * Created by Tania Nebesna on 13.02.2019.
 */
@Data
@Entity
@Table(name = "room")
public class Room implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "number")
    private String number;

    @Column(name = "roominess")
    private Integer roominess;

    @Column(name = "price_per_day")
    private BigDecimal pricePerDay;

    @ManyToOne
    @JoinColumn(name = "hotel")
    private Hotel hotel;

    @Column(name = "is_free")
    private boolean free;

    @Column(name = "discount")
    private Integer discount;

    @OneToMany(mappedBy="room", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    private List<Order> orders;
}
