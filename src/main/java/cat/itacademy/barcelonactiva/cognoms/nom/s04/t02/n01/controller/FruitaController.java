package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.controller;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.Fruita;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.repository.FruitaRepository;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.service.FruitaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class FruitaController {

    @Autowired
    private FruitaService fruitaService;

    @PostMapping("/fruita/add")
    public Fruita saveFruita(@RequestBody Fruita fruita){
        return fruitaService.saveFruita(fruita);
    }
    @GetMapping("/fruita/getAll")
    public List<Fruita> getAll() {
        return fruitaService.getAll();
    }

    @PutMapping("/fruita/update")
    public Fruita updateFruita(@RequestBody Fruita fruita){
        return fruitaService.updateFruita(fruita);
    }

    @GetMapping("/fruita/getOne/{id}")
    public Fruita getOne(@PathVariable Long id) {
        return fruitaService.getId(id);
    }

    @DeleteMapping("/fruita/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        String resp = fruitaService.delete(id);
        if("OK".equalsIgnoreCase(resp)){
            return new ResponseEntity<>(resp, HttpStatus.NO_CONTENT);
        }else {
            return new ResponseEntity<>(resp, HttpStatus.NOT_FOUND);
        }
    }


}
