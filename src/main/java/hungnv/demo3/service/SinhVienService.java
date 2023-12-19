package hungnv.demo3.service;

import hungnv.demo3.entity.Sinhvien;

import java.util.List;

public interface SinhVienService {
   void createSinhvien (Sinhvien sinhvien);

   List<Sinhvien> getAllSinhvien();

   void deleteSinhvien(Long id);
   public void evictCache();
}
