package hungnv.demo3.service;

import hungnv.demo3.entity.Sinhvien;

import java.util.List;

public interface SinhVienService {
   void createSinhvien (Sinhvien Sinhvien);

   List<Sinhvien> getAllSinhvien();

   void deleteSinhvien(Long id);

   void updateSinhvien(Sinhvien Sinhvien);
}
