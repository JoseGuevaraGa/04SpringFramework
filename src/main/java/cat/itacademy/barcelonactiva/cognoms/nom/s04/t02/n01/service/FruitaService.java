package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.service;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.Fruita;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.repository.FruitaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class FruitaService {

    @Autowired
    private FruitaRepository fruitaRepository;
    public Fruita saveFruita(Fruita fruita){
        return fruitaRepository.save(fruita);
    }

    public Fruita updateFruita(Fruita fruita){
        return fruitaRepository.save(fruita);
    }

    public List<Fruita> getAll() {
        return fruitaRepository.findAll();
    }

    public String delete(Long id){
        fruitaRepository.deleteById(id);
        return "OK";
    }
    public Fruita getId(Long id) {
        Optional<Fruita> fruitaData = fruitaRepository.findById(id);
        if (fruitaData.isPresent()) {
            return fruitaData.get();
        } else {
            return new Fruita();
        }
    }


    //public ResponseEntity<Fruita> getSingleFruita(@PathVariable("id") long id) {
    //    Optional<Fruita> fruitaData = fruitaRepository.findById(id);

    //    if (fruitaData.isPresent()) {
    //        return new ResponseEntity<Fruita>(fruitaData.get(), HttpStatus.OK);
    //    } else {
    //        return new ResponseEntity<Fruita>(HttpStatus.NOT_FOUND);
    //    }
    //}

}
