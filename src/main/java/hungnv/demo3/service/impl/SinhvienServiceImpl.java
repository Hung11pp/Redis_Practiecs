package hungnv.demo3.service.impl;

import hungnv.demo3.entity.Sinhvien;
import hungnv.demo3.repository.SinhVienRepository;
import hungnv.demo3.service.SinhVienService;
import org.springframework.cache.Cache;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@EnableCaching
public class SinhvienServiceImpl implements SinhVienService {
    private final SinhVienRepository sinhVienRepository;

    public SinhvienServiceImpl(SinhVienRepository sinhVienRepository) {
        this.sinhVienRepository = sinhVienRepository;
    }
    @Override
    @CacheEvict(value = "sinhvien", allEntries = true, beforeInvocation = true)
    public void createSinhvien(Sinhvien Sinhvien) {
        sinhVienRepository.save(Sinhvien);

    }
    @Cacheable("sinhvien")
    @Override
    public List<Sinhvien> getAllSinhvien() {
        List<Sinhvien> Sinhviens =   sinhVienRepository.findAll();
        return Sinhviens;
    }
    @Override
    @CacheEvict(value = "sinhvien", allEntries = true, beforeInvocation = true)
    public void deleteSinhvien(Long id) {
        sinhVienRepository.deleteById(id);
    }

    @Override
    @CacheEvict(value = "sinhvien", allEntries = true, beforeInvocation = true)
    public void updateSinhvien(Sinhvien Sinhvien) {
    }


}
