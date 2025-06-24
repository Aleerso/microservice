package cl.duoc.Mimicroservicio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.Mimicroservicio.model.venta;
import cl.duoc.Mimicroservicio.repository.ventaRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class ventaService {
    @Autowired
    private ventaRepository ventarepository;

    public List<venta> BuscarTodaVenta(){
        return ventarepository.findAll();
    }
    
    
    public venta BuscarUnaVenta(long idventa){
        return ventarepository.findById(idventa).get();
        
        
    }




    
}
