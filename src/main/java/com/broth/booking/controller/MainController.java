package com.broth.booking.controller;

import com.broth.booking.service.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class MainController {

    private RoomService roomService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("roomList", roomService.findAllAsc());
        return "index";
    }

    @GetMapping("/post")
    public String post() {
        return "post";
    }
}
