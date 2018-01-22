package com.zlikun.sso.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * @author zlikun <zlikun-dev@hotmail.com>
 * @date 2018/1/22 22:15
 */
@Slf4j
@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginView(HttpSession session) {
        String lt = UUID.randomUUID().toString();
        session.setAttribute("token", lt);
        return "login";
    }

    @PostMapping("/login")
    public String doLogin(HttpSession session, String username, String password, String token, String service) {
        // TODO 执行登录
        log.info("username = {}, password = {}, token = {}, service = {}", username, password, token, service);
        return "redirect:" + service;
    }

}
