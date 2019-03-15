package ua.tania.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * Created by Tania Nebesna on 15.03.2019
 */
@Data
public class HotelDto {
    @NotNull
    @NotEmpty
    private String name;

    @NotNull
    @NotEmpty
    private String city;
}
