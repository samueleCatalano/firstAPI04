package com.firstAPI04.firstAPI04;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/headers")
public class HeaderController {

    @GetMapping
    public String getHeaders(HttpServletRequest request){
        return request.getServerName() + ":" + request.getServerPort();
    }
}
