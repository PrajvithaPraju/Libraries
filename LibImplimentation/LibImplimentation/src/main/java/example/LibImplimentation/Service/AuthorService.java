package example.LibImplimentation.Service;
import java.util.List;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;


import example.LibImplimentation.Entity.Author;

@SpringBootApplication
@Service
	

public interface AuthorService {
	Author saveProduct(Author author);  
	
    List<Author> getAllAuthor();   
    
    static Author  getAuthorById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}  
    
    static Author update(Long id, Author author) {
		// TODO Auto-generated method stub
		return null;
	} 
    
    Author deleteAuthor(Long id);

	static Author updateAuthor(Long id, Author author) {
		// TODO Auto-generated method stub
		return null;
	}
}

