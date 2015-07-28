package uk.co.reformtheempire.tlfforlondon.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenericReponseController {
	@RequestMapping("/response")
    public GenericResponse genericResponse(@RequestParam(value="name", defaultValue="World") String name) {
        return new GenericResponse(name);
    }
}
