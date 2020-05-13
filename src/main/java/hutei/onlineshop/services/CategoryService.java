package hutei.onlineshop.services;

import hutei.onlineshop.dto.Category;
import hutei.onlineshop.entities.CategoryEntity;

public interface CategoryService {
    public CategoryEntity addCategory(Category category);
}
