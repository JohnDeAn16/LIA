/*
 * XML Type:  GrundOchMarginalType
 * Namespace: DataImport
 * Java type: dataImport.GrundOchMarginalType
 *
 * Automatically generated - do not modify.
 */
package dataImport.impl;
/**
 * An XML GrundOchMarginalType(@DataImport).
 *
 * This is a complex type.
 */
public class GrundOchMarginalTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dataImport.GrundOchMarginalType
{
    private static final long serialVersionUID = 1L;
    
    public GrundOchMarginalTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FASTIGHETSTAXERINGSAR$0 = 
        new javax.xml.namespace.QName("DataImport", "fastighetsTaxeringsAr");
    private static final javax.xml.namespace.QName NIVAFAKTOR$2 = 
        new javax.xml.namespace.QName("DataImport", "nivaFaktor");
    private static final javax.xml.namespace.QName STANDARDPOANG$4 = 
        new javax.xml.namespace.QName("DataImport", "standardPoang");
    private static final javax.xml.namespace.QName VARDEYTA$6 = 
        new javax.xml.namespace.QName("DataImport", "vardeYta");
    private static final javax.xml.namespace.QName VARDE$8 = 
        new javax.xml.namespace.QName("DataImport", "varde");
    
    
    /**
     * Gets the "fastighetsTaxeringsAr" element
     */
    public java.util.Calendar getFastighetsTaxeringsAr()
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
     * Gets (as xml) the "fastighetsTaxeringsAr" element
     */
    public dataImport.FastighetsTaxeringsArType xgetFastighetsTaxeringsAr()
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
     * Sets the "fastighetsTaxeringsAr" element
     */
    public void setFastighetsTaxeringsAr(java.util.Calendar fastighetsTaxeringsAr)
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
            target.setCalendarValue(fastighetsTaxeringsAr);
        }
    }
    
    /**
     * Sets (as xml) the "fastighetsTaxeringsAr" element
     */
    public void xsetFastighetsTaxeringsAr(dataImport.FastighetsTaxeringsArType fastighetsTaxeringsAr)
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
            target.set(fastighetsTaxeringsAr);
        }
    }
    
    /**
     * Gets array of all "nivaFaktor" elements
     */
    public dataImport.GrundOchMarginalType.NivaFaktor[] getNivaFaktorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NIVAFAKTOR$2, targetList);
            dataImport.GrundOchMarginalType.NivaFaktor[] result = new dataImport.GrundOchMarginalType.NivaFaktor[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "nivaFaktor" element
     */
    public dataImport.GrundOchMarginalType.NivaFaktor getNivaFaktorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.GrundOchMarginalType.NivaFaktor target = null;
            target = (dataImport.GrundOchMarginalType.NivaFaktor)get_store().find_element_user(NIVAFAKTOR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "nivaFaktor" element
     */
    public int sizeOfNivaFaktorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NIVAFAKTOR$2);
        }
    }
    
    /**
     * Sets array of all "nivaFaktor" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setNivaFaktorArray(dataImport.GrundOchMarginalType.NivaFaktor[] nivaFaktorArray)
    {
        check_orphaned();
        arraySetterHelper(nivaFaktorArray, NIVAFAKTOR$2);
    }
    
    /**
     * Sets ith "nivaFaktor" element
     */
    public void setNivaFaktorArray(int i, dataImport.GrundOchMarginalType.NivaFaktor nivaFaktor)
    {
        generatedSetterHelperImpl(nivaFaktor, NIVAFAKTOR$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "nivaFaktor" element
     */
    public dataImport.GrundOchMarginalType.NivaFaktor insertNewNivaFaktor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.GrundOchMarginalType.NivaFaktor target = null;
            target = (dataImport.GrundOchMarginalType.NivaFaktor)get_store().insert_element_user(NIVAFAKTOR$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "nivaFaktor" element
     */
    public dataImport.GrundOchMarginalType.NivaFaktor addNewNivaFaktor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.GrundOchMarginalType.NivaFaktor target = null;
            target = (dataImport.GrundOchMarginalType.NivaFaktor)get_store().add_element_user(NIVAFAKTOR$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "nivaFaktor" element
     */
    public void removeNivaFaktor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NIVAFAKTOR$2, i);
        }
    }
    
    /**
     * Gets array of all "standardPoang" elements
     */
    public dataImport.GrundOchMarginalType.StandardPoang[] getStandardPoangArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STANDARDPOANG$4, targetList);
            dataImport.GrundOchMarginalType.StandardPoang[] result = new dataImport.GrundOchMarginalType.StandardPoang[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "standardPoang" element
     */
    public dataImport.GrundOchMarginalType.StandardPoang getStandardPoangArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.GrundOchMarginalType.StandardPoang target = null;
            target = (dataImport.GrundOchMarginalType.StandardPoang)get_store().find_element_user(STANDARDPOANG$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "standardPoang" element
     */
    public int sizeOfStandardPoangArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STANDARDPOANG$4);
        }
    }
    
    /**
     * Sets array of all "standardPoang" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setStandardPoangArray(dataImport.GrundOchMarginalType.StandardPoang[] standardPoangArray)
    {
        check_orphaned();
        arraySetterHelper(standardPoangArray, STANDARDPOANG$4);
    }
    
    /**
     * Sets ith "standardPoang" element
     */
    public void setStandardPoangArray(int i, dataImport.GrundOchMarginalType.StandardPoang standardPoang)
    {
        generatedSetterHelperImpl(standardPoang, STANDARDPOANG$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "standardPoang" element
     */
    public dataImport.GrundOchMarginalType.StandardPoang insertNewStandardPoang(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.GrundOchMarginalType.StandardPoang target = null;
            target = (dataImport.GrundOchMarginalType.StandardPoang)get_store().insert_element_user(STANDARDPOANG$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "standardPoang" element
     */
    public dataImport.GrundOchMarginalType.StandardPoang addNewStandardPoang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.GrundOchMarginalType.StandardPoang target = null;
            target = (dataImport.GrundOchMarginalType.StandardPoang)get_store().add_element_user(STANDARDPOANG$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "standardPoang" element
     */
    public void removeStandardPoang(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STANDARDPOANG$4, i);
        }
    }
    
    /**
     * Gets array of all "vardeYta" elements
     */
    public dataImport.GrundOchMarginalType.VardeYta[] getVardeYtaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VARDEYTA$6, targetList);
            dataImport.GrundOchMarginalType.VardeYta[] result = new dataImport.GrundOchMarginalType.VardeYta[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "vardeYta" element
     */
    public dataImport.GrundOchMarginalType.VardeYta getVardeYtaArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.GrundOchMarginalType.VardeYta target = null;
            target = (dataImport.GrundOchMarginalType.VardeYta)get_store().find_element_user(VARDEYTA$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "vardeYta" element
     */
    public int sizeOfVardeYtaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VARDEYTA$6);
        }
    }
    
    /**
     * Sets array of all "vardeYta" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setVardeYtaArray(dataImport.GrundOchMarginalType.VardeYta[] vardeYtaArray)
    {
        check_orphaned();
        arraySetterHelper(vardeYtaArray, VARDEYTA$6);
    }
    
    /**
     * Sets ith "vardeYta" element
     */
    public void setVardeYtaArray(int i, dataImport.GrundOchMarginalType.VardeYta vardeYta)
    {
        generatedSetterHelperImpl(vardeYta, VARDEYTA$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "vardeYta" element
     */
    public dataImport.GrundOchMarginalType.VardeYta insertNewVardeYta(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.GrundOchMarginalType.VardeYta target = null;
            target = (dataImport.GrundOchMarginalType.VardeYta)get_store().insert_element_user(VARDEYTA$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "vardeYta" element
     */
    public dataImport.GrundOchMarginalType.VardeYta addNewVardeYta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.GrundOchMarginalType.VardeYta target = null;
            target = (dataImport.GrundOchMarginalType.VardeYta)get_store().add_element_user(VARDEYTA$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "vardeYta" element
     */
    public void removeVardeYta(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VARDEYTA$6, i);
        }
    }
    
    /**
     * Gets the "varde" element
     */
    public dataImport.GrundOchMarginalType.Varde getVarde()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.GrundOchMarginalType.Varde target = null;
            target = (dataImport.GrundOchMarginalType.Varde)get_store().find_element_user(VARDE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "varde" element
     */
    public void setVarde(dataImport.GrundOchMarginalType.Varde varde)
    {
        generatedSetterHelperImpl(varde, VARDE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "varde" element
     */
    public dataImport.GrundOchMarginalType.Varde addNewVarde()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.GrundOchMarginalType.Varde target = null;
            target = (dataImport.GrundOchMarginalType.Varde)get_store().add_element_user(VARDE$8);
            return target;
        }
    }
    /**
     * An XML nivaFaktor(@DataImport).
     *
     * This is a complex type.
     */
    public static class NivaFaktorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dataImport.GrundOchMarginalType.NivaFaktor
    {
        private static final long serialVersionUID = 1L;
        
        public NivaFaktorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName UNDREGRANS$0 = 
            new javax.xml.namespace.QName("DataImport", "undreGrans");
        private static final javax.xml.namespace.QName OVREGRANS$2 = 
            new javax.xml.namespace.QName("DataImport", "ovreGrans");
        
        
        /**
         * Gets the "undreGrans" element
         */
        public java.math.BigDecimal getUndreGrans()
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
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "undreGrans" element
         */
        public dataImport.GrundOchMarginalType.NivaFaktor.UndreGrans xgetUndreGrans()
        {
            synchronized (monitor())
            {
                check_orphaned();
                dataImport.GrundOchMarginalType.NivaFaktor.UndreGrans target = null;
                target = (dataImport.GrundOchMarginalType.NivaFaktor.UndreGrans)get_store().find_element_user(UNDREGRANS$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "undreGrans" element
         */
        public void setUndreGrans(java.math.BigDecimal undreGrans)
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
                target.setBigDecimalValue(undreGrans);
            }
        }
        
        /**
         * Sets (as xml) the "undreGrans" element
         */
        public void xsetUndreGrans(dataImport.GrundOchMarginalType.NivaFaktor.UndreGrans undreGrans)
        {
            synchronized (monitor())
            {
                check_orphaned();
                dataImport.GrundOchMarginalType.NivaFaktor.UndreGrans target = null;
                target = (dataImport.GrundOchMarginalType.NivaFaktor.UndreGrans)get_store().find_element_user(UNDREGRANS$0, 0);
                if (target == null)
                {
                    target = (dataImport.GrundOchMarginalType.NivaFaktor.UndreGrans)get_store().add_element_user(UNDREGRANS$0);
                }
                target.set(undreGrans);
            }
        }
        
        /**
         * Gets the "ovreGrans" element
         */
        public java.math.BigDecimal getOvreGrans()
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
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "ovreGrans" element
         */
        public dataImport.GrundOchMarginalType.NivaFaktor.OvreGrans xgetOvreGrans()
        {
            synchronized (monitor())
            {
                check_orphaned();
                dataImport.GrundOchMarginalType.NivaFaktor.OvreGrans target = null;
                target = (dataImport.GrundOchMarginalType.NivaFaktor.OvreGrans)get_store().find_element_user(OVREGRANS$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ovreGrans" element
         */
        public void setOvreGrans(java.math.BigDecimal ovreGrans)
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
                target.setBigDecimalValue(ovreGrans);
            }
        }
        
        /**
         * Sets (as xml) the "ovreGrans" element
         */
        public void xsetOvreGrans(dataImport.GrundOchMarginalType.NivaFaktor.OvreGrans ovreGrans)
        {
            synchronized (monitor())
            {
                check_orphaned();
                dataImport.GrundOchMarginalType.NivaFaktor.OvreGrans target = null;
                target = (dataImport.GrundOchMarginalType.NivaFaktor.OvreGrans)get_store().find_element_user(OVREGRANS$2, 0);
                if (target == null)
                {
                    target = (dataImport.GrundOchMarginalType.NivaFaktor.OvreGrans)get_store().add_element_user(OVREGRANS$2);
                }
                target.set(ovreGrans);
            }
        }
        /**
         * An XML undreGrans(@DataImport).
         *
         * This is an atomic type that is a restriction of dataImport.GrundOchMarginalType$NivaFaktor$UndreGrans.
         */
        public static class UndreGransImpl extends org.apache.xmlbeans.impl.values.JavaDecimalHolderEx implements dataImport.GrundOchMarginalType.NivaFaktor.UndreGrans
        {
            private static final long serialVersionUID = 1L;
            
            public UndreGransImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected UndreGransImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML ovreGrans(@DataImport).
         *
         * This is an atomic type that is a restriction of dataImport.GrundOchMarginalType$NivaFaktor$OvreGrans.
         */
        public static class OvreGransImpl extends org.apache.xmlbeans.impl.values.JavaDecimalHolderEx implements dataImport.GrundOchMarginalType.NivaFaktor.OvreGrans
        {
            private static final long serialVersionUID = 1L;
            
            public OvreGransImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected OvreGransImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
    /**
     * An XML standardPoang(@DataImport).
     *
     * This is a complex type.
     */
    public static class StandardPoangImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dataImport.GrundOchMarginalType.StandardPoang
    {
        private static final long serialVersionUID = 1L;
        
        public StandardPoangImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName UNDREGRANS$0 = 
            new javax.xml.namespace.QName("DataImport", "undreGrans");
        private static final javax.xml.namespace.QName OVREGRANS$2 = 
            new javax.xml.namespace.QName("DataImport", "ovreGrans");
        
        
        /**
         * Gets the "undreGrans" element
         */
        public int getUndreGrans()
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
         * Gets (as xml) the "undreGrans" element
         */
        public dataImport.GrundOchMarginalType.StandardPoang.UndreGrans xgetUndreGrans()
        {
            synchronized (monitor())
            {
                check_orphaned();
                dataImport.GrundOchMarginalType.StandardPoang.UndreGrans target = null;
                target = (dataImport.GrundOchMarginalType.StandardPoang.UndreGrans)get_store().find_element_user(UNDREGRANS$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "undreGrans" element
         */
        public void setUndreGrans(int undreGrans)
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
                target.setIntValue(undreGrans);
            }
        }
        
        /**
         * Sets (as xml) the "undreGrans" element
         */
        public void xsetUndreGrans(dataImport.GrundOchMarginalType.StandardPoang.UndreGrans undreGrans)
        {
            synchronized (monitor())
            {
                check_orphaned();
                dataImport.GrundOchMarginalType.StandardPoang.UndreGrans target = null;
                target = (dataImport.GrundOchMarginalType.StandardPoang.UndreGrans)get_store().find_element_user(UNDREGRANS$0, 0);
                if (target == null)
                {
                    target = (dataImport.GrundOchMarginalType.StandardPoang.UndreGrans)get_store().add_element_user(UNDREGRANS$0);
                }
                target.set(undreGrans);
            }
        }
        
        /**
         * Gets the "ovreGrans" element
         */
        public int getOvreGrans()
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
         * Gets (as xml) the "ovreGrans" element
         */
        public dataImport.GrundOchMarginalType.StandardPoang.OvreGrans xgetOvreGrans()
        {
            synchronized (monitor())
            {
                check_orphaned();
                dataImport.GrundOchMarginalType.StandardPoang.OvreGrans target = null;
                target = (dataImport.GrundOchMarginalType.StandardPoang.OvreGrans)get_store().find_element_user(OVREGRANS$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ovreGrans" element
         */
        public void setOvreGrans(int ovreGrans)
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
                target.setIntValue(ovreGrans);
            }
        }
        
        /**
         * Sets (as xml) the "ovreGrans" element
         */
        public void xsetOvreGrans(dataImport.GrundOchMarginalType.StandardPoang.OvreGrans ovreGrans)
        {
            synchronized (monitor())
            {
                check_orphaned();
                dataImport.GrundOchMarginalType.StandardPoang.OvreGrans target = null;
                target = (dataImport.GrundOchMarginalType.StandardPoang.OvreGrans)get_store().find_element_user(OVREGRANS$2, 0);
                if (target == null)
                {
                    target = (dataImport.GrundOchMarginalType.StandardPoang.OvreGrans)get_store().add_element_user(OVREGRANS$2);
                }
                target.set(ovreGrans);
            }
        }
        /**
         * An XML undreGrans(@DataImport).
         *
         * This is an atomic type that is a restriction of dataImport.GrundOchMarginalType$StandardPoang$UndreGrans.
         */
        public static class UndreGransImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements dataImport.GrundOchMarginalType.StandardPoang.UndreGrans
        {
            private static final long serialVersionUID = 1L;
            
            public UndreGransImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected UndreGransImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML ovreGrans(@DataImport).
         *
         * This is an atomic type that is a restriction of dataImport.GrundOchMarginalType$StandardPoang$OvreGrans.
         */
        public static class OvreGransImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements dataImport.GrundOchMarginalType.StandardPoang.OvreGrans
        {
            private static final long serialVersionUID = 1L;
            
            public OvreGransImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected OvreGransImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
    /**
     * An XML vardeYta(@DataImport).
     *
     * This is a complex type.
     */
    public static class VardeYtaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dataImport.GrundOchMarginalType.VardeYta
    {
        private static final long serialVersionUID = 1L;
        
        public VardeYtaImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName UNDREGRANS$0 = 
            new javax.xml.namespace.QName("DataImport", "undreGrans");
        private static final javax.xml.namespace.QName OVREGRANS$2 = 
            new javax.xml.namespace.QName("DataImport", "ovreGrans");
        
        
        /**
         * Gets the "undreGrans" element
         */
        public int getUndreGrans()
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
         * Gets (as xml) the "undreGrans" element
         */
        public dataImport.GrundOchMarginalType.VardeYta.UndreGrans xgetUndreGrans()
        {
            synchronized (monitor())
            {
                check_orphaned();
                dataImport.GrundOchMarginalType.VardeYta.UndreGrans target = null;
                target = (dataImport.GrundOchMarginalType.VardeYta.UndreGrans)get_store().find_element_user(UNDREGRANS$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "undreGrans" element
         */
        public void setUndreGrans(int undreGrans)
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
                target.setIntValue(undreGrans);
            }
        }
        
        /**
         * Sets (as xml) the "undreGrans" element
         */
        public void xsetUndreGrans(dataImport.GrundOchMarginalType.VardeYta.UndreGrans undreGrans)
        {
            synchronized (monitor())
            {
                check_orphaned();
                dataImport.GrundOchMarginalType.VardeYta.UndreGrans target = null;
                target = (dataImport.GrundOchMarginalType.VardeYta.UndreGrans)get_store().find_element_user(UNDREGRANS$0, 0);
                if (target == null)
                {
                    target = (dataImport.GrundOchMarginalType.VardeYta.UndreGrans)get_store().add_element_user(UNDREGRANS$0);
                }
                target.set(undreGrans);
            }
        }
        
        /**
         * Gets the "ovreGrans" element
         */
        public int getOvreGrans()
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
         * Gets (as xml) the "ovreGrans" element
         */
        public dataImport.GrundOchMarginalType.VardeYta.OvreGrans xgetOvreGrans()
        {
            synchronized (monitor())
            {
                check_orphaned();
                dataImport.GrundOchMarginalType.VardeYta.OvreGrans target = null;
                target = (dataImport.GrundOchMarginalType.VardeYta.OvreGrans)get_store().find_element_user(OVREGRANS$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ovreGrans" element
         */
        public void setOvreGrans(int ovreGrans)
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
                target.setIntValue(ovreGrans);
            }
        }
        
        /**
         * Sets (as xml) the "ovreGrans" element
         */
        public void xsetOvreGrans(dataImport.GrundOchMarginalType.VardeYta.OvreGrans ovreGrans)
        {
            synchronized (monitor())
            {
                check_orphaned();
                dataImport.GrundOchMarginalType.VardeYta.OvreGrans target = null;
                target = (dataImport.GrundOchMarginalType.VardeYta.OvreGrans)get_store().find_element_user(OVREGRANS$2, 0);
                if (target == null)
                {
                    target = (dataImport.GrundOchMarginalType.VardeYta.OvreGrans)get_store().add_element_user(OVREGRANS$2);
                }
                target.set(ovreGrans);
            }
        }
        /**
         * An XML undreGrans(@DataImport).
         *
         * This is an atomic type that is a restriction of dataImport.GrundOchMarginalType$VardeYta$UndreGrans.
         */
        public static class UndreGransImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements dataImport.GrundOchMarginalType.VardeYta.UndreGrans
        {
            private static final long serialVersionUID = 1L;
            
            public UndreGransImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected UndreGransImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML ovreGrans(@DataImport).
         *
         * This is an atomic type that is a restriction of dataImport.GrundOchMarginalType$VardeYta$OvreGrans.
         */
        public static class OvreGransImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements dataImport.GrundOchMarginalType.VardeYta.OvreGrans
        {
            private static final long serialVersionUID = 1L;
            
            public OvreGransImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected OvreGransImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
    /**
     * An XML varde(@DataImport).
     *
     * This is a complex type.
     */
    public static class VardeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dataImport.GrundOchMarginalType.Varde
    {
        private static final long serialVersionUID = 1L;
        
        public VardeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GRUNDVARDE$0 = 
            new javax.xml.namespace.QName("DataImport", "grundVarde");
        private static final javax.xml.namespace.QName MARGINALVARDE$2 = 
            new javax.xml.namespace.QName("DataImport", "marginalVarde");
        
        
        /**
         * Gets the "grundVarde" element
         */
        public int getGrundVarde()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GRUNDVARDE$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "grundVarde" element
         */
        public dataImport.GrundOchMarginalType.Varde.GrundVarde xgetGrundVarde()
        {
            synchronized (monitor())
            {
                check_orphaned();
                dataImport.GrundOchMarginalType.Varde.GrundVarde target = null;
                target = (dataImport.GrundOchMarginalType.Varde.GrundVarde)get_store().find_element_user(GRUNDVARDE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "grundVarde" element
         */
        public void setGrundVarde(int grundVarde)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GRUNDVARDE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GRUNDVARDE$0);
                }
                target.setIntValue(grundVarde);
            }
        }
        
        /**
         * Sets (as xml) the "grundVarde" element
         */
        public void xsetGrundVarde(dataImport.GrundOchMarginalType.Varde.GrundVarde grundVarde)
        {
            synchronized (monitor())
            {
                check_orphaned();
                dataImport.GrundOchMarginalType.Varde.GrundVarde target = null;
                target = (dataImport.GrundOchMarginalType.Varde.GrundVarde)get_store().find_element_user(GRUNDVARDE$0, 0);
                if (target == null)
                {
                    target = (dataImport.GrundOchMarginalType.Varde.GrundVarde)get_store().add_element_user(GRUNDVARDE$0);
                }
                target.set(grundVarde);
            }
        }
        
        /**
         * Gets the "marginalVarde" element
         */
        public int getMarginalVarde()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MARGINALVARDE$2, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "marginalVarde" element
         */
        public dataImport.GrundOchMarginalType.Varde.MarginalVarde xgetMarginalVarde()
        {
            synchronized (monitor())
            {
                check_orphaned();
                dataImport.GrundOchMarginalType.Varde.MarginalVarde target = null;
                target = (dataImport.GrundOchMarginalType.Varde.MarginalVarde)get_store().find_element_user(MARGINALVARDE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "marginalVarde" element
         */
        public void setMarginalVarde(int marginalVarde)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MARGINALVARDE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MARGINALVARDE$2);
                }
                target.setIntValue(marginalVarde);
            }
        }
        
        /**
         * Sets (as xml) the "marginalVarde" element
         */
        public void xsetMarginalVarde(dataImport.GrundOchMarginalType.Varde.MarginalVarde marginalVarde)
        {
            synchronized (monitor())
            {
                check_orphaned();
                dataImport.GrundOchMarginalType.Varde.MarginalVarde target = null;
                target = (dataImport.GrundOchMarginalType.Varde.MarginalVarde)get_store().find_element_user(MARGINALVARDE$2, 0);
                if (target == null)
                {
                    target = (dataImport.GrundOchMarginalType.Varde.MarginalVarde)get_store().add_element_user(MARGINALVARDE$2);
                }
                target.set(marginalVarde);
            }
        }
        /**
         * An XML grundVarde(@DataImport).
         *
         * This is an atomic type that is a restriction of dataImport.GrundOchMarginalType$Varde$GrundVarde.
         */
        public static class GrundVardeImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements dataImport.GrundOchMarginalType.Varde.GrundVarde
        {
            private static final long serialVersionUID = 1L;
            
            public GrundVardeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected GrundVardeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML marginalVarde(@DataImport).
         *
         * This is an atomic type that is a restriction of dataImport.GrundOchMarginalType$Varde$MarginalVarde.
         */
        public static class MarginalVardeImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements dataImport.GrundOchMarginalType.Varde.MarginalVarde
        {
            private static final long serialVersionUID = 1L;
            
            public MarginalVardeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected MarginalVardeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
