package uz.pdp.online.lesson_2_2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.pdp.online.lesson_2_2.Entity.Category;
import uz.pdp.online.lesson_2_2.Projection.CategoryCustom;
import uz.pdp.online.lesson_2_2.Repository.CategoryRepository;

import java.util.Optional;

@RestController
@RequestMapping("/api/product")
public class CategoryController {
    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping
    public HttpEntity<?> getCategory(){
    return ResponseEntity.ok(categoryRepository.findAll());
    }
    @PostMapping
    public HttpEntity<?> addCategory(@RequestBody Category category){
        return ResponseEntity.ok(categoryRepository.save(category));
    }
    @PutMapping("/{id}")
    public HttpEntity<?> editCategory(@PathVariable Integer id,@RequestBody Category category){
        Optional<Category> categoryRepositoryById = categoryRepository.findById(id);
    if(categoryRepositoryById.isPresent()){
        Category editCategory=categoryRepositoryById.get();
        editCategory.setCategory(category.getCategory());
        return ResponseEntity.ok(editCategory);
    }
    return ResponseEntity.notFound().build();
    }
    @DeleteMapping("/{id}")
    public HttpEntity<?> deleteCategory(@PathVariable Integer id){
        categoryRepository.deleteById(id);
        return ResponseEntity.ok().build();

    }



}
