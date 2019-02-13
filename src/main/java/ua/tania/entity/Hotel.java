package ua.tania.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Tania Nebesna on 13.02.2019.
 */
@Data
@Entity
@Table(name = "hotel")
public class Hotel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "city")
    private String city;

    @OneToMany(mappedBy="hotel", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    private List<Room> rooms;

}
