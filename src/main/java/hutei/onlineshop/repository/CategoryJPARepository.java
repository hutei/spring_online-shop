package hutei.onlineshop.repository;

import hutei.onlineshop.entities.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryJPARepository extends JpaRepository<CategoryEntity, Integer> {
    CategoryEntity findByName(String name);
}
