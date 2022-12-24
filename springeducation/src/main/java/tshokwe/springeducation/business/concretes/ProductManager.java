package tshokwe.springeducation.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tshokwe.springeducation.business.abstracts.ProductService;
import tshokwe.springeducation.core.utilites.results.DataResult;
import tshokwe.springeducation.core.utilites.results.Result;
import tshokwe.springeducation.core.utilites.results.SuccessDataResult;
import tshokwe.springeducation.core.utilites.results.SuccessResult;
import tshokwe.springeducation.dataAccess.abstracts.ProductDao;
import tshokwe.springeducation.entities.concretes.Product;

@Service // Bu class service görevi görecek bilgisi verilir.
public class ProductManager implements ProductService {

	// Dependancy Injection yapılarak, dataAccess katmanıyla haberleşmek için
	// yapıldı.
	// Interface kullanılarak gevşek bağımlı olması sağlandı.
	private ProductDao productDao;

	// Constructor Injection : Bir bağımlılığı cons. üzerinden enjekte edildi.
	// Spring arka planda buna karşılık gelebilecek (ProductDao nun instance ı
	// olabilecek) bir tane sınıfı üretiyor ve new leyip veriyor)

	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<Product>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(), "Data Listelendi");
	}

	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Ürün Eklendi");
	}

}
