/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webapp;


import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
/**
 *
 * @author vdementev
 */
@Named
@SessionScoped
public class ExampleBean implements Serializable {
    private String text = "CDI Example";

    private boolean flag[];

    public boolean[] getFlag() {
        return flag;
    }

    public void setFlag(boolean[] flag) {
        this.flag = flag;
    }

    public String getText(){
        return text;
    }
    
    public void setText(String text){
        this.text = text;
    }
                
}
