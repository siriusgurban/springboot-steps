package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMspping;

@Controller
@RequestMapping("/msg")
public class MessageController {

    @GetMapping
    public String handle_get(){
        return "hello";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String handle_post(){
        return "hello_msg_template";
    }


}
