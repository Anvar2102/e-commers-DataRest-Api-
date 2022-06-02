package uz.pdp.online.lesson_2_2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.pdp.online.lesson_2_2.Entity.Computer;
import uz.pdp.online.lesson_2_2.Repository.ComputerRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/compyter")

public class CompyterController {

    @Autowired
    ComputerRepository computerRepository;

    @GetMapping
    public HttpEntity<?> getCompyter() {
        return ResponseEntity.ok(computerRepository.findAll());
    }

    @PostMapping
    public HttpEntity<?> addCompyter(@RequestBody Computer computer) {
        return ResponseEntity.ok(computerRepository.save(computer));
    }

    @PutMapping("/{id}")
    public HttpEntity<?> editCompyter(@RequestBody Computer computer, @PathVariable Integer id) {
        Optional<Computer> computerRepositoryById = computerRepository.findById(id);
        if (computerRepositoryById.isPresent()) {
            Computer editcomyter = computerRepositoryById.get();
            editcomyter.setId(id);
            return ResponseEntity.ok().build();

        }
        return ResponseEntity.notFound().build();

    }
    @DeleteMapping("/{id}")
    public HttpEntity<?> deleteCategory(@PathVariable Integer id){
        computerRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

}

