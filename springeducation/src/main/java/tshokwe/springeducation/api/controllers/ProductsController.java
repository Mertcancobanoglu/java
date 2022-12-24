package tshokwe.springeducation.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tshokwe.springeducation.business.abstracts.ProductService;
import tshokwe.springeducation.core.utilites.results.DataResult;
import tshokwe.springeducation.core.utilites.results.Result;
import tshokwe.springeducation.entities.concretes.Product;

/* Controller dışarıdan gelen istekleri karşılar ve ne yapılacağına karar verir
  Kısacası dış dünyanın sistemimizle iletişim kurduğu yer*/

@RestController // Her iş yapan sınıfa yazdığımız gibi bu class ın da Controller olduğunu
				// belirttik
@RequestMapping("/api/products") // Dış dünyadan bize böyle bir istek gelirse bu controller karşılayacak
public class ProductsController {

	private ProductService productService;

	// Constructor Injection : Bir bağımlılığı cons. üzerinden enjekte edildi.

	@Autowired // Çalışma sırasında tüm projeyi taradı ve ProductService i implement eden
				// ProductManager ı new leyip otomatik olarak buraya verdi
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	// İstekler temel olarak 2 türlüdür ( HTTP Request leri )
	// Get ile bana veri ver
	// Post ile veri kaydet,düzenle

//	@GetMapping("/getall")
//	public List<Product> getAll() {
//		return this.productService.getAll();
//
//	}

	@GetMapping("/getall")
	public DataResult<List<Product>> getAll() {
		return this.productService.getAll();

	}

	@PostMapping("/add")
	public Result add(@RequestBody Product product) {
		System.out.println(product.getProductName());
		return this.productService.add(product);
	}
}
