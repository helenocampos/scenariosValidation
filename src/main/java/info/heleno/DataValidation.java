/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.heleno;

/**
 *
 * @author helenocampos
 */
public class DataValidation{
  

  public boolean isValidUsername(String username){
      if (username == null) return false;
      return username.length() < 20 && username.length() > 0;
  }

  public boolean isValidEmail(String email){
    if(email==null) return false;
    if(email.contains("@") && !email.contains("#")){
      return true;
    }
    return false;
  }
}
