package cn.xuqplus;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by Administrator on 2017-04-18.
 */
@RestController
public class AController {
    @RequestMapping("/")
    public Object demo(ModelAndView mav) {
        mav.addObject("success", true);
        return mav.getModel();
    }

    @RequestMapping("/msg")
    public Object cors(@RequestParam Map map) {
        StringBuilder sb = new StringBuilder();
        String callback = (String) map.get("callback");
        int a = Integer.parseInt((String) map.get("a"));
        int b = Integer.parseInt((String) map.get("b"));
        sb.append(callback + "(" + (a + b) + ")");
        return sb;
    }
}
