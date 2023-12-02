package org.nineteensomething.memento.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/v1/utility")
public class UtilityControllers {

    @GetMapping("/health")
    public String healthCheck() {
        return "OK";
    }

}
