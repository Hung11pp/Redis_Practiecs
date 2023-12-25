package hungnv.demo3.entity;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "sinhvien")
public class Sinhvien implements Serializable {
    @Id
    @Column(name = "Masv")
    private long MaSV;
    @Column(name = "Hotensv")
    private String HotenSV;
    @Column(name = "Namsinh")
    private String NamSinh;
    @Column(name = "Quequan")
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
