package vip.itchen.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author ckh
 * @date 2021-03-31
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/serverTime")
    public String serverTime() {
        return new Date().toString();
    }
}
