/*
 * iReport - Visual Designer for JasperReports.
 * Copyright (C) 2002 - 2009 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of iReport.
 *
 * iReport is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * iReport is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with iReport. If not, see <http://www.gnu.org/licenses/>.
 *
 * ReportViewer.java
 *
 * Created on 1-apr-2011, 18.58.04
 */

package com.jaspersoft.ireport.designer.options;

import javax.swing.JFileChooser;

/**
 *
 * @author gtoffoli
 */
public class ReportViewer extends javax.swing.JPanel {

    String format = "unknown";
    /** Creates new form ReportViewer */
    public ReportViewer() {
        initComponents();
    }

    /** Creates new form ReportViewer */
    public ReportViewer(String format) {
        initComponents();
        this.format = format;
    }

    public String getProcess()
    {
        return jTextFieldProcess.getText();
    }

    public String getArguments()
    {
        return jTextFieldArguments.getText();
    }

    public void setProcess(String process)
    {
        jTextFieldProcess.setText(process);
    }

    public void getArguments(String args)
    {
        jTextFieldArguments.setText(args);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelPDFViewer = new javax.swing.JLabel();
        jTextFieldProcess = new javax.swing.JTextField();
        jButtonPDFViewer = new javax.swing.JButton();
        jLabelPDFViewer1 = new javax.swing.JLabel();
        jTextFieldArguments = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabelViewerName = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jLabelPDFViewer.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelPDFViewer.setText(org.openide.util.NbBundle.getMessage(ReportViewer.class, "ReportViewer.jLabelPDFViewer.text")); // NOI18N

        jButtonPDFViewer.setText(org.openide.util.NbBundle.getMessage(ReportViewer.class, "ReportViewer.jButtonPDFViewer.text")); // NOI18N
        jButtonPDFViewer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPDFViewerActionPerformed(evt);
            }
        });

        jLabelPDFViewer1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelPDFViewer1.setText(org.openide.util.NbBundle.getMessage(ReportViewer.class, "ReportViewer.jLabelPDFViewer1.text")); // NOI18N

        jTextFieldArguments.setText(org.openide.util.NbBundle.getMessage(ReportViewer.class, "ReportViewer.jTextFieldArguments.text")); // NOI18N

        jLabel1.setText(org.openide.util.NbBundle.getMessage(ReportViewer.class, "ReportViewer.jLabel1.text")); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabelViewerName.setText(org.openide.util.NbBundle.getMessage(ReportViewer.class, "ReportViewer.jLabelViewerName.text")); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabelViewerName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                            .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabelPDFViewer1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabelPDFViewer))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(layout.createSequentialGroup()
                                        .add(jTextFieldProcess, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 294, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jButtonPDFViewer))
                                    .add(jTextFieldArguments, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)))))
                    .add(jSeparator1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabelViewerName)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelPDFViewer)
                    .add(jTextFieldProcess, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButtonPDFViewer))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelPDFViewer1)
                    .add(jTextFieldArguments, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(26, 26, 26)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPDFViewerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPDFViewerActionPerformed

        javax.swing.JFileChooser jfc = new javax.swing.JFileChooser();

        jfc.setDialogTitle("Choose a " + format + " viewer...");
        jfc.setMultiSelectionEnabled(false);
        if (jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            jTextFieldProcess.setText( jfc.getSelectedFile().getPath());
        }
}//GEN-LAST:event_jButtonPDFViewerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPDFViewer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelPDFViewer;
    private javax.swing.JLabel jLabelPDFViewer1;
    private javax.swing.JLabel jLabelViewerName;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldArguments;
    private javax.swing.JTextField jTextFieldProcess;
    // End of variables declaration//GEN-END:variables

}
