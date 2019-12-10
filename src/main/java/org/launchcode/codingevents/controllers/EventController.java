package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Chris Bay
 */
@Controller
@RequestMapping("events")
public class EventController {
//Previous working list
 //   private static List<String> events = new ArrayList<>();
// Map<String, String> events = new HashMap<String, String>();
   private static Map<String,String> events=new HashMap<>();
    @GetMapping
    public String displayAllEvents(Model model) {
//        model.addAttribute("title", "All Events");
//        model.addAttribute("events", events);
//        return "events/index";
    events.put("World Wide Technology-Hour of code", "1-hour introduction to computer science, designed to demystify code, to show that anybody can do it! ");
    events.put("Coding Skills: Getting Started with Swift Playgrounds","Wed, Dec 11, 7 – 8 PM\n" +
            "Apple West County, 131 W County Center\n" +
            "St. Louis, MO");
    events.put("Coding Lab for Kids: Sphero Robot Obstacle Challenge","Tue, Dec 24, 4:30 – 5:30 PM,Apple West County, 131 W County Center\n" +
            "St. Louis, MO");
    model.addAttribute("events",events);
    return "events/index";
    }
    //part2for hashmap
// @GetMapping("create")
//    public String renderCreateEventForm() {
//        //model.addAttribute("title", "Create Event");
//        return "events/create";
//    }
 //part2 for hash map
//    @PostMapping("create")
// public String createEvent(@RequestParam String eventName,@RequestParam String eventDesc){
//    events.put(eventName,eventDesc);
//    return "redirect:";
//    }
////@PostMapping("events")
//public String processCreateEventForm(@RequestParam String eventName, @RequestParam String eventDesc) {
//        events.put(eventName,eventDesc);
//        return "redirect:";
//    }

//    @GetMapping("create")
//    public String displayCreateEventForm(Model model) {
//        model.addAttribute("title", "Create Event");
//        return "events/create";
//    }
//
//    @PostMapping("create")
//    public String processCreateEventForm(@RequestParam String eventName) {
//        events.add(eventName);
//        return "redirect:";
//    }

}
