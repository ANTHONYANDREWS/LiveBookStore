package in.AnthonyAndrews.OnlineBookStore.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;




@Entity
@Table(name="tb1_book")
public class Book {

   
    private Long id;
    private String sku;
    private String name;
    private String description;
    private BigDecimal unitPrice;
    private String imageUrl;
    private boolean active;
    private int unitsInStock;
    private Date createdOn;
    private Date updatedOn;


    
    public Book(String sku, String name, String description, BigDecimal unitPrice, String imageUrl, boolean active,
			int unitsInStock, Date createdOn, Date updatedOn) {
		super();
		this.sku = sku;
		this.name = name;
		this.description = description;
		this.unitPrice = unitPrice;
		this.imageUrl = imageUrl;
		this.active = active;
		this.unitsInStock = unitsInStock;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
	}


	@ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private BookCategory category;
    
//	@ManyToOne( fetch = FetchType.LAZY )
//	@NotFound(
//		    action = NotFoundAction.IGNORE)
//	@JoinColumn(name="category_id", nullable=false)
//	@JoinColumn(
//		    name = category_id,
//		    referencedColumnName = category_id,
//		    insertable = false,
//		    updatable = false)
//		
//	private BookCategory category;
//	

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	 @Column(name = "sku")
	public String getSku() {
		return sku;
	}


	public void setSku(String sku) {
		this.sku = sku;
	}

	 @Column(name = "name")
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	 @Column(name = "description")
	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "unit_price")
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Column(name = "image_url")
	public String getImageUrl() {
		return imageUrl;
	}


	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	@Column(name = "active")
	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}

	 @Column(name = "units_in_stock")
	public int getUnitsInStock() {
		return unitsInStock;
	}


	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	@Column(name = "date_created")
	public Date getCreatedOn() {
		return createdOn;
	}


	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	 @Column(name = "last_updated")
	public Date getUpdatedOn() {
		return updatedOn;
	}


	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}


}