
package Residentes;

import com.csvreader.CsvWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * Luis Diaz
 * Cristian Ordoñez
 */
public class Residentes extends javax.swing.JFrame {
    
    private JFrame frame;
    
    private String Nom_bre;
    private String Docu_Mento;
    private String anti_Guedad;
    private String espe_cialidad;
    private String elec_tiva;
    private String des_canso;
    private String fe_chades;
    private String es_Principal;
    private String x;
    private String x1;
    private String y;
    private String Turnos_1;
    private String diurnos, nocturnos;
    
    private int A;
    private int B;
    private int dia;
    private int año;
    public int mes;
   
   

   
    public Residentes() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        primerAn = new javax.swing.JRadioButton();
        segundoAn = new javax.swing.JRadioButton();
        tercerAn = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        Documento = new javax.swing.JTextField();
        CodigoEstudiante = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        electivaSi = new javax.swing.JRadioButton();
        electivaNo = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        turnos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostrar = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        siReseso = new javax.swing.JRadioButton();
        noReseso = new javax.swing.JRadioButton();
        calendario = new com.toedter.calendar.JDateChooser();
        jPanel7 = new javax.swing.JPanel();
        especialidadPrincipal = new javax.swing.JComboBox<>();
        rotaion = new javax.swing.JComboBox<>();
        guardarYmostrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 450));
        setPreferredSize(new java.awt.Dimension(800, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cuadro de Turnos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 24), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(960, 500));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonGroup1.add(primerAn);
        primerAn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        primerAn.setForeground(new java.awt.Color(0, 0, 153));
        primerAn.setText("Primer año");
        primerAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primerAnActionPerformed(evt);
            }
        });

        buttonGroup1.add(segundoAn);
        segundoAn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        segundoAn.setForeground(new java.awt.Color(0, 0, 153));
        segundoAn.setText("Segundo año");
        segundoAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segundoAnActionPerformed(evt);
            }
        });

        buttonGroup1.add(tercerAn);
        tercerAn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tercerAn.setForeground(new java.awt.Color(0, 0, 153));
        tercerAn.setText("Tercer año");
        tercerAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tercerAnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(primerAn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(segundoAn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tercerAn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(primerAn)
                    .addComponent(segundoAn)
                    .addComponent(tercerAn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Documento:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Código Estudiante:");

        Nombre.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(CodigoEstudiante))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Documento)
                            .addComponent(Nombre))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Documento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CodigoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Electiva:");

        buttonGroup2.add(electivaSi);
        electivaSi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        electivaSi.setForeground(new java.awt.Color(0, 0, 153));
        electivaSi.setText("Si");
        electivaSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                electivaSiActionPerformed(evt);
            }
        });

        buttonGroup2.add(electivaNo);
        electivaNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        electivaNo.setForeground(new java.awt.Color(0, 0, 153));
        electivaNo.setText("No");
        electivaNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                electivaNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(electivaNo)
                    .addComponent(electivaSi))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(electivaSi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(electivaNo)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        turnos.setText("Turnos");
        turnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnosActionPerformed(evt);
            }
        });

        mostrar.setColumns(20);
        mostrar.setRows(5);
        jScrollPane1.setViewportView(mostrar);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(turnos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(turnos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("Descanso:");

        buttonGroup3.add(siReseso);
        siReseso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        siReseso.setForeground(new java.awt.Color(0, 51, 153));
        siReseso.setText("Si");
        siReseso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siResesoActionPerformed(evt);
            }
        });

        buttonGroup3.add(noReseso);
        noReseso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noReseso.setForeground(new java.awt.Color(0, 51, 153));
        noReseso.setText("No");
        noReseso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noResesoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(noReseso)
                            .addComponent(siReseso)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siReseso)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noReseso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        especialidadPrincipal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        especialidadPrincipal.setForeground(new java.awt.Color(0, 51, 153));
        especialidadPrincipal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Especialidad Principal", "Neonatologia", "Unidad de cuidados intensivos pediatricos" }));

        rotaion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rotaion.setForeground(new java.awt.Color(0, 51, 153));
        rotaion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rotacion", "Neumologia", "Infectologia", "Urgencias", "Neonatos", "Consulta Externa", "Neurologia", "UCI", "Cardiologia", "Hemato Oncologia", "Nefrologia", "CX Pediatrica", "Medicina Infantil" }));

        guardarYmostrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        guardarYmostrar.setForeground(new java.awt.Color(0, 51, 153));
        guardarYmostrar.setText("Guardar y Mostrar");
        guardarYmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarYmostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(especialidadPrincipal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(rotaion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guardarYmostrar)))
                .addGap(28, 28, 28))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(especialidadPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotaion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardarYmostrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        salir.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        salir.setForeground(new java.awt.Color(0, 51, 204));
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(salir)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(14, 14, 14)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salir)
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void turnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnosActionPerformed
        Random R = new Random();
        int L = R.nextInt(2)+1;
        
        if(L == 1)
        {
            x="Lunes"+"\nMiercoles"+"\nViernes"+"\nDomingo";
            x1="Lunes,Miercoles,Viernes,Domingo";
            diurnos="Domingo (7:00am - 7:00pm)";
            nocturnos="Lunes,Miercoles,Viernes (7:00 pm - 7:00 am)";
            y="Lunes, Viernes";
            mostrar.setText(x);
        }
        else
        {
            x = "Martes"+"\nJueves"+"\nSabado";
            x1 ="Martes,Jueves,Sabado";
            diurnos = "Sabado (7:00am - 7:00pm)";
            nocturnos = "Martes,Jueves (7:00pm - 7:00am)";
            y= "Martes, Jueves";
            mostrar.setText(x);}
    }//GEN-LAST:event_turnosActionPerformed

    private void primerAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primerAnActionPerformed
        primerAn.setSelected(true);
        segundoAn.setSelected(false);
        tercerAn.setSelected(false);
        
    }//GEN-LAST:event_primerAnActionPerformed

    private void segundoAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segundoAnActionPerformed
        primerAn.setSelected(false);
        segundoAn.setSelected(true);
        tercerAn.setSelected(false);
    }//GEN-LAST:event_segundoAnActionPerformed

    private void tercerAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tercerAnActionPerformed
        primerAn.setSelected(false);
        segundoAn.setSelected(false);
        tercerAn.setSelected(true);
    }//GEN-LAST:event_tercerAnActionPerformed

    private void guardarYmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarYmostrarActionPerformed
        Nom_bre = Nombre.getText();
        Docu_Mento = Documento.getText();
        if(primerAn.isSelected())
        {
            anti_Guedad = "Primer año ";
        }
       if(segundoAn.isSelected()){
           anti_Guedad = "Segundo año ";}
       if(tercerAn.isSelected()){
       anti_Guedad = "Tercer año ";
       }
       A = especialidadPrincipal.getSelectedIndex();
       switch (A){
           case 1:
           { espe_cialidad = "Neonatologia ";
             break;}
           case 2:
           { espe_cialidad = "Unidad de cuidados intensivos pediatricos";
             break;}
           default:
               break;
       }
       
        B = rotaion.getSelectedIndex();
         switch (B){
             case 1:
             {
                 elec_tiva = "Neumologia";
                 break;
             }
             case 2:
             {
                 elec_tiva = "Infectologia";
                 break;
             }
             case 3:
             {
                 elec_tiva = "Urgencias";
                 break;
             }
             case 4:
             {
                 elec_tiva = "Neonatos";
                 break;
             }
             case 5:
             {
                 elec_tiva = "Consulta externa";
                 break;
             }
             case 6:
             {
                 elec_tiva = "Neurologia";
                 break;
             }
             case 7:
             {
                 elec_tiva = "UCI";
                 break;
             }
             case 8:
             {
                 elec_tiva = "Cardiologia";
                 break;
             }
             case 9:
             {
                 elec_tiva = "Hemato oncologia";
                 break;
             }
             case 10:
             {
                elec_tiva = "Nefrologia";
                 break;
             }
             case 11:{
                 elec_tiva = "CX pediatrica";
                 break;
             }
             case 12:{
                 elec_tiva = "Medicina infantil";
                 break;
             }
         }
         
         if(electivaNo.isSelected()){
         elec_tiva = "no";
         if(siReseso.isSelected()){
             des_canso = "Si";
             dia = calendario.getCalendar().get(Calendar.DAY_OF_MONTH);
             mes = calendario.getCalendar().get(Calendar.MONTH);
             año = calendario.getCalendar().get(Calendar.YEAR);}
         if(noReseso.isSelected())
         {
             des_canso="No";
         }
            dia = 0;
            mes = -1;
            año = 0;
         
         
         if(primerAn.isSelected())
        {
            Turnos_1 = "Urgencias";
        }
         if(segundoAn.isSelected())
         {
             Turnos_1 = "Unidad Neonatal";
         }
         if(tercerAn.isSelected())
         {
             Turnos_1 = "Unidad Cuidados intensivos pediatricos";
         }
         DefaultTableModel modelo = new DefaultTableModel();
         jTable1.setModel(modelo);
         modelo.setRowCount(13);
         modelo.setColumnCount(2);
         modelo.setValueAt("Nombre", 0, 0);
         modelo.setValueAt("Documento", 1, 0);
         modelo.setValueAt("Antiguedad", 2, 0);
         modelo.setValueAt("Lugar", 3, 0);
         modelo.setValueAt("Especialidad principal", 4, 0);
         modelo.setValueAt("Especialidad", 5, 0);
         modelo.setValueAt("Electiva", 6, 0);
         modelo.setValueAt("Turnos", 7, 0);
         modelo.setValueAt("Diurno", 8, 0);
         modelo.setValueAt("Nocturno", 9, 0);
         modelo.setValueAt("Refuerzos", 10, 0);
         modelo.setValueAt("Descanso", 11, 0);
         modelo.setValueAt("Fecha Descanso", 12, 0);
         
         modelo.setValueAt(Nom_bre, 0, 1);
         modelo.setValueAt(Docu_Mento, 1, 1);
         modelo.setValueAt(anti_Guedad, 2, 1);
         modelo.setValueAt(Turnos_1, 3, 1);
         modelo.setValueAt(espe_cialidad, 4, 1);
         modelo.setValueAt(elec_tiva, 5, 1);
         modelo.setValueAt(des_canso, 6, 1);
         modelo.setValueAt(x1, 7, 1);
         modelo.setValueAt(diurnos, 8, 1);
         modelo.setValueAt(nocturnos, 9, 1);
         modelo.setValueAt(y, 10, 1);
         modelo.setValueAt(fe_chades, 11, 1);
         modelo.setValueAt(dia+"/"+(mes+1)+"/"+año, 12, 1);
         
         CsvWriter salidaCSV;
         
          try {
                salidaCSV = new CsvWriter(new FileWriter("Imprimir.csv", true), ',');
                salidaCSV.write("Nombre");
                salidaCSV.write("Documento");
                salidaCSV.write("Antiguedad");
                salidaCSV.write("Lugar");
                salidaCSV.write("Especialidad principal");
                salidaCSV.write("Especialidad de Rotación ");
                salidaCSV.write("Electiva");
                salidaCSV.write("Turnos");
                salidaCSV.write("Refuerzos");
                salidaCSV.write("Descanso");
                salidaCSV.write("Fecha Descanso");
           
                salidaCSV.endRecord(); 
                salidaCSV.write(Nom_bre);
                salidaCSV.write(Docu_Mento);
                salidaCSV.write(anti_Guedad);
                salidaCSV.write(Turnos_1);
                salidaCSV.write(espe_cialidad);
                salidaCSV.write(elec_tiva);
                salidaCSV.write(des_canso);
                salidaCSV.write(x1);
                salidaCSV.write(y);
                salidaCSV.write(fe_chades);
                salidaCSV.write(dia+"/"+(mes+1)+"/"+año);
                
                salidaCSV.endRecord();  
                salidaCSV.close(); 
                
           } catch (IOException ex) {
               Logger.getLogger(Residentes.class.getName()).log(Level.SEVERE, null, ex);
           }
         }
         
          if(electivaSi.isSelected()){
         des_canso = "si";
         DefaultTableModel modelo=new DefaultTableModel();
         jTable1.setModel(modelo);
         
         modelo.setRowCount(7);
         modelo.setColumnCount(2);
         modelo.setValueAt("Nombre", 0, 0);
         modelo.setValueAt("Documento", 1, 0);
         modelo.setValueAt("Antiguedad", 2, 0);
         modelo.setValueAt("Especialidad principal", 3, 0);
         modelo.setValueAt("Especialidad", 4, 0);
         modelo.setValueAt("Electiva", 5, 0);
         modelo.setValueAt("Turno", 6, 0);
        
         
         modelo.setValueAt(Nom_bre, 0, 1);
         modelo.setValueAt(Docu_Mento, 1, 1);
         modelo.setValueAt(anti_Guedad, 2, 1);
         modelo.setValueAt(espe_cialidad, 3, 1);
         modelo.setValueAt(elec_tiva, 4, 1);
         modelo.setValueAt(des_canso, 5, 1);
         modelo.setValueAt("No", 6, 1);
         
         CsvWriter salida1CSV;
         try {
                salida1CSV = new CsvWriter(new FileWriter("Impreso.csv", true), ',');
                salida1CSV.write("Nombre");
                salida1CSV.write("Documento");
                salida1CSV.write("Antiguedad");
                salida1CSV.write("Especialidad principal");
                salida1CSV.write("Especialidad ");
                salida1CSV.write("Electiva");
                salida1CSV.write("Turno");
           
                salida1CSV.endRecord(); 
                
                salida1CSV.write(Nom_bre);
                salida1CSV.write(Docu_Mento);
                salida1CSV.write(anti_Guedad);
                salida1CSV.write(espe_cialidad);
                salida1CSV.write(elec_tiva);
                salida1CSV.write(des_canso);
                salida1CSV.write("NO");
                
               
                
                salida1CSV.endRecord();  
                salida1CSV.close(); 
                
           } catch (IOException ex) {
               Logger.getLogger(Residentes.class.getName()).log(Level.SEVERE, null, ex);
           }
        
         
         
         }
      mostrar.setText(" ");
      Nombre.setText(" ");
      Documento.setText(" ");
      calendario.setDate(null);
      jTable1.setEnabled(false);
              
    }//GEN-LAST:event_guardarYmostrarActionPerformed

    private void electivaSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_electivaSiActionPerformed
        electivaSi.setSelected(true);
        electivaNo.setSelected(false);
    }//GEN-LAST:event_electivaSiActionPerformed

    private void electivaNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_electivaNoActionPerformed
        electivaSi.setSelected(false);
        electivaNo.setSelected(true);
    }//GEN-LAST:event_electivaNoActionPerformed

    private void siResesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siResesoActionPerformed
        siReseso.setSelected(true);
        noReseso.setSelected(false);
    }//GEN-LAST:event_siResesoActionPerformed

    private void noResesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noResesoActionPerformed
         siReseso.setSelected(false);
        noReseso.setSelected(true);
    }//GEN-LAST:event_noResesoActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        frame = new JFrame();
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Cuadro de turnos 1",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_salirActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Residentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Residentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Residentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Residentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Residentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CodigoEstudiante;
    private javax.swing.JTextField Documento;
    private javax.swing.JTextField Nombre;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private com.toedter.calendar.JDateChooser calendario;
    private javax.swing.JRadioButton electivaNo;
    private javax.swing.JRadioButton electivaSi;
    private javax.swing.JComboBox<String> especialidadPrincipal;
    private javax.swing.JButton guardarYmostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea mostrar;
    private javax.swing.JRadioButton noReseso;
    private javax.swing.JRadioButton primerAn;
    private javax.swing.JComboBox<String> rotaion;
    private javax.swing.JButton salir;
    private javax.swing.JRadioButton segundoAn;
    private javax.swing.JRadioButton siReseso;
    private javax.swing.JRadioButton tercerAn;
    private javax.swing.JButton turnos;
    // End of variables declaration//GEN-END:variables
}
