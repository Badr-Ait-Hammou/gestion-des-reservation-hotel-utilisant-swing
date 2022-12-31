/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package front;

import javax.swing.Icon;

/**
 *
 * @author Badr
 */
 


public class ModelCard {
     private Icon icon;
    private String title;
  //  private String values;
    private String val;

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setVal(String val) {
        this.val = val;
    }
    

    public Icon getIcon() {
        return icon;
    }

    public String getTitle() {
        return title;
    }

    public String getVal() {
        return val;
    }

    public ModelCard(Icon icon, String title, String val) {
        this.icon = icon;
        this.title = title;
        this.val = val;
    }
     public ModelCard( String val) {
      
        this.val = val;
    }
    
   

   

}
