package hungnv.demo3.controller;

import hungnv.demo3.service.SinhVienService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/sinhvien")
@CrossOrigin("*")
public class SinhvienController {
    private final SinhVienService sinhVienService;

    public SinhvienController(SinhVienService sinhVienService) {
        this.sinhVienService = sinhVienService;
    }

    @GetMapping("")
    public ResponseEntity<?> getAllSinhvien ( ) {
        return new ResponseEntity<>(sinhVienService.getAllSinhvien(), HttpStatus.OK);
    }

}
