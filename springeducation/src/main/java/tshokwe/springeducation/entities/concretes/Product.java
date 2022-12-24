package tshokwe.springeducation.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // Projemizde bu class ın entity e karşılık geldiğini belirttik.
@Table(name = "products")
@Data // Lombok sayesinde tüm getter ve setter lar otomatik eklendi.
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	@Id // Tablonun PK olduğu belirtilir
	@GeneratedValue(strategy = GenerationType.IDENTITY) // ID yi birer arttırmak için

	@Column(name = "product_id")
	private int id;

	@Column(name = "category_id")
	private int categoryId;

	@Column(name = "product_name")
	private String productName;

	@Column(name = "unit_price")
	private double unitPrice;

	@Column(name = "units_in_stock")
	private short unitsInStock;

	@Column(name = "quantity_per_uni")
	private String quantityPerUnit;


}
