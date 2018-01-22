package com.zlikun.sso.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zlikun <zlikun-dev@hotmail.com>
 * @date 2018/1/22 22:14
 */
@Controller
public class TicketController {

    @GetMapping("/ticket")
    public String ticket() {

        return "";
    }

}
