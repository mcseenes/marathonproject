package com.enes.marathonproject.dto.request;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UrunEklemeRequestDto {
    private String ad;
    private String aciklama;
    private BigDecimal fiyat;
    private int stokDurumu;
    private String anaResimUrl;
    private Long markaId;
    private Long modelId;

}
