package br.com.estrela.repositoty;

import javax.enterprise.context.ApplicationScoped;

import br.com.estrela.repositoty.entity.Sorteio;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class SorteioRepository implements PanacheRepositoryBase<Sorteio, Long>{

    public Long findCountSorteio() {
        return count();
    }
}
