package example.LibImplimentation.serviceinterface;

import java.util.List;

import example.LibImplimentation.Entity.Author;


public interface Authorserviceinterface {
Authorserviceinterface saveAuthor(Authorserviceinterface author);  
	
    List<Authorserviceinterface> getAllAuthors();   
    
    Author getAuthorById(Long id);  
    
    Authorserviceinterface updateAuthor(Long id, Authorserviceinterface author); 
    
    void deleteAuthor(Long id);

	Author saveAuthor(Author author);

	Author getAuthortById(Long id);

	Authorserviceinterface updateAuthor(Long id, Author author);
}


