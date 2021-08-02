import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class table {

    JFrame jFrame;

    public table(){
        jFrame = new JFrame("Table Creation.");

        String data[][]= { {"1","Himanshu","Gupta"},
                           {"2","Rahul","Kumar"},
                           {"3","Satendar","Choudhary"},
                           {"4","Abhishek","Sharma"}
        };
        String column[]={"Id","First name","Last name"};

        JTable jTable = new JTable(data,column);

        //This line is used to enable the selection of the cell.
        jTable.setCellSelectionEnabled(true);

        //This line is used to get the type of selection we want to do in the table, single or multiple item selection.
        ListSelectionModel selectionModel = jTable.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        //This line of code is used to perform the action on the table.
        selectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String data = null;
                int[] rows = jTable.getSelectedRows();
                int[] cols = jTable.getSelectedColumns();

                for (int i=0;i<rows.length;i++)
                {
                    for (int j=0;j<cols.length;j++)
                    {
                        data = (String) jTable.getValueAt(rows[i],cols[j]);
                    }
                }
                System.out.println("Your selected data is "+data);
            }
        });

        JScrollPane jScrollPane = new JScrollPane(jTable);
        jFrame.add(jScrollPane);

      //  jFrame.setLayout(null); ----------------> It is made null to view the table.
        jFrame.setSize(400,400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new table();
    }
}
