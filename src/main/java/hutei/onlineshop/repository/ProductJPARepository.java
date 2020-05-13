package hutei.onlineshop.repository;

import hutei.onlineshop.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductJPARepository extends JpaRepository<ProductEntity, Integer> {
    List<ProductEntity> findAllByCategoryName(String name);
    List<ProductEntity> FindAllBetweenPrice(Integer min, Integer max);


}
