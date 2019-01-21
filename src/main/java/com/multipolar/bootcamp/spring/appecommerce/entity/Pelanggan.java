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
@Table(name = "pelanggan")
public class Pelanggan {
    
    @Id
    @GenericGenerator(name = "uuid_gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_gen")
    @Column(name = "id", nullable = false, unique = true)
    private String id;
    
    @Column(name = "nama", nullable = false, length = 100)
    private String nama;
    
    @Column(name = "id_pelanggan", nullable = false, length = 16, unique = true)
    private String idPelanggan;
    
    @Type(type = "text")
    @Column(name = "alamat")
    private String alamat;
    
}
