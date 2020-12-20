package com.titles.authservice;

import org.json.simple.*;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class AuthController {
private AuthService service = AuthService.defaultService;

    @GetMapping("/login")
    @ResponseBody
    public JSONObject loginRequest(@RequestParam(value = "login",required = false) String login,
                                   @RequestParam(value = "password",required = false) String password) {
        return service.loginRequest(login, password);
    }
    @PostMapping("/registration")
    @ResponseBody
    public JSONObject registrationRequest(@RequestParam(value = "login",required = false) String login,
                                          @RequestParam(value = "password",required = false) String password) {
        return service.registrationRequest(login,password);
    }
    @GetMapping("/users")
    @ResponseBody
    public JSONObject usersRequest(@RequestParam(value = "key",required = false) String key) {
        return service.usersRequest(key);
    }
    @PutMapping("/update")
    @ResponseBody
    public JSONObject putRequest(@RequestParam(value = "login",required = false) String login,
                                 @RequestParam(value = "password",required = false) String password,
                                 @RequestParam(value = "newlogin",required = false) String newlogin,
                                 @RequestParam(value = "newpassword",required = false) String newpassword) {
        return service.putRequest(login,password,newlogin,newpassword);
    }

}
