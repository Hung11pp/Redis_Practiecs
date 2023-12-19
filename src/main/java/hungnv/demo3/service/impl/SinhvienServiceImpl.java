package hungnv.demo3.service.impl;

import hungnv.demo3.entity.Sinhvien;
import hungnv.demo3.repository.SinhVienRepository;
import hungnv.demo3.service.SinhVienService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SinhvienServiceImpl implements SinhVienService {
    private final SinhVienRepository sinhVienRepository;

    public SinhvienServiceImpl(SinhVienRepository sinhVienRepository) {
        this.sinhVienRepository = sinhVienRepository;
    }

    @Override
    public void createSinhvien(Sinhvien sinhvien) {
        sinhVienRepository.save(sinhvien);
    }
    @Cacheable("sinhviencache")
    @Override
    public List<Sinhvien> getAllSinhvien() {
        List<Sinhvien> sinhviens =   sinhVienRepository.findAll();
        return sinhviens;
    }
    @CacheEvict(value = "sinhVienCache", allEntries = true)
    @Override
    public void evictCache() {
    }

    @Override
    public void deleteSinhvien(Long id) {
        sinhVienRepository.deleteById(id);
    }
}
