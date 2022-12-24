package tshokwe.springeducation.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import tshokwe.springeducation.entities.concretes.Product;

/*    ->  Interface başka bir interface i extends eder.
	  ->  Buradaki JpaRepository, @Entity annotation ile süslenmiş  nesneyi (bizim örnekteki product) ve
	  product tablosunda, PK alanındaki veri tipini alarak  arka planda bizim için sorguları ayarlar.
	  ->  Java projelerinde, buradaki ProductDao yu ProductRepository olarak da görebilirsin. Bunlar aynı şeyler
	  */

public interface ProductDao extends JpaRepository<Product, Integer> {

}
