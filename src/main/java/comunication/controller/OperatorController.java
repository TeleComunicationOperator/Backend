package comunication.controller;

import comunication.model.Operator;
import comunication.service.OperatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/operators")
@RequiredArgsConstructor
public class OperatorController {
    private final OperatorService operatorService;

    @GetMapping
    public ResponseEntity<List<Operator>> findAll(){
        return ResponseEntity.ok(operatorService.findAll());
    }
    @PostMapping
    public ResponseEntity<Operator> save(@RequestBody Operator operator){
        return ResponseEntity.ok(operatorService.save(operator));
    }

    @PutMapping("/id/{id}")
    public ResponseEntity<Operator> update(@RequestBody Operator operator,@PathVariable Integer id){
        return ResponseEntity.ok(operatorService.update(operator,id));
    }
}
