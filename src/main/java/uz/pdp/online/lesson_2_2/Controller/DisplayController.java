package uz.pdp.online.lesson_2_2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.pdp.online.lesson_2_2.Entity.Category;
import uz.pdp.online.lesson_2_2.Entity.Display;
import uz.pdp.online.lesson_2_2.Repository.DisplayRepository;

import java.util.Optional;

@RestController
@RequestMapping("/api/display")
public class DisplayController {
    @Autowired
    DisplayRepository displayRepository;

    @GetMapping
    public HttpEntity<?> getCategory(){
        return ResponseEntity.ok(displayRepository.findAll());
    }

    @PostMapping
    public HttpEntity<?> addCategory(@RequestBody Display display){
        return ResponseEntity.ok(displayRepository.save(display));

    }

    @PutMapping("/{id}")
    public HttpEntity<?> editCategory(@PathVariable Integer id,@RequestBody Display display){
        Optional<Display> displayRepositoryById = displayRepository.findById(id);
        if(displayRepositoryById.isPresent()){
            Display editCategory=displayRepositoryById.get();
            editCategory.setId(display.getId());
            return ResponseEntity.ok(editCategory);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public HttpEntity<?> deleteCategory(@PathVariable Integer id){
        displayRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
