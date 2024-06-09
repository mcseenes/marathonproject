package com.enes.marathonproject.entity;

import com.enes.marathonproject.entity.enums.Beden;
import com.enes.marathonproject.entity.enums.Cinsiyet;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tblurunozelligi")
public class UrunOzelligi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

     String kategoriAdi;
     String ozellikAdi;
     String aciklama;
    Cinsiyet cinsiyet;
    Beden beden;

    @ManyToOne
    @JoinColumn(name = "urun_id")
    private Urun urun;

    // Getters and Setters
}