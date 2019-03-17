package ua.tania.dto;

import lombok.Data;
import org.springframework.format.annotation.NumberFormat;
import ua.tania.entity.Hotel;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * Created by Tania Nebesna on 16.03.2019
 */
@Data
public class RoomDto {
    @NotNull
    @NotEmpty
    private String number;

    @NotNull
    @NotEmpty
    private Integer roominess;

    @NotNull
    @NotEmpty
    @NumberFormat(style=NumberFormat.Style.CURRENCY)
    private BigDecimal pricePerDay;

    @NotNull
    @NotEmpty
    private Hotel hotel;

}
