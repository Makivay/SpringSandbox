package ru.makivay;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.makivay.model.Message;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by makivay on 19.06.16.
 */
@RestController
public class TestRest {
    private final AtomicLong id = new AtomicLong();

    @RequestMapping("/hello")
    public Message greeting(@RequestParam(value = "data")String data){
        return new Message(id.getAndIncrement(), data);
    }
}

