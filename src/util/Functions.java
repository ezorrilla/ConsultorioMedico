
package util;

public class Functions {
    
    public static void jComboSelectItemByKey(javax.swing.JComboBox cbo, String key){
        for (int i = 0; i < cbo.getItemCount(); i++) {
            if ( ((util.ComboItem)cbo.getItemAt(i)).getKey().equalsIgnoreCase(key) ) {
                cbo.setSelectedIndex(i); break;
            }
        }
    }
    public static void jComboSelectItemByValue(javax.swing.JComboBox cbo, String value){
        for (int i = 0; i < cbo.getItemCount(); i++) {
            if ( ((util.ComboItem)cbo.getItemAt(i)).getValue().equalsIgnoreCase(value) ) {
                cbo.setSelectedIndex(i); break;
            }
        }
    }
}
