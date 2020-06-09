package in.AnthonyAndrews.OnlineBookStore.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.AnthonyAndrews.OnlineBookStore.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
