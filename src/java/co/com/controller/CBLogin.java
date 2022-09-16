/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.controller;

/**
 *
 * @author Felipe Quiros
 */

/*import java.util.HashSet;*/
/*import java.util.Set;*/
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

@Named(value = "cBLogin")
@RequestScoped
public class CBLogin {

    
   private String usuario;
   private String password;
   private final HttpServletRequest httpServletRequest;
   private final FacesContext facesContext;
   private FacesMessage facesMessage;
    
    public CBLogin() {
        facesContext = FacesContext.getCurrentInstance();
        httpServletRequest = (HttpServletRequest) facesContext.getExternalContext().getRequest();
        
    }
    
    public String login(){
        
        if((usuario.equals("JUAN")) && password.equals("1234")){
            httpServletRequest.getSession().setAttribute("sessionUsuario", usuario);
            facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Acceso Correcto", null);
            facesContext.addMessage(null, facesMessage);
            return "index";
        }else{
            
            facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario o contraseña incorrecta", null);
            facesContext.addMessage(null, facesMessage);
            return "index";
        }
        
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
}

