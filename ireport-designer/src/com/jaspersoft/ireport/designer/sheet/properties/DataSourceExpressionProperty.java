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
package com.jaspersoft.ireport.designer.sheet.properties;

import com.jaspersoft.ireport.designer.IReportManager;
import com.jaspersoft.ireport.designer.editor.ExpressionContext;
import com.jaspersoft.ireport.designer.sheet.properties.ExpressionProperty;
import com.jaspersoft.ireport.designer.undo.ObjectPropertyUndoableEdit;
import com.jaspersoft.ireport.locale.I18n;
import java.lang.reflect.InvocationTargetException;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRExpression;
import net.sf.jasperreports.engine.design.JRDesignDataset;
import net.sf.jasperreports.engine.design.JRDesignExpression;
import net.sf.jasperreports.engine.design.JRDesignSubreport;
import org.openide.ErrorManager;

    
/**
 * @author Teodor Danciu (teodord@users.sourceforge.net)
 */
public final class DataSourceExpressionProperty extends ExpressionProperty 
{
    private final JRDesignSubreport subreport;

    public DataSourceExpressionProperty(JRDesignSubreport subreport, JRDesignDataset dataset)
    {
        super(subreport, dataset);
        this.subreport = subreport;
    }

    @Override
    public String getName()
    {
        return JRDesignSubreport.PROPERTY_DATASOURCE_EXPRESSION;
    }

    @Override
    public String getDisplayName()
    {
        return I18n.getString("Global.Property.DataSourceExpression");
    }

    @Override
    public String getShortDescription()
    {
        return I18n.getString("Global.Property.DSEdetail");
    }

    @Override
    public String getDefaultExpressionClassName()
    {
        return JRDataSource.class.getName();
    }

    @Override
    public JRDesignExpression getExpression()
    {
        return (JRDesignExpression)subreport.getDataSourceExpression();
    }

    @Override
    public void setExpression(JRDesignExpression expression)
    {
        subreport.setDataSourceExpression(expression);
    }

    @Override
    public boolean canWrite() //FIXMETD is this needed? check all
    {
        return getExpression() != null;
    }

    @Override
    public String getHtmlDisplayName() {
        if (!canWrite())
        {
            return "<font color=\"#CCCCCC\">" + getDisplayName() + "</font>";
        }
        return super.getHtmlDisplayName();
    }

}
