import javax.swing.*;
import javax.swing.text.PlainDocument;
import javax.swing.text.*;

public class JTextFieldLimit extends PlainDocument {
    // Attributes
    private int limit;
    // Constructor
    public JTextFieldLimit(int limitParameter){
        super();
        this.limit = limitParameter;
    }
    // Methods for limit the number in JTextField
    @Override
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException { // OffSet -> Position where the text inserted, str -> String inserted, attr -> Attributes inserted
        if (str == null)
            return;
        if ((getLength() + str.length()) <= limit) {
            super.insertString(offset, str, attr);
        }
    }
}
