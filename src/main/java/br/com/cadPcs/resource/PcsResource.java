package br.com.cadPcs.resource;

import br.com.cadPcs.models.Pcs;
import br.com.cadPcs.repository.PcsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class PcsResource {

    @Autowired
    PcsRepository pcsRepository;

    @GetMapping("/pcs")
    public List<Pcs> listOffPcs(){
        return pcsRepository.findAll();
    }
    @GetMapping("/pcs{id}")
    public Pcs pcsById(@PathVariable(value="id")long id){
        return pcsRepository.findById(id);
    }
    @PostMapping("/pcs")
    public Pcs savePcs(@RequestBody Pcs pcs){
        return pcsRepository.save(pcs);
    }
    @DeleteMapping("/pcs")
    public void deletePcs(@RequestBody Pcs pcs){
        pcsRepository.delete(pcs);
    }
    @PutMapping("pcs")
    public Pcs toUpdatePcs(@RequestBody Pcs pcs){
        return pcsRepository.save(pcs);
    }
}
