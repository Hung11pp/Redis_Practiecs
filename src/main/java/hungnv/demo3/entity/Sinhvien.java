package hungnv.demo3.entity;
import jakarta.persistence.*;

@Entity
public class Sinhvien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long MaSV;
    @Column
    private String HotenSV;
    @Column
    private String NamSinh;
    @Column
    private String Quequan;

    public long getMaSV() {
        return MaSV;
    }

    public void setMaSV(long maSV) {
        MaSV = maSV;
    }

    public String getHotenSV() {
        return HotenSV;
    }

    public void setHotenSV(String hotenSV) {
        HotenSV = hotenSV;
    }

    public String getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(String namSinh) {
        NamSinh = namSinh;
    }

    public String getQuequan() {
        return Quequan;
    }

    public void setQuequan(String quequan) {
        Quequan = quequan;
    }

}
