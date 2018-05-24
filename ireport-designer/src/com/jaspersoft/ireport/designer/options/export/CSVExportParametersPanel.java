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
 */
package com.jaspersoft.ireport.designer.options.export;

import com.jaspersoft.ireport.designer.IRLocalJasperReportsContext;
import com.jaspersoft.ireport.designer.IReportManager;
import com.jaspersoft.ireport.designer.options.IReportOptionsPanelController;
import com.jaspersoft.ireport.designer.utils.Misc;
import com.jaspersoft.ireport.locale.I18n;
import java.util.prefs.Preferences;
import net.sf.jasperreports.engine.JRPropertiesUtil;
import net.sf.jasperreports.engine.JasperReportsContext;
import net.sf.jasperreports.engine.export.JRCsvExporterParameter;

/**
 *
 * @author gtoffoli
 */
public class CSVExportParametersPanel extends AbstractExportParametersPanel {

    IReportOptionsPanelController controller = null;

    /** Creates new form CSVExportParametersPanel */
    public CSVExportParametersPanel() {
        initComponents();

        javax.swing.event.DocumentListener textfieldListener =  new javax.swing.event.DocumentListener()
        {
            public void changedUpdate(javax.swing.event.DocumentEvent evt)
            {
                notifyChange();
            }
            public void insertUpdate(javax.swing.event.DocumentEvent evt)
            {
                notifyChange();
            }
            public void removeUpdate(javax.swing.event.DocumentEvent evt)
            {
                notifyChange();
            }
        };

         jTextField1.getDocument().addDocumentListener(textfieldListener);
         jTextField2.getDocument().addDocumentListener(textfieldListener);

         applyI18n();
    }

    public void applyI18n()
    {
        jLabelTitle.setText(I18n.getString("CSVExportParametersPanel.jLabelTitle.text")); // NOI18N
        jLabelFielDelimiter.setText(I18n.getString("CSVExportParametersPanel.jLabelFielDelimiter.text")); // NOI18N
        jLabelRecordDelimiter.setText(I18n.getString("CSVExportParametersPanel.jLabelRecordDelimiter.text")); // NOI18N
        jLabelSpecialCharacters.setText(I18n.getString("CSVExportParametersPanel.jLabelSpecialCharacters.text")); // NOI18N
        jButtonReset.setText(I18n.getString("CSVExportParametersPanel.jButtonReset.text"));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabelTitle = new javax.swing.JLabel();
        jLabelFielDelimiter = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabelRecordDelimiter = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabelSpecialCharacters = new javax.swing.JLabel();
        jButtonReset = new javax.swing.JButton();

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTitle.setText("CSV Export parameters");

        jLabelFielDelimiter.setText("Field delimiter");

        jLabelRecordDelimiter.setText("Record delimiter");

        jLabelSpecialCharacters.setText("<html>Special characters:<br><b>\\n</b>\tfor newline<br><b>\\r</b>\tfor carriage return<br><b>\\t</b>\tfor tab and<br><b>\\\\</b>\tfor a single backslash");

        jButtonReset.setText("Rever to default values");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLabelTitle)
                .addContainerGap(267, Short.MAX_VALUE))
            .add(jSeparator1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabelRecordDelimiter)
                    .add(jLabelFielDelimiter))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jTextField1)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jTextField2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addContainerGap(274, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabelSpecialCharacters)
                .addContainerGap(282, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jButtonReset)
                .addContainerGap(254, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLabelTitle)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelFielDelimiter)
                    .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelRecordDelimiter)
                    .add(jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jLabelSpecialCharacters)
                .add(18, 18, 18)
                .add(jButtonReset)
                .addContainerGap(91, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed

        JRPropertiesUtil jrPropUtils = IRLocalJasperReportsContext.getUtilities();
        JasperReportsContext context = IRLocalJasperReportsContext.getInstance();
        
        jTextField1.setText( Misc.addSlashesString(jrPropUtils.getProperty(JRCsvExporterParameter.PROPERTY_FIELD_DELIMITER)) );
        jTextField2.setText( Misc.addSlashesString(jrPropUtils.getProperty(JRCsvExporterParameter.PROPERTY_RECORD_DELIMITER)) );
        notifyChange();
    }//GEN-LAST:event_jButtonResetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonReset;
    private javax.swing.JLabel jLabelFielDelimiter;
    private javax.swing.JLabel jLabelRecordDelimiter;
    private javax.swing.JLabel jLabelSpecialCharacters;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    public void load() {

        setInit(true);
        Preferences pref = IReportManager.getPreferences();
        
        JRPropertiesUtil jrPropUtils = IRLocalJasperReportsContext.getUtilities();
        
        jTextField1.setText( Misc.addSlashesString(pref.get(JRCsvExporterParameter.PROPERTY_FIELD_DELIMITER, jrPropUtils.getProperty(JRCsvExporterParameter.PROPERTY_FIELD_DELIMITER))));
        jTextField2.setText( Misc.addSlashesString(pref.get(JRCsvExporterParameter.PROPERTY_RECORD_DELIMITER, jrPropUtils.getProperty(JRCsvExporterParameter.PROPERTY_RECORD_DELIMITER))));
        
        setInit(false);
    }

    public void store() {
        Preferences pref = IReportManager.getPreferences();

        pref.put(JRCsvExporterParameter.PROPERTY_FIELD_DELIMITER, Misc.removeSlashesString( jTextField1.getText()) );
        pref.put(JRCsvExporterParameter.PROPERTY_RECORD_DELIMITER, Misc.removeSlashesString( jTextField2.getText()) );

    }

    public boolean valid() {
        return true;
    }

    @Override
    public String getDisplayName() {
        return I18n.getString("CSVExportParametersPanel.title");
    }

}