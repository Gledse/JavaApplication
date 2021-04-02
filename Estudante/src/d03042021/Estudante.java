/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d03042021;

/**
 *
 * @author Gledse_Jamisse
 */
public class Estudante {
    private int codigo;
    private String nome;
    private String sexo;
    private String estadocivil;
    
    public Estudante(){
        codigo = 0;
        nome = "";
        sexo = "";
    }
    public int getCodigo() {
        return codigo;
    }
    
    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }
    

}
