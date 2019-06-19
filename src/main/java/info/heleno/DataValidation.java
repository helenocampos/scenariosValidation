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
  String[] chars = {"@", "."};

  public boolean isValidUsername(String username){
      if (username == null) return false;
      return username.length() < 20 && username.length() > 0;
  }

  public boolean isValidEmail(String email){
    if(email.contains(chars[0]) && email.contains(chars[1])){
      return true;
    }
    return false;
  }
}
