package br.com.cadPcs.repository;

import br.com.cadPcs.models.Pcs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PcsRepository extends JpaRepository <Pcs,Long>{
    Pcs findById(long id);
}
