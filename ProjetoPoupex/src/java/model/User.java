
package model;

import java.util.Date;

public class User {
    
    private int id_gestor;
    private String nme_gestor;
    private int mat_gestor;
    private Date data_nascimento;
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
     * @return the nme_gestor
     */
    public String getNme_gestor() {
        return nme_gestor;
    }

    /**
     * @param nme_gestor the nme_gestor to set
     */
    public void setNme_gestor(String nme_gestor) {
        this.nme_gestor = nme_gestor;
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
     * @return the data_nascimento
     */
    public Date getData_nascimento() {
        return data_nascimento;
    }

    /**
     * @param data_nascimento the data_nascimento to set
     */
    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
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
    }
}
