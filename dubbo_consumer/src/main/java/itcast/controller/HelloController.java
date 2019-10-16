package itcast.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/say")
public class HelloController {
    @Reference
    private HelloService helloService;

    @RequestMapping(value = "/hello",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String sayHello(String name){
        return helloService.sayHello(name);
    }

}
