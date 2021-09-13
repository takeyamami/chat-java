package com.chat.application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ChatController {

    @RequestMapping("/chat")
    public String chat(@CookieValue(value="id", required=false) String email, ModelMap modelMap) {
        modelMap.addAttribute("email", email);

        // Modelsを実装して、ダミーリストを作って画面に表示

        return "chat";
    }

    @PostMapping("/chat/action")
    public String action(@RequestParam("rid")Integer rid,@RequestParam("message")String message,ModelMap modelMap) {

        return "redirect:../chat";
    }
}
