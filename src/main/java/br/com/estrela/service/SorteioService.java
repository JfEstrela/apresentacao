package br.com.estrela.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.estrela.repositoty.SorteioRepository;
import br.com.estrela.repositoty.entity.Sorteio;

@ApplicationScoped
public class SorteioService {

    @Inject
    SorteioRepository repository;
    
    public List<Sorteio> findAll(){
        return repository.findAll().list();
    }
    
    public void sortear() {
        Set<Integer> numerosSorteados = new TreeSet<>();
        Random random =  new Random();
        while (numerosSorteados.size() < 6) {
            numerosSorteados.add(random.nextInt(60)); 
        }
        Long qtdeSorteio = this.repository.findCountSorteio();
        LocalDate dtSorteia = LocalDate.now().plusDays(qtdeSorteio);
        Sorteio sorteio = new Sorteio(dtSorteia, numerosSorteados.toString());
        this.repository.persist(sorteio);
    }
}
