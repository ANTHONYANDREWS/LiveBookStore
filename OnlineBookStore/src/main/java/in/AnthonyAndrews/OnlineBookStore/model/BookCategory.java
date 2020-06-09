package in.AnthonyAndrews.OnlineBookStore.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="tb1_category")

public class BookCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String categoryName;
	
	

	public BookCategory(String categoryName, Set<Book> book) {
		super();
		this.categoryName = categoryName;
		this.book = book;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
    @Column(name="category_name")
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
    

    
   @OneToMany(cascade=CascadeType.ALL, mappedBy="category")
   private Set<Book> book;
    
//	@NotFound(action = NotFoundAction.IGNORE)
//
//	
////	@OneToMany(cascade=CascadeType.ALL, mappedBy="category")
//	@OneToMany( mappedBy = "category" )
//	private Set<Book> book;
	

}
