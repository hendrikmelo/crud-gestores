
package br.com.DTO;

import java.sql.Date;

public class GestorDTO {
    private int id_gestor;
    private String nome_gestor;
    private int mat_gestor;
    private Date date_nasc_gestor;
    private String setor_gestor; 

    /**
     * @return the id_gestor
     */
    public int getId_gestor() {
        return id_gestor;
    }

    /**
     * @param id_gestor the id_gestor to set
     */
    public void setId_gestor(int id_gestor) {
        this.id_gestor = id_gestor;
    }

    /**
     * @return the nome_gestor
     */
    public String getNome_gestor() {
        return nome_gestor;
    }

    /**
     * @param nome_gestor the nome_gestor to set
     */
    public void setNome_gestor(String nome_gestor) {
        this.nome_gestor = nome_gestor;
    }

    /**
     * @return the mat_gestor
     */
    public int getMat_gestor() {
        return mat_gestor;
    }

    /**
     * @param mat_gestor the mat_gestor to set
     */
    public void setMat_gestor(int mat_gestor) {
        this.mat_gestor = mat_gestor;
    }

    /**
     * @return the date_nasc_gestor
     */
    public Date getDate_nasc_gestor() {
        return date_nasc_gestor;
    }

    /**
     * @param date_nasc_gestor the date_nasc_gestor to set
     */
    public void setDate_nasc_gestor(Date date_nasc_gestor) {
        this.date_nasc_gestor = date_nasc_gestor;
    }

    /**
     * @return the setor_gestor
     */
    public String getSetor_gestor() {
        return setor_gestor;
    }

    /**
     * @param setor_gestor the setor_gestor to set
     */
    public void setSetor_gestor(String setor_gestor) {
        this.setor_gestor = setor_gestor;
    }}
