package hungnv.demo3.repository;

import hungnv.demo3.entity.Sinhvien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SinhVienRepository extends JpaRepository<Sinhvien,Long> {
}
