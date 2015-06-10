package com.isam;

/**
 * Created by Muhammad Isam on 10/06/2015.
 */
public class Buku {

    private String namaBuku;
    private Double hargaBuku;
    private String penerbitBuku;
    private Penulis createdBy;

    public Buku() {
    }

    public Buku(String namaBuku, Double hargaBuku, String penerbitBuku, Penulis createdBy) {
        this.namaBuku = namaBuku;
        this.hargaBuku = hargaBuku;
        this.penerbitBuku = penerbitBuku;
        this.createdBy = createdBy;
    }

    public String getNamaBuku() {
        return namaBuku;
    }

    public void setNamaBuku(String namaBuku) {
        this.namaBuku = namaBuku;
    }

    public Double getHargaBuku() {
        return hargaBuku;
    }

    public void setHargaBuku(Double hargaBuku) {
        this.hargaBuku = hargaBuku;
    }

    public String getPenerbitBuku() {
        return penerbitBuku;
    }

    public void setPenerbitBuku(String penerbitBuku) {
        this.penerbitBuku = penerbitBuku;
    }

    public Penulis getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Penulis createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public String toString() {
        return "Buku{" +
                "\nNama Buku='" + namaBuku + '\'' +
                "\nHarga Buku=" + hargaBuku +
                "\nPenerbit Buku='" + penerbitBuku + '\'' +
                "\nCreated By=" + createdBy +
                '}';
    }
}
