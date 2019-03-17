package ua.tania.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.tania.dto.OrderDto;
import ua.tania.service.OrderService;
import ua.tania.service.RoomService;

/**
 * Created by Tania Nebesna on 17.03.2019
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    RoomService roomService;

    @Autowired
    OrderService orderService;

    @RequestMapping(value = {"/mainPage"}, method = RequestMethod.GET)
    public String addHotel(Model model) {
        model.addAttribute("rooms", roomService.findAllAvailable());

        return "user/mainPage";
    }


    @RequestMapping(value = {"/orderPage"}, method = RequestMethod.GET)
    public String addRoom(Model model) {
        model.addAttribute("orderForm", new OrderDto());

        return "user/orderPage";
    }

    @RequestMapping(value = {"/orderPage"}, method = RequestMethod.POST)
    public String addHotel(@ModelAttribute("orderForm") OrderDto orderDto, Model model) {

        orderService.save(orderDto);
        return "welcome";
    }

}
