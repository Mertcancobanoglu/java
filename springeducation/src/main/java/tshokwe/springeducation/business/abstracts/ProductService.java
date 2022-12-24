package tshokwe.springeducation.business.abstracts;

import java.util.List;

import tshokwe.springeducation.core.utilites.results.DataResult;
import tshokwe.springeducation.core.utilites.results.Result;
import tshokwe.springeducation.entities.concretes.Product;

public interface ProductService {

	DataResult<List<Product>> getAll();

	Result add(Product product);
}
