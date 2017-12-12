package springboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.model.StackoverflowWebsite;
import springboot.service.StackoverflowService;

import java.util.List;

@RestController
@RequestMapping("/api/overflow")
public class OverflowController {

    @Autowired
    private StackoverflowService stackoverflowService;

    @RequestMapping
    public List<StackoverflowWebsite> getListOfProviders(){
        return stackoverflowService.findAll();
    }
}