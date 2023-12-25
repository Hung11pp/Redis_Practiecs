package hungnv.demo3.controller;

import hungnv.demo3.entity.Sinhvien;
import hungnv.demo3.service.SinhVienService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sinhvien")
public class SinhvienController {
    private final SinhVienService sinhVienService;

    public SinhvienController(SinhVienService sinhVienService) {
        this.sinhVienService = sinhVienService;
    }

    @GetMapping("/getall")
    public ResponseEntity<?> getAllSinhvien ( ) {
        List<Sinhvien> sinhviens = sinhVienService.getAllSinhvien();
        return new ResponseEntity<>(sinhviens, HttpStatus.OK);
    }

    @PostMapping("/add-sinh-vien")
    public ResponseEntity<?> addSinhvien (@RequestBody Sinhvien sinhvien){
        sinhVienService.createSinhvien(sinhvien);
        return new ResponseEntity<>(sinhvien, HttpStatus.OK);
    }
    @DeleteMapping("/delete-sinh-vien/{id}")
    public ResponseEntity<?> deleteSinhvien (@PathVariable Long id){
        sinhVienService.deleteSinhvien(id);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}
