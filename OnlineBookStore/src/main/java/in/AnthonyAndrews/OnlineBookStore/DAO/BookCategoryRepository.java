package in.AnthonyAndrews.OnlineBookStore.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import in.AnthonyAndrews.OnlineBookStore.model.BookCategory;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Long>{

}
