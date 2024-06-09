package com.enes.marathonproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tblmarka")
public class Marka {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

     String ad;

    @OneToMany(mappedBy = "marka")
     List<Urun> urunler;


    // Getters and Setters
}