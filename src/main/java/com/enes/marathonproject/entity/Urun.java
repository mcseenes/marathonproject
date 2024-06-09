package com.enes.marathonproject.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tblurun")
public class Urun {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  String ad;
    private   String aciklama;
    private   BigDecimal fiyat;
    private   int stokDurumu;
    private   String anaResimUrl;
    @Size(max=3)
    private   String altResimUrl;

    @OneToMany(mappedBy = "urun", cascade = CascadeType.ALL)

    @ManyToOne
    @JoinColumn(name = "marka_id")
     Marka marka;

    @ManyToOne
    @JoinColumn(name = "model_id")
     Model model;


}
