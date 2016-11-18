/*
 * XML Type:  metaDataType
 * Namespace: DataImport
 * Java type: dataImport.MetaDataType
 *
 * Automatically generated - do not modify.
 */
package dataImport.impl;
/**
 * An XML metaDataType(@DataImport).
 *
 * This is a complex type.
 */
public class MetaDataTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dataImport.MetaDataType
{
    private static final long serialVersionUID = 1L;
    
    public MetaDataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANKOMSTDATUM$0 = 
        new javax.xml.namespace.QName("DataImport", "AnkomstDatum");
    private static final javax.xml.namespace.QName TIDSSTAMPEL$2 = 
        new javax.xml.namespace.QName("DataImport", "TidsStampel");
    private static final javax.xml.namespace.QName TOTALLADDNING$4 = 
        new javax.xml.namespace.QName("DataImport", "TotalLaddning");
    private static final javax.xml.namespace.QName FILTYP$6 = 
        new javax.xml.namespace.QName("DataImport", "FilTyp");
    
    
    /**
     * Gets the "AnkomstDatum" element
     */
    public java.util.Calendar getAnkomstDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANKOMSTDATUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "AnkomstDatum" element
     */
    public org.apache.xmlbeans.XmlDate xgetAnkomstDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ANKOMSTDATUM$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AnkomstDatum" element
     */
    public void setAnkomstDatum(java.util.Calendar ankomstDatum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANKOMSTDATUM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ANKOMSTDATUM$0);
            }
            target.setCalendarValue(ankomstDatum);
        }
    }
    
    /**
     * Sets (as xml) the "AnkomstDatum" element
     */
    public void xsetAnkomstDatum(org.apache.xmlbeans.XmlDate ankomstDatum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ANKOMSTDATUM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(ANKOMSTDATUM$0);
            }
            target.set(ankomstDatum);
        }
    }
    
    /**
     * Gets the "TidsStampel" element
     */
    public java.util.Calendar getTidsStampel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIDSSTAMPEL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "TidsStampel" element
     */
    public org.apache.xmlbeans.XmlTime xgetTidsStampel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlTime target = null;
            target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(TIDSSTAMPEL$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TidsStampel" element
     */
    public void setTidsStampel(java.util.Calendar tidsStampel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIDSSTAMPEL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIDSSTAMPEL$2);
            }
            target.setCalendarValue(tidsStampel);
        }
    }
    
    /**
     * Sets (as xml) the "TidsStampel" element
     */
    public void xsetTidsStampel(org.apache.xmlbeans.XmlTime tidsStampel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlTime target = null;
            target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(TIDSSTAMPEL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlTime)get_store().add_element_user(TIDSSTAMPEL$2);
            }
            target.set(tidsStampel);
        }
    }
    
    /**
     * Gets the "TotalLaddning" element
     */
    public boolean getTotalLaddning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALLADDNING$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "TotalLaddning" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetTotalLaddning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TOTALLADDNING$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TotalLaddning" element
     */
    public void setTotalLaddning(boolean totalLaddning)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALLADDNING$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALLADDNING$4);
            }
            target.setBooleanValue(totalLaddning);
        }
    }
    
    /**
     * Sets (as xml) the "TotalLaddning" element
     */
    public void xsetTotalLaddning(org.apache.xmlbeans.XmlBoolean totalLaddning)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TOTALLADDNING$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(TOTALLADDNING$4);
            }
            target.set(totalLaddning);
        }
    }
    
    /**
     * Gets the "FilTyp" element
     */
    public dataImport.MetaDataType.FilTyp.Enum getFilTyp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILTYP$6, 0);
            if (target == null)
            {
                return null;
            }
            return (dataImport.MetaDataType.FilTyp.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "FilTyp" element
     */
    public dataImport.MetaDataType.FilTyp xgetFilTyp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.MetaDataType.FilTyp target = null;
            target = (dataImport.MetaDataType.FilTyp)get_store().find_element_user(FILTYP$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FilTyp" element
     */
    public void setFilTyp(dataImport.MetaDataType.FilTyp.Enum filTyp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILTYP$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILTYP$6);
            }
            target.setEnumValue(filTyp);
        }
    }
    
    /**
     * Sets (as xml) the "FilTyp" element
     */
    public void xsetFilTyp(dataImport.MetaDataType.FilTyp filTyp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.MetaDataType.FilTyp target = null;
            target = (dataImport.MetaDataType.FilTyp)get_store().find_element_user(FILTYP$6, 0);
            if (target == null)
            {
                target = (dataImport.MetaDataType.FilTyp)get_store().add_element_user(FILTYP$6);
            }
            target.set(filTyp);
        }
    }
    /**
     * An XML FilTyp(@DataImport).
     *
     * This is an atomic type that is a restriction of dataImport.MetaDataType$FilTyp.
     */
    public static class FilTypImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements dataImport.MetaDataType.FilTyp
    {
        private static final long serialVersionUID = 1L;
        
        public FilTypImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected FilTypImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
