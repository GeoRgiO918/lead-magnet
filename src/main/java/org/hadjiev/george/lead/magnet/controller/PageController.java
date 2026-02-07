package org.hadjiev.george.lead.magnet.controller;

import org.hadjiev.george.lead.magnet.properties.AgentProperties;
import org.hadjiev.george.lead.magnet.properties.SiteProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    private final AgentProperties agentProperties;
    private final SiteProperties siteProperties;

    public PageController(AgentProperties agentProperties, SiteProperties siteProperties) {
        this.agentProperties = agentProperties;
        this.siteProperties = siteProperties;
    }

    @GetMapping({"/","/index"})
    public String getIndex(Model model){
        model.addAttribute("agent",agentProperties);
        model.addAttribute("site",siteProperties);
        return "/pages/index";
    }
}
