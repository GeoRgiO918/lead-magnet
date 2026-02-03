package org.hadjiev.george.lead.magnet.controller;

import org.hadjiev.george.lead.magnet.dto.PageConfig;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClientFormController {




    @GetMapping("/buy/{slug}")
    public String getForm(@PathVariable("slug") String slug,
                                Model model){

        PageConfig config = new PageConfig();
        config.setTitle(slug);
        model.addAttribute("page",config);
        return  "/buy/page";

    }
}
