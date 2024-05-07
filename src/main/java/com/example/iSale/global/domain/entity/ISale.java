package com.example.iSale.global.domain.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table
@Getter @AllArgsConstructor
@NoArgsConstructor
@Builder
public class ISale {
    @Id @GeneratedValue
    @Column(name = "ISALE_ID") // 분양 id
    private UUID iSale_id;

    @Column(name = "ISALE_IN") // 입주 가능일
    private String iSale_in;

    @Column(name = "ISALE_SELL_PRICE") // 분양가
    private Long iSale_sell_price;

    @Column(name = "ISALE_CATEGORY")
    private Integer iSale_category;

    @Column(name = "ISALE_NAME")
    private String iSale_name;

    @Column(name = "ISALE_AREA")
    private String iSale_area;

    @Column(name = "ISALE_ADDRESS")
    private String iSale_address;

    @OneToMany(mappedBy = "isale", cascade = CascadeType.REMOVE)
    private List<InterestISale> interestISales;

}
