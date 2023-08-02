package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.controller;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.Fruita;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.repository.FruitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FruitaController {
    @Autowired
    FruitaRepository fruitaRepository;
    @PostMapping("/fruita/add")
    public ResponseEntity<Fruita> save(@RequestBody Fruita fruita) {

        try {
            Fruita _fruita = fruitaRepository
                    .save(new Fruita(fruita.getId(),fruita.getNom(), fruita.getQuantitatQuilos() ));
            return new ResponseEntity<>(_fruita, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/fruita/getAll")
    public ResponseEntity<List<Fruita>> getAllFruitas() {
        try {
            List<Fruita> list = fruitaRepository.findAll();

            if (list.isEmpty() || list.size() == 0){
                return new ResponseEntity<List<Fruita>>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<List<Fruita>>(list, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<> (null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/fruita/getOne/{id}")
    public ResponseEntity<Fruita> getSingleFruita(@PathVariable("id") long id) {
        Optional<Fruita> fruitaData = fruitaRepository.findById(id);

        if (fruitaData.isPresent()) {
            return new ResponseEntity<Fruita>(fruitaData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<Fruita>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/fruita/delete/{id}")
    public ResponseEntity<HttpStatus> deleteAllFruitas(@PathVariable long id) {
        try {
            Optional<Fruita> fruita = fruitaRepository.findById(id);
            if (fruita.isPresent()){
                fruitaRepository.delete(fruita.get());
            }
            return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/fruita/update")
    public ResponseEntity<Fruita> updateFruita(@RequestBody Fruita fruita) {
        try {
            return new ResponseEntity<Fruita>(fruitaRepository.save(fruita), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
