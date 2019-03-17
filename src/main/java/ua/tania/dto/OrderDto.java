package ua.tania.dto;

import lombok.Data;
import org.springframework.format.annotation.NumberFormat;
import ua.tania.entity.Room;
import ua.tania.entity.User;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Created by Tania Nebesna on 17.03.2019
 */
@Data
public class OrderDto {
    @NotNull
    @NotEmpty
    private User user;

    @NotNull
    @NotEmpty
    private Room room;

    @NotNull
    @NotEmpty
    private LocalDate beginDate;

    @NotNull
    @NotEmpty
    private LocalDate endDate;

    @NotNull
    @NotEmpty
    @NumberFormat(style=NumberFormat.Style.CURRENCY)
    private BigDecimal amount;

    @NotNull
    @NotEmpty
    private boolean isPaid;
}
