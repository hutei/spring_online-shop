package hutei.onlineshop.services;

import hutei.onlineshop.dto.Category;
import hutei.onlineshop.entities.CategoryEntity;
import hutei.onlineshop.repository.CategoryJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CategoryServiceImplementation implements CategoryService {

    @Autowired
   private CategoryJPARepository categoryRepository;
    @Override
    public CategoryEntity addCategory(Category category) {
        return categoryRepository.save(new CategoryEntity(category));
    }
}
