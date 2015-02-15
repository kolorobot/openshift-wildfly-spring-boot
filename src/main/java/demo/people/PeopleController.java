package demo.people;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
@RequestMapping("people")
public class PeopleController {

    private final PeopleRepository peopleRepository;

    @Inject
    public PeopleController(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }


    @RequestMapping
    public Iterable<Person> findAll() {
        return peopleRepository.findAll();
    }
}
