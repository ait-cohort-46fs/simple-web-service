package ait.cohort46.controller;

import ait.cohort46.dto.PersonDto;
import ait.cohort46.dto.PersonFeedDto;
import org.springframework.web.bind.annotation.*;

@RestController
public class SimpleServiceController {

    @GetMapping("/hello")
    public String hello(@RequestParam("title") String name) {
        return "Hello " + name;
    }

    @PostMapping("/hello")
    public String hello(@RequestBody PersonDto person) {
        return "Hello " + person.getFirstName() + " " + person.getLastName();
    }

    @PostMapping("/feed")
    public PersonFeedDto personEating(@RequestBody PersonDto person) {
        return PersonFeedDto.builder()
                .fullName(person.getFirstName() + " " + person.getLastName())
                .food("Candy")
                .food("Cake")
                .food("Cookies")
                .build();
    }

    @PostMapping("/feed/{delicious}")
    public PersonFeedDto personEating(@RequestBody PersonDto person, @PathVariable("delicious") String food) {
        return PersonFeedDto.builder()
                .fullName(person.getFirstName() + " " + person.getLastName())
                .food(food)
                .build();
    }
}
