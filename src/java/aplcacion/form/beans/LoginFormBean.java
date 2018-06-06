/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplcacion.form.beans;

import aplicacion.datos.ListaUsuario;
import aplicacion.dominio.Usuario;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author CX
 */
@ManagedBean
@ViewScoped
public class LoginFormBean implements Serializable{
    private String user;
    private String pass;

    /**
     * Creates a new instance of UsuarioFormBean
     */
    public LoginFormBean() {
    }
    
    public String validarUsuario(){
        String res=null;
        Usuario usuario=null;
        ListaUsuario usuarios=new ListaUsuario();
        usuario=usuarios.validarUsuario(user,pass);
        if(usuario==null){
            FacesMessage mensaje=new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "Credenciales Invalidas","El nombre de usuario o contraseña son incorrectos"); 
            FacesContext.getCurrentInstance().addMessage(null, mensaje);
        }
        else{
            FacesMessage mensaje=new FacesMessage(FacesMessage.SEVERITY_INFO,
                    "Ingreso Correcto","Bienvenido de nuevo "+usuario.getUsario());
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuarioValidado",usuario);
            res="/Electrodomesticos";
        }
        return res;
    }
    
    public String getNombreUsuarioValidado(){
        Usuario usuario=(Usuario)FacesContext.getCurrentInstance()
                .getExternalContext().getSessionMap().get("usuarioValidado");
        return usuario.getUsario();
    }
    
    public String cerrarSesion(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        FacesMessage facesMessage=new FacesMessage(FacesMessage.SEVERITY_INFO,"Sesion Cerrada","Ha finalizado su sesion");
        FacesContext.getCurrentInstance().addMessage(null, facesMessage);
        String resultado="/Login";
        return resultado;
    }
    
    public boolean verificarSesion(){
        boolean sesionValida=false;
        if(FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuarioValidado")!=null)
            sesionValida=true;
        return sesionValida;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }
    
}
