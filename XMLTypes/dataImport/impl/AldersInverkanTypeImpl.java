/*
 * XML Type:  AldersInverkanType
 * Namespace: DataImport
 * Java type: dataImport.AldersInverkanType
 *
 * Automatically generated - do not modify.
 */
package dataImport.impl;
/**
 * An XML AldersInverkanType(@DataImport).
 *
 * This is a complex type.
 */
public class AldersInverkanTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dataImport.AldersInverkanType
{
    private static final long serialVersionUID = 1L;
    
    public AldersInverkanTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FASTIGHETSTAXERINGSAR$0 = 
        new javax.xml.namespace.QName("DataImport", "Fastighetstaxeringsar");
    private static final javax.xml.namespace.QName ALDERSINVERKAN$2 = 
        new javax.xml.namespace.QName("DataImport", "Aldersinverkan");
    private static final javax.xml.namespace.QName VARDEAR$4 = 
        new javax.xml.namespace.QName("DataImport", "Vardear");
    private static final javax.xml.namespace.QName STANDARDPOANG$6 = 
        new javax.xml.namespace.QName("DataImport", "Standardpoang");
    private static final javax.xml.namespace.QName REDUKTIONSFAKTOR$8 = 
        new javax.xml.namespace.QName("DataImport", "Reduktionsfaktor");
    
    
    /**
     * Gets the "Fastighetstaxeringsar" element
     */
    public java.util.Calendar getFastighetstaxeringsar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FASTIGHETSTAXERINGSAR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "Fastighetstaxeringsar" element
     */
    public dataImport.FastighetsTaxeringsArType xgetFastighetstaxeringsar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.FastighetsTaxeringsArType target = null;
            target = (dataImport.FastighetsTaxeringsArType)get_store().find_element_user(FASTIGHETSTAXERINGSAR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Fastighetstaxeringsar" element
     */
    public void setFastighetstaxeringsar(java.util.Calendar fastighetstaxeringsar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FASTIGHETSTAXERINGSAR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FASTIGHETSTAXERINGSAR$0);
            }
            target.setCalendarValue(fastighetstaxeringsar);
        }
    }
    
    /**
     * Sets (as xml) the "Fastighetstaxeringsar" element
     */
    public void xsetFastighetstaxeringsar(dataImport.FastighetsTaxeringsArType fastighetstaxeringsar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.FastighetsTaxeringsArType target = null;
            target = (dataImport.FastighetsTaxeringsArType)get_store().find_element_user(FASTIGHETSTAXERINGSAR$0, 0);
            if (target == null)
            {
                target = (dataImport.FastighetsTaxeringsArType)get_store().add_element_user(FASTIGHETSTAXERINGSAR$0);
            }
            target.set(fastighetstaxeringsar);
        }
    }
    
    /**
     * Gets array of all "Aldersinverkan" elements
     */
    public dataImport.AldersInverkanType.Aldersinverkan[] getAldersinverkanArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ALDERSINVERKAN$2, targetList);
            dataImport.AldersInverkanType.Aldersinverkan[] result = new dataImport.AldersInverkanType.Aldersinverkan[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Aldersinverkan" element
     */
    public dataImport.AldersInverkanType.Aldersinverkan getAldersinverkanArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.AldersInverkanType.Aldersinverkan target = null;
            target = (dataImport.AldersInverkanType.Aldersinverkan)get_store().find_element_user(ALDERSINVERKAN$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Aldersinverkan" element
     */
    public int sizeOfAldersinverkanArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALDERSINVERKAN$2);
        }
    }
    
    /**
     * Sets array of all "Aldersinverkan" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAldersinverkanArray(dataImport.AldersInverkanType.Aldersinverkan[] aldersinverkanArray)
    {
        check_orphaned();
        arraySetterHelper(aldersinverkanArray, ALDERSINVERKAN$2);
    }
    
    /**
     * Sets ith "Aldersinverkan" element
     */
    public void setAldersinverkanArray(int i, dataImport.AldersInverkanType.Aldersinverkan aldersinverkan)
    {
        generatedSetterHelperImpl(aldersinverkan, ALDERSINVERKAN$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Aldersinverkan" element
     */
    public dataImport.AldersInverkanType.Aldersinverkan insertNewAldersinverkan(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.AldersInverkanType.Aldersinverkan target = null;
            target = (dataImport.AldersInverkanType.Aldersinverkan)get_store().insert_element_user(ALDERSINVERKAN$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Aldersinverkan" element
     */
    public dataImport.AldersInverkanType.Aldersinverkan addNewAldersinverkan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.AldersInverkanType.Aldersinverkan target = null;
            target = (dataImport.AldersInverkanType.Aldersinverkan)get_store().add_element_user(ALDERSINVERKAN$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "Aldersinverkan" element
     */
    public void removeAldersinverkan(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALDERSINVERKAN$2, i);
        }
    }
    
    /**
     * Gets array of all "Vardear" elements
     */
    public dataImport.AldersInverkanType.Vardear[] getVardearArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VARDEAR$4, targetList);
            dataImport.AldersInverkanType.Vardear[] result = new dataImport.AldersInverkanType.Vardear[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Vardear" element
     */
    public dataImport.AldersInverkanType.Vardear getVardearArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.AldersInverkanType.Vardear target = null;
            target = (dataImport.AldersInverkanType.Vardear)get_store().find_element_user(VARDEAR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Vardear" element
     */
    public int sizeOfVardearArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VARDEAR$4);
        }
    }
    
    /**
     * Sets array of all "Vardear" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setVardearArray(dataImport.AldersInverkanType.Vardear[] vardearArray)
    {
        check_orphaned();
        arraySetterHelper(vardearArray, VARDEAR$4);
    }
    
    /**
     * Sets ith "Vardear" element
     */
    public void setVardearArray(int i, dataImport.AldersInverkanType.Vardear vardear)
    {
        generatedSetterHelperImpl(vardear, VARDEAR$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Vardear" element
     */
    public dataImport.AldersInverkanType.Vardear insertNewVardear(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.AldersInverkanType.Vardear target = null;
            target = (dataImport.AldersInverkanType.Vardear)get_store().insert_element_user(VARDEAR$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Vardear" element
     */
    public dataImport.AldersInverkanType.Vardear addNewVardear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.AldersInverkanType.Vardear target = null;
            target = (dataImport.AldersInverkanType.Vardear)get_store().add_element_user(VARDEAR$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "Vardear" element
     */
    public void removeVardear(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VARDEAR$4, i);
        }
    }
    
    /**
     * Gets array of all "Standardpoang" elements
     */
    public dataImport.AldersInverkanType.Standardpoang[] getStandardpoangArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STANDARDPOANG$6, targetList);
            dataImport.AldersInverkanType.Standardpoang[] result = new dataImport.AldersInverkanType.Standardpoang[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Standardpoang" element
     */
    public dataImport.AldersInverkanType.Standardpoang getStandardpoangArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.AldersInverkanType.Standardpoang target = null;
            target = (dataImport.AldersInverkanType.Standardpoang)get_store().find_element_user(STANDARDPOANG$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Standardpoang" element
     */
    public int sizeOfStandardpoangArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STANDARDPOANG$6);
        }
    }
    
    /**
     * Sets array of all "Standardpoang" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setStandardpoangArray(dataImport.AldersInverkanType.Standardpoang[] standardpoangArray)
    {
        check_orphaned();
        arraySetterHelper(standardpoangArray, STANDARDPOANG$6);
    }
    
    /**
     * Sets ith "Standardpoang" element
     */
    public void setStandardpoangArray(int i, dataImport.AldersInverkanType.Standardpoang standardpoang)
    {
        generatedSetterHelperImpl(standardpoang, STANDARDPOANG$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Standardpoang" element
     */
    public dataImport.AldersInverkanType.Standardpoang insertNewStandardpoang(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.AldersInverkanType.Standardpoang target = null;
            target = (dataImport.AldersInverkanType.Standardpoang)get_store().insert_element_user(STANDARDPOANG$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Standardpoang" element
     */
    public dataImport.AldersInverkanType.Standardpoang addNewStandardpoang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.AldersInverkanType.Standardpoang target = null;
            target = (dataImport.AldersInverkanType.Standardpoang)get_store().add_element_user(STANDARDPOANG$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "Standardpoang" element
     */
    public void removeStandardpoang(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STANDARDPOANG$6, i);
        }
    }
    
    /**
     * Gets the "Reduktionsfaktor" element
     */
    public dataImport.AldersInverkanType.Reduktionsfaktor getReduktionsfaktor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.AldersInverkanType.Reduktionsfaktor target = null;
            target = (dataImport.AldersInverkanType.Reduktionsfaktor)get_store().find_element_user(REDUKTIONSFAKTOR$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Reduktionsfaktor" element
     */
    public void setReduktionsfaktor(dataImport.AldersInverkanType.Reduktionsfaktor reduktionsfaktor)
    {
        generatedSetterHelperImpl(reduktionsfaktor, REDUKTIONSFAKTOR$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Reduktionsfaktor" element
     */
    public dataImport.AldersInverkanType.Reduktionsfaktor addNewReduktionsfaktor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.AldersInverkanType.Reduktionsfaktor target = null;
            target = (dataImport.AldersInverkanType.Reduktionsfaktor)get_store().add_element_user(REDUKTIONSFAKTOR$8);
            return target;
        }
    }
    /**
     * An XML Aldersinverkan(@DataImport).
     *
     * This is a complex type.
     */
    public static class AldersinverkanImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dataImport.AldersInverkanType.Aldersinverkan
    {
        private static final long serialVersionUID = 1L;
        
        public AldersinverkanImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PROCENT$0 = 
            new javax.xml.namespace.QName("DataImport", "Procent");
        
        
        /**
         * Gets the "Procent" element
         */
        public int getProcent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCENT$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "Procent" element
         */
        public dataImport.AldersInverkanType.Aldersinverkan.Procent xgetProcent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                dataImport.AldersInverkanType.Aldersinverkan.Procent target = null;
                target = (dataImport.AldersInverkanType.Aldersinverkan.Procent)get_store().find_element_user(PROCENT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Procent" element
         */
        public void setProcent(int procent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCENT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROCENT$0);
                }
                target.setIntValue(procent);
            }
        }
        
        /**
         * Sets (as xml) the "Procent" element
         */
        public void xsetProcent(dataImport.AldersInverkanType.Aldersinverkan.Procent procent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                dataImport.AldersInverkanType.Aldersinverkan.Procent target = null;
                target = (dataImport.AldersInverkanType.Aldersinverkan.Procent)get_store().find_element_user(PROCENT$0, 0);
                if (target == null)
                {
                    target = (dataImport.AldersInverkanType.Aldersinverkan.Procent)get_store().add_element_user(PROCENT$0);
                }
                target.set(procent);
            }
        }
        /**
         * An XML Procent(@DataImport).
         *
         * This is an atomic type that is a restriction of dataImport.AldersInverkanType$Aldersinverkan$Procent.
         */
        public static class ProcentImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements dataImport.AldersInverkanType.Aldersinverkan.Procent
        {
            private static final long serialVersionUID = 1L;
            
            public ProcentImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected ProcentImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
    /**
     * An XML Vardear(@DataImport).
     *
     * This is a complex type.
     */
    public static class VardearImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dataImport.AldersInverkanType.Vardear
    {
        private static final long serialVersionUID = 1L;
        
        public VardearImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName UNDREGRANS$0 = 
            new javax.xml.namespace.QName("DataImport", "Undregrans");
        private static final javax.xml.namespace.QName OVREGRANS$2 = 
            new javax.xml.namespace.QName("DataImport", "Ovregrans");
        
        
        /**
         * Gets the "Undregrans" element
         */
        public java.util.Calendar getUndregrans()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNDREGRANS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "Undregrans" element
         */
        public dataImport.AldersInverkanType.Vardear.Undregrans xgetUndregrans()
        {
            synchronized (monitor())
            {
                check_orphaned();
                dataImport.AldersInverkanType.Vardear.Undregrans target = null;
                target = (dataImport.AldersInverkanType.Vardear.Undregrans)get_store().find_element_user(UNDREGRANS$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Undregrans" element
         */
        public void setUndregrans(java.util.Calendar undregrans)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNDREGRANS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNDREGRANS$0);
                }
                target.setCalendarValue(undregrans);
            }
        }
        
        /**
         * Sets (as xml) the "Undregrans" element
         */
        public void xsetUndregrans(dataImport.AldersInverkanType.Vardear.Undregrans undregrans)
        {
            synchronized (monitor())
            {
                check_orphaned();
                dataImport.AldersInverkanType.Vardear.Undregrans target = null;
                target = (dataImport.AldersInverkanType.Vardear.Undregrans)get_store().find_element_user(UNDREGRANS$0, 0);
                if (target == null)
                {
                    target = (dataImport.AldersInverkanType.Vardear.Undregrans)get_store().add_element_user(UNDREGRANS$0);
                }
                target.set(undregrans);
            }
        }
        
        /**
         * Gets the "Ovregrans" element
         */
        public java.util.Calendar getOvregrans()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVREGRANS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "Ovregrans" element
         */
        public dataImport.AldersInverkanType.Vardear.Ovregrans xgetOvregrans()
        {
            synchronized (monitor())
            {
                check_orphaned();
                dataImport.AldersInverkanType.Vardear.Ovregrans target = null;
                target = (dataImport.AldersInverkanType.Vardear.Ovregrans)get_store().find_element_user(OVREGRANS$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Ovregrans" element
         */
        public void setOvregrans(java.util.Calendar ovregrans)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVREGRANS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OVREGRANS$2);
                }
                target.setCalendarValue(ovregrans);
            }
        }
        
        /**
         * Sets (as xml) the "Ovregrans" element
         */
        public void xsetOvregrans(dataImport.AldersInverkanType.Vardear.Ovregrans ovregrans)
        {
            synchronized (monitor())
            {
                check_orphaned();
                dataImport.AldersInverkanType.Vardear.Ovregrans target = null;
                target = (dataImport.AldersInverkanType.Vardear.Ovregrans)get_store().find_element_user(OVREGRANS$2, 0);
                if (target == null)
                {
                    target = (dataImport.AldersInverkanType.Vardear.Ovregrans)get_store().add_element_user(OVREGRANS$2);
                }
                target.set(ovregrans);
            }
        }
        /**
         * An XML Undregrans(@DataImport).
         *
         * This is an atomic type that is a restriction of dataImport.AldersInverkanType$Vardear$Undregrans.
         */
        public static class UndregransImpl extends org.apache.xmlbeans.impl.values.JavaGDateHolderEx implements dataImport.AldersInverkanType.Vardear.Undregrans
        {
            private static final long serialVersionUID = 1L;
            
            public UndregransImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected UndregransImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML Ovregrans(@DataImport).
         *
         * This is an atomic type that is a restriction of dataImport.AldersInverkanType$Vardear$Ovregrans.
         */
        public static class OvregransImpl extends org.apache.xmlbeans.impl.values.JavaGDateHolderEx implements dataImport.AldersInverkanType.Vardear.Ovregrans
        {
            private static final long serialVersionUID = 1L;
            
            public OvregransImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected OvregransImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
    /**
     * An XML Standardpoang(@DataImport).
     *
     * This is a complex type.
     */
    public static class StandardpoangImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dataImport.AldersInverkanType.Standardpoang
    {
        private static final long serialVersionUID = 1L;
        
        public StandardpoangImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName UNDREGRANS$0 = 
            new javax.xml.namespace.QName("DataImport", "Undregrans");
        private static final javax.xml.namespace.QName OVREGRANS$2 = 
            new javax.xml.namespace.QName("DataImport", "Ovregrans");
        
        
        /**
         * Gets the "Undregrans" element
         */
        public int getUndregrans()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNDREGRANS$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "Undregrans" element
         */
        public dataImport.AldersInverkanType.Standardpoang.Undregrans xgetUndregrans()
        {
            synchronized (monitor())
            {
                check_orphaned();
                dataImport.AldersInverkanType.Standardpoang.Undregrans target = null;
                target = (dataImport.AldersInverkanType.Standardpoang.Undregrans)get_store().find_element_user(UNDREGRANS$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Undregrans" element
         */
        public void setUndregrans(int undregrans)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNDREGRANS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNDREGRANS$0);
                }
                target.setIntValue(undregrans);
            }
        }
        
        /**
         * Sets (as xml) the "Undregrans" element
         */
        public void xsetUndregrans(dataImport.AldersInverkanType.Standardpoang.Undregrans undregrans)
        {
            synchronized (monitor())
            {
                check_orphaned();
                dataImport.AldersInverkanType.Standardpoang.Undregrans target = null;
                target = (dataImport.AldersInverkanType.Standardpoang.Undregrans)get_store().find_element_user(UNDREGRANS$0, 0);
                if (target == null)
                {
                    target = (dataImport.AldersInverkanType.Standardpoang.Undregrans)get_store().add_element_user(UNDREGRANS$0);
                }
                target.set(undregrans);
            }
        }
        
        /**
         * Gets the "Ovregrans" element
         */
        public int getOvregrans()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVREGRANS$2, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "Ovregrans" element
         */
        public dataImport.AldersInverkanType.Standardpoang.Ovregrans xgetOvregrans()
        {
            synchronized (monitor())
            {
                check_orphaned();
                dataImport.AldersInverkanType.Standardpoang.Ovregrans target = null;
                target = (dataImport.AldersInverkanType.Standardpoang.Ovregrans)get_store().find_element_user(OVREGRANS$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Ovregrans" element
         */
        public void setOvregrans(int ovregrans)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVREGRANS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OVREGRANS$2);
                }
                target.setIntValue(ovregrans);
            }
        }
        
        /**
         * Sets (as xml) the "Ovregrans" element
         */
        public void xsetOvregrans(dataImport.AldersInverkanType.Standardpoang.Ovregrans ovregrans)
        {
            synchronized (monitor())
            {
                check_orphaned();
                dataImport.AldersInverkanType.Standardpoang.Ovregrans target = null;
                target = (dataImport.AldersInverkanType.Standardpoang.Ovregrans)get_store().find_element_user(OVREGRANS$2, 0);
                if (target == null)
                {
                    target = (dataImport.AldersInverkanType.Standardpoang.Ovregrans)get_store().add_element_user(OVREGRANS$2);
                }
                target.set(ovregrans);
            }
        }
        /**
         * An XML Undregrans(@DataImport).
         *
         * This is an atomic type that is a restriction of dataImport.AldersInverkanType$Standardpoang$Undregrans.
         */
        public static class UndregransImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements dataImport.AldersInverkanType.Standardpoang.Undregrans
        {
            private static final long serialVersionUID = 1L;
            
            public UndregransImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected UndregransImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML Ovregrans(@DataImport).
         *
         * This is an atomic type that is a restriction of dataImport.AldersInverkanType$Standardpoang$Ovregrans.
         */
        public static class OvregransImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements dataImport.AldersInverkanType.Standardpoang.Ovregrans
        {
            private static final long serialVersionUID = 1L;
            
            public OvregransImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected OvregransImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
    /**
     * An XML Reduktionsfaktor(@DataImport).
     *
     * This is a complex type.
     */
    public static class ReduktionsfaktorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dataImport.AldersInverkanType.Reduktionsfaktor
    {
        private static final long serialVersionUID = 1L;
        
        public ReduktionsfaktorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FAKTOR$0 = 
            new javax.xml.namespace.QName("DataImport", "Faktor");
        
        
        /**
         * Gets the "Faktor" element
         */
        public java.math.BigDecimal getFaktor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAKTOR$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "Faktor" element
         */
        public dataImport.AldersInverkanType.Reduktionsfaktor.Faktor xgetFaktor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                dataImport.AldersInverkanType.Reduktionsfaktor.Faktor target = null;
                target = (dataImport.AldersInverkanType.Reduktionsfaktor.Faktor)get_store().find_element_user(FAKTOR$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Faktor" element
         */
        public void setFaktor(java.math.BigDecimal faktor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAKTOR$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAKTOR$0);
                }
                target.setBigDecimalValue(faktor);
            }
        }
        
        /**
         * Sets (as xml) the "Faktor" element
         */
        public void xsetFaktor(dataImport.AldersInverkanType.Reduktionsfaktor.Faktor faktor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                dataImport.AldersInverkanType.Reduktionsfaktor.Faktor target = null;
                target = (dataImport.AldersInverkanType.Reduktionsfaktor.Faktor)get_store().find_element_user(FAKTOR$0, 0);
                if (target == null)
                {
                    target = (dataImport.AldersInverkanType.Reduktionsfaktor.Faktor)get_store().add_element_user(FAKTOR$0);
                }
                target.set(faktor);
            }
        }
        /**
         * An XML Faktor(@DataImport).
         *
         * This is an atomic type that is a restriction of dataImport.AldersInverkanType$Reduktionsfaktor$Faktor.
         */
        public static class FaktorImpl extends org.apache.xmlbeans.impl.values.JavaDecimalHolderEx implements dataImport.AldersInverkanType.Reduktionsfaktor.Faktor
        {
            private static final long serialVersionUID = 1L;
            
            public FaktorImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected FaktorImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
