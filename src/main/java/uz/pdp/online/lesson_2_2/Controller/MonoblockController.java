package uz.pdp.online.lesson_2_2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.pdp.online.lesson_2_2.Entity.Laptop;
import uz.pdp.online.lesson_2_2.Entity.Monoblock;
import uz.pdp.online.lesson_2_2.Repository.MonoblockRepository;

import java.util.Optional;

@RestController
@RequestMapping("/api/monoblok")

public class MonoblockController {

    @Autowired
    MonoblockRepository monoblockRepository;

    @GetMapping
    public HttpEntity<?> getmonoblok() {
        return ResponseEntity.ok(monoblockRepository.findAll());
    }

    @PostMapping
    public HttpEntity<?> addmonoblok(@RequestBody Monoblock monoblock) {

        return   ResponseEntity.ok(monoblockRepository.save(monoblock));
    }

    @PutMapping("/{id}")
    public HttpEntity<?> editMonoblok(@PathVariable Integer id,@RequestBody Monoblock monoblock){
        Optional<Monoblock> monoblockOptional = monoblockRepository.findById(id);
        if(monoblockOptional.isPresent()){
            Monoblock editCategory=monoblockOptional.get();
            editCategory.setProduct(monoblock.getProduct());
            return ResponseEntity.ok(editCategory);
        }
        return ResponseEntity.notFound().build();
    }
    @DeleteMapping("/{id}")
    public HttpEntity<?> deletemonoblok(@PathVariable Integer id){
        monoblockRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
