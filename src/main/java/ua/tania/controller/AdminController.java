package ua.tania.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.tania.dto.HotelDto;
import ua.tania.dto.RoomDto;
import ua.tania.service.HotelService;
import ua.tania.service.RoomService;

/**
 * Created by Tania Nebesna on 15.03.2019
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    HotelService hotelService;

    @Autowired
    RoomService roomService;

    @RequestMapping(value = {"/addHotel"}, method = RequestMethod.GET)
    public String addHotel(Model model) {
        model.addAttribute("hotelForm", new HotelDto());

        return "admin/addHotel";
    }

    @RequestMapping(value = {"/addHotel"}, method = RequestMethod.POST)
    public String addHotel(@ModelAttribute("hotelForm") HotelDto hotelDto, Model model) {

        hotelService.save(hotelDto);
        return "welcome";
    }


    @RequestMapping(value = {"/addRoom"}, method = RequestMethod.GET)
    public String addRoom(Model model) {
        model.addAttribute("roomForm", new RoomDto());
        model.addAttribute("hotels", hotelService.findAll());


        return "admin/addRoom";
    }

    @RequestMapping(value = {"/addRoom"}, method = RequestMethod.POST)
    public String addHotel(@ModelAttribute("roomForm") RoomDto roomDto, Model model) {

        roomService.save(roomDto);
        return "welcome";
    }
}
