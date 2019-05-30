package com.infinity.wealth.docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : an ape from alian
 * @Description: TODO
 * @date Date : 2019年05月30日 15:44
 */
@RestController
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "Hello Docker!";
    }
}
