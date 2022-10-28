package com.example.restTemplate.entity;

import javax.persistence.*;
import java.io.Serializable;

public class ChungNhan implements Serializable {

    private NhanVien maNV;


    private MayBay maMB;

    public ChungNhan() {
    }

    public ChungNhan(MayBay mayBay, NhanVien nhanVien) {
        this.maMB = mayBay;
        this.maNV = nhanVien;
    }
}