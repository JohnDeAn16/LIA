/*
 * An XML document type.
 * Localname: Formular
 * Namespace: DataImport
 * Java type: dataImport.FormularDocument
 *
 * Automatically generated - do not modify.
 */
package dataImport.impl;
/**
 * A document containing one Formular(@DataImport) element.
 *
 * This is a complex type.
 */
public class FormularDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dataImport.FormularDocument
{
    private static final long serialVersionUID = 1L;
    
    public FormularDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORMULAR$0 = 
        new javax.xml.namespace.QName("DataImport", "Formular");
    
    
    /**
     * Gets the "Formular" element
     */
    public dataImport.FormularDocument.Formular getFormular()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.FormularDocument.Formular target = null;
            target = (dataImport.FormularDocument.Formular)get_store().find_element_user(FORMULAR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Formular" element
     */
    public void setFormular(dataImport.FormularDocument.Formular formular)
    {
        generatedSetterHelperImpl(formular, FORMULAR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Formular" element
     */
    public dataImport.FormularDocument.Formular addNewFormular()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.FormularDocument.Formular target = null;
            target = (dataImport.FormularDocument.Formular)get_store().add_element_user(FORMULAR$0);
            return target;
        }
    }
    /**
     * An XML Formular(@DataImport).
     *
     * This is a complex type.
     */
    public static class FormularImpl extends dataImport.impl.MetaDataTypeImpl implements dataImport.FormularDocument.Formular
    {
        private static final long serialVersionUID = 1L;
        
        public FormularImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GRUNDOCHMARGINAL$0 = 
            new javax.xml.namespace.QName("DataImport", "GrundOchMarginal");
        private static final javax.xml.namespace.QName ALDERSINVERKAN$2 = 
            new javax.xml.namespace.QName("DataImport", "AldersInverkan");
        
        
        /**
         * Gets the "GrundOchMarginal" element
         */
        public dataImport.GrundOchMarginalType getGrundOchMarginal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                dataImport.GrundOchMarginalType target = null;
                target = (dataImport.GrundOchMarginalType)get_store().find_element_user(GRUNDOCHMARGINAL$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "GrundOchMarginal" element
         */
        public boolean isSetGrundOchMarginal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GRUNDOCHMARGINAL$0) != 0;
            }
        }
        
        /**
         * Sets the "GrundOchMarginal" element
         */
        public void setGrundOchMarginal(dataImport.GrundOchMarginalType grundOchMarginal)
        {
            generatedSetterHelperImpl(grundOchMarginal, GRUNDOCHMARGINAL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "GrundOchMarginal" element
         */
        public dataImport.GrundOchMarginalType addNewGrundOchMarginal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                dataImport.GrundOchMarginalType target = null;
                target = (dataImport.GrundOchMarginalType)get_store().add_element_user(GRUNDOCHMARGINAL$0);
                return target;
            }
        }
        
        /**
         * Unsets the "GrundOchMarginal" element
         */
        public void unsetGrundOchMarginal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GRUNDOCHMARGINAL$0, 0);
            }
        }
        
        /**
         * Gets the "AldersInverkan" element
         */
        public dataImport.AldersInverkanType getAldersInverkan()
        {
            synchronized (monitor())
            {
                check_orphaned();
                dataImport.AldersInverkanType target = null;
                target = (dataImport.AldersInverkanType)get_store().find_element_user(ALDERSINVERKAN$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "AldersInverkan" element
         */
        public boolean isSetAldersInverkan()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALDERSINVERKAN$2) != 0;
            }
        }
        
        /**
         * Sets the "AldersInverkan" element
         */
        public void setAldersInverkan(dataImport.AldersInverkanType aldersInverkan)
        {
            generatedSetterHelperImpl(aldersInverkan, ALDERSINVERKAN$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "AldersInverkan" element
         */
        public dataImport.AldersInverkanType addNewAldersInverkan()
        {
            synchronized (monitor())
            {
                check_orphaned();
                dataImport.AldersInverkanType target = null;
                target = (dataImport.AldersInverkanType)get_store().add_element_user(ALDERSINVERKAN$2);
                return target;
            }
        }
        
        /**
         * Unsets the "AldersInverkan" element
         */
        public void unsetAldersInverkan()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALDERSINVERKAN$2, 0);
            }
        }
    }
}
