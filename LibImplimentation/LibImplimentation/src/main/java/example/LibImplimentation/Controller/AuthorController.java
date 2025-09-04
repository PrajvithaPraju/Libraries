package example.LibImplimentation.Controller;


import org.springframework.web.bind.annotation.*;

import example.LibImplimentation.Entity.Author;
import example.LibImplimentation.Service.AuthorService;



@RestController
@RequestMapping("/authors")
public class AuthorController {
	private final AuthorService authorService1 = null;

    @PostMapping
    public Author createAuthor(@RequestBody Long author) {
        return authorService1.deleteAuthor(author);
    }

    @GetMapping("/{id}")
    public Author getAuthorById(@PathVariable Long id) {
        try {
			return (Author) AuthorService.getAuthorById(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }

    @PutMapping("/{id}")
    public void updateAuthor(@PathVariable Long id, @RequestBody Author author) {
        try {
			return;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable Long id) {
        authorService1.deleteAuthor(id);
    }
}