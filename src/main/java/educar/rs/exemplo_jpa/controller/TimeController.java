package educar.rs.exemplo_jpa.controller;

import educar.rs.exemplo_jpa.entity.Time;
import educar.rs.exemplo_jpa.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class TimeController {
    @Autowired
    private TimeService timeService;

    @PostMapping("time")
    public Time salvaTime(@RequestBody Time time) {
        return timeService.salvarTime(time);

    }
    @GetMapping("/time/{id}")
    public Time buscarTime (@PathVariable Long id){
        return timeService.buscarTime(id);
    }
    @GetMapping ("times")
    public List<Time> listarTime (){
        return timeService.listarTime();
    }

    @GetMapping ("deletar/{id}")
    public void deletarTime (@PathVariable Long id){
         timeService.deletarTime(id);
    }
}
