package demo.people;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

    @Repository
    public interface PeopleRepository extends PagingAndSortingRepository<Person, Integer> {
        List<Person> findByLastName(@Param("lastName") String lastName);
    }
