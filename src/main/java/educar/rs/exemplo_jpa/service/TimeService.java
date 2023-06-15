package educar.rs.exemplo_jpa.service;

import educar.rs.exemplo_jpa.entity.Time;
import educar.rs.exemplo_jpa.repository.Timerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeService {
    @Autowired
    private Timerepository timerepository;

    public Time salvarTime (Time time){
        timerepository.save(time);
        return timerepository.save(time);

    }
        public Time buscarTime (Long id){
            return timerepository.findById(id).get();
        }

        public List<Time> listarTime (){
            return  timerepository.findAll();
        }

        public void deletarTime (Long id){
            timerepository.deleteById(id);
        }
}
