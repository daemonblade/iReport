/*
 * iReport - Visual Designer for JasperReports.
 * Copyright (C) 2002 - 2013 Jaspersoft Corporation. All rights reserved.
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
package com.jaspersoft.ireport.jasperserver.validation;

import net.sf.jasperreports.engine.JRReportTemplate;
import net.sf.jasperreports.engine.design.JRDesignImage;



/**
 *
 * @author gtoffoli
 */
public class TemplateElementValidationItem extends ElementValidationItem {

    private JRReportTemplate template = null;
    /** Creates a new instance of ValidationItem */
    public TemplateElementValidationItem() {
    }

    public TemplateElementValidationItem(JRReportTemplate template)
    {
       this.template = template;
    }

    public String toString()
    {
        return "Style Template";
    }

    /**
     * @return the template
     */
    public JRReportTemplate getTemplate() {
        return template;
    }

    /**
     * @param template the template to set
     */
    public void setTemplate(JRReportTemplate template) {
        this.template = template;
    }
    
}
