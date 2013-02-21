/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.school.studentportal.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Hanifa
 */
@Entity @Table(name="t_peserta")
public class Peserta {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;
    
    @NotNull @NotEmpty
    @Column(nullable=false)
    private String nama;
     
    @NotNull @NotEmpty
    @Column(nullable=false)
    private String nomor;
    
    @NotNull
    @OneToOne
    @JoinColumn(name="id_jenis_peserta")
    private JenisPeserta jenis;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public JenisPeserta getJenis() {
        return jenis;
    }

    public void setJenis(JenisPeserta jenis) {
        this.jenis = jenis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }
    
    
}
