package com.multipolar.bootcamp.spring.appecommerce.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "toko")
public class Toko {

    @Id
    @GenericGenerator(name = "uuid_gen", strategy = "uuid2");
    @GeneratedValue(generator = "uuid_gen")
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "id_produk", nullable = false)
    private String nama;

    @Column(name = "nomor_hp")
    private String nomor_hp;

    @Type(type = "text")
    @Column(name = "alamat_toko")
    private String alamat_toko;
}
