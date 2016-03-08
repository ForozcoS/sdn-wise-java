/* 
 * Copyright (C) 2015 SDN-WISE
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.github.sdnwiselab.sdnwise.controller;

import com.github.sdnwiselab.sdnwise.flowtable.FlowTableEntry;
import com.github.sdnwiselab.sdnwise.packet.DataPacket;
import com.github.sdnwiselab.sdnwise.util.NodeAddress;
import java.awt.HeadlessException;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sebastiano Milardo
 */
public final class ControllerGui extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    private final Charset UTF8_CHARSET = Charset.forName("UTF-8");
    private final transient AbstractController controller;

    /**
     * Creates new form ControllerGui
     *
     * @param controller
     */
    public ControllerGui(AbstractController controller) {
        this.controller = controller;
        initComponents();
        setIconImage(getToolkit().getImage(
                getClass().getResource("/sdn-wise_icon.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinnerNetID = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSpinnerAddrL = new javax.swing.JSpinner();
        jSpinnerAddrH = new javax.swing.JSpinner();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButtonAddAccepted1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButtonReadParams = new javax.swing.JButton();
        jButtonWriteParams = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSpinnerBeacon = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jSpinnerReport = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jSpinnerTTL = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jSpinnerRSSI = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFlow = new javax.swing.JTable();
        jButtonReadFlows = new javax.swing.JButton();
        jButtonRemoveFlow = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAccepted = new javax.swing.JTable();
        jButtonAddAccepted = new javax.swing.JButton();
        jButtonRemoveAccepted = new javax.swing.JButton();
        jButtonReadAccepted = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SDN-WISE");

        jSpinnerNetID.setModel(new javax.swing.SpinnerNumberModel(1, 0, 255, 1));

        jLabel1.setText("Destination Node Address");

        jLabel2.setText("Network ID");

        jSpinnerAddrL.setModel(new javax.swing.SpinnerNumberModel(1, 1, 255, 1));

        jSpinnerAddrH.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Send a Data Packet"));

        jButtonAddAccepted1.setText("Send");
        jButtonAddAccepted1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddAccepted1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonAddAccepted1)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAddAccepted1)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Read/Write Config Parameters"));

        jButtonReadParams.setText("Read");
        jButtonReadParams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReadParamsActionPerformed(evt);
            }
        });

        jButtonWriteParams.setText("Write");
        jButtonWriteParams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWriteParamsActionPerformed(evt);
            }
        });

        jLabel3.setText("Beacon Period");

        jSpinnerBeacon.setModel(new javax.swing.SpinnerNumberModel(0, 0, 65535, 1));

        jLabel4.setText("Report Period");

        jSpinnerReport.setModel(new javax.swing.SpinnerNumberModel(0, 0, 65535, 1));

        jLabel5.setText("TTL Max");

        jSpinnerTTL.setModel(new javax.swing.SpinnerNumberModel(Short.valueOf((short)0), Short.valueOf((short)0), Short.valueOf((short)255), Short.valueOf((short)1)));

        jLabel6.setText("RSSI Min");

        jSpinnerRSSI.setModel(new javax.swing.SpinnerNumberModel(Short.valueOf((short)0), Short.valueOf((short)0), Short.valueOf((short)255), Short.valueOf((short)1)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSpinnerRSSI, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSpinnerBeacon)
                            .addComponent(jSpinnerTTL)
                            .addComponent(jSpinnerReport)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonWriteParams)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonReadParams)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jSpinnerBeacon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jSpinnerReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jSpinnerTTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jSpinnerRSSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonReadParams)
                    .addComponent(jButtonWriteParams))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Node", jPanel1);

        jTableFlow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rule"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableFlow.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(jTableFlow);

        jButtonReadFlows.setText("Refresh");
        jButtonReadFlows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReadFlowsActionPerformed(evt);
            }
        });

        jButtonRemoveFlow.setText("Remove");
        jButtonRemoveFlow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveFlowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonReadFlows)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRemoveFlow))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRemoveFlow)
                    .addComponent(jButtonReadFlows))
                .addContainerGap())
        );

        jTabbedPane1.addTab("WISE Flow Table", jPanel2);

        jTableAccepted.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", ""
            }
        ));
        jTableAccepted.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableAccepted.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jTableAccepted);

        jButtonAddAccepted.setText("Add");
        jButtonAddAccepted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddAcceptedActionPerformed(evt);
            }
        });

        jButtonRemoveAccepted.setText("Remove");
        jButtonRemoveAccepted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveAcceptedActionPerformed(evt);
            }
        });

        jButtonReadAccepted.setText("Refresh");
        jButtonReadAccepted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReadAcceptedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonReadAccepted)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRemoveAccepted)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAddAccepted))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddAccepted)
                    .addComponent(jButtonRemoveAccepted)
                    .addComponent(jButtonReadAccepted))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Node IDs", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSpinnerAddrH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinnerAddrL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSpinnerNetID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jSpinnerNetID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jSpinnerAddrL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSpinnerAddrH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Query Node");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonReadParamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReadParamsActionPerformed
        try {
            jSpinnerNetID.commitEdit();
            jSpinnerAddrH.commitEdit();
            jSpinnerAddrL.commitEdit();

            this.jSpinnerBeacon.setValue(
                    controller.getNodeBeaconPeriod(
                            ((Integer) this.jSpinnerNetID.getValue()).byteValue(),
                            new NodeAddress(
                                    (Integer) this.jSpinnerAddrH.getValue(),
                                    (Integer) this.jSpinnerAddrL.getValue())));

            this.jSpinnerReport.setValue(
                    controller.getNodeReportPeriod(
                            ((Integer) this.jSpinnerNetID.getValue()).byteValue(),
                            new NodeAddress(
                                    (Integer) this.jSpinnerAddrH.getValue(),
                                    (Integer) this.jSpinnerAddrL.getValue())));

            this.jSpinnerRSSI.setValue(
                    controller.getNodeRssiMin(
                            ((Integer) this.jSpinnerNetID.getValue()).byteValue(),
                            new NodeAddress(
                                    (Integer) this.jSpinnerAddrH.getValue(),
                                    (Integer) this.jSpinnerAddrL.getValue())));

            this.jSpinnerTTL.setValue(
                    controller.getNodePacketTtl(
                            ((Integer) this.jSpinnerNetID.getValue()).byteValue(),
                            new NodeAddress(
                                    (Integer) this.jSpinnerAddrH.getValue(),
                                    (Integer) this.jSpinnerAddrL.getValue())));

        } catch (ParseException ex) {
            Logger.getLogger(ControllerGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonReadParamsActionPerformed

    private void jButtonWriteParamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWriteParamsActionPerformed
        try {
            jSpinnerNetID.commitEdit();
            jSpinnerAddrH.commitEdit();
            jSpinnerAddrL.commitEdit();
            jSpinnerRSSI.commitEdit();
            jSpinnerTTL.commitEdit();
            jSpinnerBeacon.commitEdit();
            jSpinnerReport.commitEdit();

            controller.setNodeBeaconPeriod(
                    ((Integer) this.jSpinnerNetID.getValue()).byteValue(),
                    new NodeAddress(
                            (Integer) this.jSpinnerAddrH.getValue(),
                            (Integer) this.jSpinnerAddrL.getValue()),
                    ((Number) this.jSpinnerBeacon.getValue()).shortValue());

            controller.setNodeReportPeriod(
                    ((Integer) this.jSpinnerNetID.getValue()).byteValue(),
                    new NodeAddress(
                            (Integer) this.jSpinnerAddrH.getValue(),
                            (Integer) this.jSpinnerAddrL.getValue()),
                    ((Number) this.jSpinnerReport.getValue()).shortValue());

            controller.setNodeRssiMin(
                    ((Integer) this.jSpinnerNetID.getValue()).byteValue(),
                    new NodeAddress(
                            (Integer) this.jSpinnerAddrH.getValue(),
                            (Integer) this.jSpinnerAddrL.getValue()),
                    ((Number) this.jSpinnerRSSI.getValue()).byteValue());

            controller.setNodePacketTtl(
                    ((Integer) this.jSpinnerNetID.getValue()).byteValue(),
                    new NodeAddress(
                            (Integer) this.jSpinnerAddrH.getValue(),
                            (Integer) this.jSpinnerAddrL.getValue()),
                    ((Number) this.jSpinnerTTL.getValue()).byteValue());

        } catch (ParseException ex) {
            Logger.getLogger(ControllerGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonWriteParamsActionPerformed

    private void jButtonReadAcceptedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReadAcceptedActionPerformed
        try {
            jSpinnerNetID.commitEdit();
            jSpinnerAddrH.commitEdit();
            jSpinnerAddrL.commitEdit();
            List<NodeAddress> list
                    = controller.getNodeAliases(
                            ((Integer) this.jSpinnerNetID.getValue()).byteValue(),
                            new NodeAddress(
                                    (Integer) this.jSpinnerAddrH.getValue(),
                                    (Integer) this.jSpinnerAddrL.getValue()));

            DefaultTableModel model = (DefaultTableModel) this.jTableAccepted.getModel();
            model.setRowCount(0);

            list.stream().forEach((na) -> {
                model.addRow(new Integer[]{(int) na.getHigh() & 0xFF, (int) na.getLow() & 0xFF});
            });

        } catch (ParseException ex) {
            Logger.getLogger(ControllerGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonReadAcceptedActionPerformed

    private void jButtonRemoveAcceptedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveAcceptedActionPerformed
        int index = this.jTableAccepted.getSelectedRow();
        if (index >= 0) {
            try {

                jSpinnerNetID.commitEdit();
                jSpinnerAddrH.commitEdit();
                jSpinnerAddrL.commitEdit();

                controller.removeNodeAlias(
                        ((Integer) this.jSpinnerNetID.getValue()).byteValue(),
                        new NodeAddress(
                                (Integer) this.jSpinnerAddrH.getValue(),
                                (Integer) this.jSpinnerAddrL.getValue()),
                        (byte) (index & 0xFF));

                ((DefaultTableModel) this.jTableAccepted.getModel()).removeRow(index);

            } catch (ParseException ex) {
                Logger.getLogger(ControllerGui.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            System.out.println("Please select a row");
        }
    }//GEN-LAST:event_jButtonRemoveAcceptedActionPerformed

    private void jButtonAddAcceptedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddAcceptedActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableAccepted.getModel();
        try {
            NodeAddress addr;
            String addrStr = JOptionPane.showInputDialog("Enter new address :");
            if (addrStr.contains(".")) {
                addr = new NodeAddress(addrStr);
            } else {
                addr = new NodeAddress(Integer.parseInt(addrStr));
            }

            model.addRow(new Integer[]{(int) addr.getHigh() & 0xFF, (int) addr.getLow() & 0xFF});

            jSpinnerNetID.commitEdit();
            jSpinnerAddrH.commitEdit();
            jSpinnerAddrL.commitEdit();

            controller.addNodeAlias(
                    ((Integer) this.jSpinnerNetID.getValue()).byteValue(),
                    new NodeAddress(
                            (Integer) this.jSpinnerAddrH.getValue(),
                            (Integer) this.jSpinnerAddrL.getValue()),
                    addr);

        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Please insert a valid address."
                    + "\nExample: 0.125",
                    "Address Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (ParseException ex) {
            Logger.getLogger(ControllerGui.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonAddAcceptedActionPerformed

    private void jButtonReadFlowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReadFlowsActionPerformed
        try {
            jSpinnerNetID.commitEdit();
            jSpinnerAddrH.commitEdit();
            jSpinnerAddrL.commitEdit();

            List<FlowTableEntry> list = controller.getNodeRules(
                    ((Integer) this.jSpinnerNetID.getValue()).byteValue(),
                    new NodeAddress(
                            (Integer) this.jSpinnerAddrH.getValue(),
                            (Integer) this.jSpinnerAddrL.getValue()));

            DefaultTableModel model = (DefaultTableModel) this.jTableFlow.getModel();
            model.setRowCount(0);

            list.stream().forEach((na) -> {
                model.addRow(new String[]{na.toString()});
            });

        } catch (ParseException ex) {
            Logger.getLogger(ControllerGui.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonReadFlowsActionPerformed

    private void jButtonRemoveFlowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveFlowActionPerformed
        try {
            if (this.jTableFlow.getSelectedRow() != -1) {
                jSpinnerNetID.commitEdit();
                jSpinnerAddrH.commitEdit();
                jSpinnerAddrL.commitEdit();

                controller.removeNodeRule(
                        ((Integer) this.jSpinnerNetID.getValue()).byteValue(),
                        new NodeAddress(
                                (Integer) this.jSpinnerAddrH.getValue(),
                                (Integer) this.jSpinnerAddrL.getValue()),
                        (byte) this.jTableFlow.getSelectedRow());

                DefaultTableModel model = (DefaultTableModel) jTableFlow.getModel();
                model.removeRow(this.jTableFlow.getSelectedRow());
            }
        } catch (ParseException ex) {
            Logger.getLogger(ControllerGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonRemoveFlowActionPerformed

    private void jButtonAddAccepted1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddAccepted1ActionPerformed

        try {
            jSpinnerNetID.commitEdit();
            jSpinnerAddrH.commitEdit();
            jSpinnerAddrL.commitEdit();

            NodeAddress dest = new NodeAddress(
                    (Integer) this.jSpinnerAddrH.getValue(),
                    (Integer) this.jSpinnerAddrL.getValue());
            NodeAddress src = controller.getSinkAddress();

            byte id = ((Integer) this.jSpinnerNetID.getValue()).byteValue();

            DataPacket dp = new DataPacket(id, src, dest,
                    jTextField1.getText()
                    .getBytes(UTF8_CHARSET));
            dp.setNxh(src);
            controller.sendNetworkPacket(dp);
        } catch (ParseException ex) {
            Logger.getLogger(ControllerGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAddAccepted1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddAccepted;
    private javax.swing.JButton jButtonAddAccepted1;
    private javax.swing.JButton jButtonReadAccepted;
    private javax.swing.JButton jButtonReadFlows;
    private javax.swing.JButton jButtonReadParams;
    private javax.swing.JButton jButtonRemoveAccepted;
    private javax.swing.JButton jButtonRemoveFlow;
    private javax.swing.JButton jButtonWriteParams;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerAddrH;
    private javax.swing.JSpinner jSpinnerAddrL;
    private javax.swing.JSpinner jSpinnerBeacon;
    private javax.swing.JSpinner jSpinnerNetID;
    private javax.swing.JSpinner jSpinnerRSSI;
    private javax.swing.JSpinner jSpinnerReport;
    private javax.swing.JSpinner jSpinnerTTL;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableAccepted;
    private javax.swing.JTable jTableFlow;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
