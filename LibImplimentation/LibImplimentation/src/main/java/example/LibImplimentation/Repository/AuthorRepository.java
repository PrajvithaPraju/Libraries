package example.LibImplimentation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import example.LibImplimentation.Entity.Author;


@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
