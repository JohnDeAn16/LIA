/*
 * An XML document type.
 * Localname: GoMDoc
 * Namespace: http://www.example.org/GrundMarginal
 * Java type: org.example.grundMarginal.GoMDocDocument
 *
 * Automatically generated - do not modify.
 */
package org.example.grundMarginal.impl;
/**
 * A document containing one GoMDoc(@http://www.example.org/GrundMarginal) element.
 *
 * This is a complex type.
 */
public class GoMDocDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.example.grundMarginal.GoMDocDocument
{
    private static final long serialVersionUID = 1L;
    
    public GoMDocDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GOMDOC$0 = 
        new javax.xml.namespace.QName("http://www.example.org/GrundMarginal", "GoMDoc");
    
    
    /**
     * Gets the "GoMDoc" element
     */
    public org.example.grundMarginal.GoMDocDocument.GoMDoc getGoMDoc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.example.grundMarginal.GoMDocDocument.GoMDoc target = null;
            target = (org.example.grundMarginal.GoMDocDocument.GoMDoc)get_store().find_element_user(GOMDOC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GoMDoc" element
     */
    public void setGoMDoc(org.example.grundMarginal.GoMDocDocument.GoMDoc goMDoc)
    {
        generatedSetterHelperImpl(goMDoc, GOMDOC$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GoMDoc" element
     */
    public org.example.grundMarginal.GoMDocDocument.GoMDoc addNewGoMDoc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.example.grundMarginal.GoMDocDocument.GoMDoc target = null;
            target = (org.example.grundMarginal.GoMDocDocument.GoMDoc)get_store().add_element_user(GOMDOC$0);
            return target;
        }
    }
    /**
     * An XML GoMDoc(@http://www.example.org/GrundMarginal).
     *
     * This is a complex type.
     */
    public static class GoMDocImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.example.grundMarginal.GoMDocDocument.GoMDoc
    {
        private static final long serialVersionUID = 1L;
        
        public GoMDocImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GRUNDOCHMARGINAL$0 = 
            new javax.xml.namespace.QName("http://www.example.org/GrundMarginal", "GrundOchMarginal");
        
        
        /**
         * Gets array of all "GrundOchMarginal" elements
         */
        public org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal[] getGrundOchMarginalArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(GRUNDOCHMARGINAL$0, targetList);
                org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal[] result = new org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "GrundOchMarginal" element
         */
        public org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal getGrundOchMarginalArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal target = null;
                target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal)get_store().find_element_user(GRUNDOCHMARGINAL$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "GrundOchMarginal" element
         */
        public int sizeOfGrundOchMarginalArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GRUNDOCHMARGINAL$0);
            }
        }
        
        /**
         * Sets array of all "GrundOchMarginal" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setGrundOchMarginalArray(org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal[] grundOchMarginalArray)
        {
            check_orphaned();
            arraySetterHelper(grundOchMarginalArray, GRUNDOCHMARGINAL$0);
        }
        
        /**
         * Sets ith "GrundOchMarginal" element
         */
        public void setGrundOchMarginalArray(int i, org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal grundOchMarginal)
        {
            generatedSetterHelperImpl(grundOchMarginal, GRUNDOCHMARGINAL$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "GrundOchMarginal" element
         */
        public org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal insertNewGrundOchMarginal(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal target = null;
                target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal)get_store().insert_element_user(GRUNDOCHMARGINAL$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "GrundOchMarginal" element
         */
        public org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal addNewGrundOchMarginal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal target = null;
                target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal)get_store().add_element_user(GRUNDOCHMARGINAL$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "GrundOchMarginal" element
         */
        public void removeGrundOchMarginal(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GRUNDOCHMARGINAL$0, i);
            }
        }
        /**
         * An XML GrundOchMarginal(@http://www.example.org/GrundMarginal).
         *
         * This is a complex type.
         */
        public static class GrundOchMarginalImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal
        {
            private static final long serialVersionUID = 1L;
            
            public GrundOchMarginalImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName FASTIGHETSTAXERINGSAR$0 = 
                new javax.xml.namespace.QName("http://www.example.org/GrundMarginal", "fastighetsTaxeringsAr");
            private static final javax.xml.namespace.QName NIVAFAKTOR$2 = 
                new javax.xml.namespace.QName("http://www.example.org/GrundMarginal", "nivaFaktor");
            private static final javax.xml.namespace.QName STANDARDPOANG$4 = 
                new javax.xml.namespace.QName("http://www.example.org/GrundMarginal", "standardPoang");
            private static final javax.xml.namespace.QName VARDEYTA$6 = 
                new javax.xml.namespace.QName("http://www.example.org/GrundMarginal", "vardeYta");
            private static final javax.xml.namespace.QName VARDE$8 = 
                new javax.xml.namespace.QName("http://www.example.org/GrundMarginal", "varde");
            
            
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
            public org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.FastighetsTaxeringsAr xgetFastighetsTaxeringsAr()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.FastighetsTaxeringsAr target = null;
                    target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.FastighetsTaxeringsAr)get_store().find_element_user(FASTIGHETSTAXERINGSAR$0, 0);
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
            public void xsetFastighetsTaxeringsAr(org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.FastighetsTaxeringsAr fastighetsTaxeringsAr)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.FastighetsTaxeringsAr target = null;
                    target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.FastighetsTaxeringsAr)get_store().find_element_user(FASTIGHETSTAXERINGSAR$0, 0);
                    if (target == null)
                    {
                      target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.FastighetsTaxeringsAr)get_store().add_element_user(FASTIGHETSTAXERINGSAR$0);
                    }
                    target.set(fastighetsTaxeringsAr);
                }
            }
            
            /**
             * Gets array of all "nivaFaktor" elements
             */
            public org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor[] getNivaFaktorArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(NIVAFAKTOR$2, targetList);
                    org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor[] result = new org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "nivaFaktor" element
             */
            public org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor getNivaFaktorArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor target = null;
                    target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor)get_store().find_element_user(NIVAFAKTOR$2, i);
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
            public void setNivaFaktorArray(org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor[] nivaFaktorArray)
            {
                check_orphaned();
                arraySetterHelper(nivaFaktorArray, NIVAFAKTOR$2);
            }
            
            /**
             * Sets ith "nivaFaktor" element
             */
            public void setNivaFaktorArray(int i, org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor nivaFaktor)
            {
                generatedSetterHelperImpl(nivaFaktor, NIVAFAKTOR$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "nivaFaktor" element
             */
            public org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor insertNewNivaFaktor(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor target = null;
                    target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor)get_store().insert_element_user(NIVAFAKTOR$2, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "nivaFaktor" element
             */
            public org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor addNewNivaFaktor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor target = null;
                    target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor)get_store().add_element_user(NIVAFAKTOR$2);
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
            public org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang[] getStandardPoangArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(STANDARDPOANG$4, targetList);
                    org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang[] result = new org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "standardPoang" element
             */
            public org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang getStandardPoangArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang target = null;
                    target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang)get_store().find_element_user(STANDARDPOANG$4, i);
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
            public void setStandardPoangArray(org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang[] standardPoangArray)
            {
                check_orphaned();
                arraySetterHelper(standardPoangArray, STANDARDPOANG$4);
            }
            
            /**
             * Sets ith "standardPoang" element
             */
            public void setStandardPoangArray(int i, org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang standardPoang)
            {
                generatedSetterHelperImpl(standardPoang, STANDARDPOANG$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "standardPoang" element
             */
            public org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang insertNewStandardPoang(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang target = null;
                    target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang)get_store().insert_element_user(STANDARDPOANG$4, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "standardPoang" element
             */
            public org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang addNewStandardPoang()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang target = null;
                    target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang)get_store().add_element_user(STANDARDPOANG$4);
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
            public org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta[] getVardeYtaArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(VARDEYTA$6, targetList);
                    org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta[] result = new org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "vardeYta" element
             */
            public org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta getVardeYtaArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta target = null;
                    target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta)get_store().find_element_user(VARDEYTA$6, i);
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
            public void setVardeYtaArray(org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta[] vardeYtaArray)
            {
                check_orphaned();
                arraySetterHelper(vardeYtaArray, VARDEYTA$6);
            }
            
            /**
             * Sets ith "vardeYta" element
             */
            public void setVardeYtaArray(int i, org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta vardeYta)
            {
                generatedSetterHelperImpl(vardeYta, VARDEYTA$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "vardeYta" element
             */
            public org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta insertNewVardeYta(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta target = null;
                    target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta)get_store().insert_element_user(VARDEYTA$6, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "vardeYta" element
             */
            public org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta addNewVardeYta()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta target = null;
                    target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta)get_store().add_element_user(VARDEYTA$6);
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
            public org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde getVarde()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde target = null;
                    target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde)get_store().find_element_user(VARDE$8, 0);
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
            public void setVarde(org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde varde)
            {
                generatedSetterHelperImpl(varde, VARDE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "varde" element
             */
            public org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde addNewVarde()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde target = null;
                    target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde)get_store().add_element_user(VARDE$8);
                    return target;
                }
            }
            /**
             * An XML fastighetsTaxeringsAr(@http://www.example.org/GrundMarginal).
             *
             * This is an atomic type that is a restriction of org.example.grundMarginal.GoMDocDocument$GoMDoc$GrundOchMarginal$FastighetsTaxeringsAr.
             */
            public static class FastighetsTaxeringsArImpl extends org.apache.xmlbeans.impl.values.JavaGDateHolderEx implements org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.FastighetsTaxeringsAr
            {
                private static final long serialVersionUID = 1L;
                
                public FastighetsTaxeringsArImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected FastighetsTaxeringsArImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML nivaFaktor(@http://www.example.org/GrundMarginal).
             *
             * This is a complex type.
             */
            public static class NivaFaktorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor
            {
                private static final long serialVersionUID = 1L;
                
                public NivaFaktorImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName UNDREGRANS$0 = 
                    new javax.xml.namespace.QName("http://www.example.org/GrundMarginal", "undreGrans");
                private static final javax.xml.namespace.QName OVREGRANS$2 = 
                    new javax.xml.namespace.QName("http://www.example.org/GrundMarginal", "ovreGrans");
                
                
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
                public org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor.UndreGrans xgetUndreGrans()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor.UndreGrans target = null;
                      target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor.UndreGrans)get_store().find_element_user(UNDREGRANS$0, 0);
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
                public void xsetUndreGrans(org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor.UndreGrans undreGrans)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor.UndreGrans target = null;
                      target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor.UndreGrans)get_store().find_element_user(UNDREGRANS$0, 0);
                      if (target == null)
                      {
                        target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor.UndreGrans)get_store().add_element_user(UNDREGRANS$0);
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
                public org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor.OvreGrans xgetOvreGrans()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor.OvreGrans target = null;
                      target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor.OvreGrans)get_store().find_element_user(OVREGRANS$2, 0);
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
                public void xsetOvreGrans(org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor.OvreGrans ovreGrans)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor.OvreGrans target = null;
                      target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor.OvreGrans)get_store().find_element_user(OVREGRANS$2, 0);
                      if (target == null)
                      {
                        target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor.OvreGrans)get_store().add_element_user(OVREGRANS$2);
                      }
                      target.set(ovreGrans);
                    }
                }
                /**
                 * An XML undreGrans(@http://www.example.org/GrundMarginal).
                 *
                 * This is an atomic type that is a restriction of org.example.grundMarginal.GoMDocDocument$GoMDoc$GrundOchMarginal$NivaFaktor$UndreGrans.
                 */
                public static class UndreGransImpl extends org.apache.xmlbeans.impl.values.JavaDecimalHolderEx implements org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor.UndreGrans
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
                 * An XML ovreGrans(@http://www.example.org/GrundMarginal).
                 *
                 * This is an atomic type that is a restriction of org.example.grundMarginal.GoMDocDocument$GoMDoc$GrundOchMarginal$NivaFaktor$OvreGrans.
                 */
                public static class OvreGransImpl extends org.apache.xmlbeans.impl.values.JavaDecimalHolderEx implements org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor.OvreGrans
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
             * An XML standardPoang(@http://www.example.org/GrundMarginal).
             *
             * This is a complex type.
             */
            public static class StandardPoangImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang
            {
                private static final long serialVersionUID = 1L;
                
                public StandardPoangImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName UNDREGRANS$0 = 
                    new javax.xml.namespace.QName("http://www.example.org/GrundMarginal", "undreGrans");
                private static final javax.xml.namespace.QName OVREGRANS$2 = 
                    new javax.xml.namespace.QName("http://www.example.org/GrundMarginal", "ovreGrans");
                
                
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
                public org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang.UndreGrans xgetUndreGrans()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang.UndreGrans target = null;
                      target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang.UndreGrans)get_store().find_element_user(UNDREGRANS$0, 0);
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
                public void xsetUndreGrans(org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang.UndreGrans undreGrans)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang.UndreGrans target = null;
                      target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang.UndreGrans)get_store().find_element_user(UNDREGRANS$0, 0);
                      if (target == null)
                      {
                        target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang.UndreGrans)get_store().add_element_user(UNDREGRANS$0);
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
                public org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang.OvreGrans xgetOvreGrans()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang.OvreGrans target = null;
                      target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang.OvreGrans)get_store().find_element_user(OVREGRANS$2, 0);
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
                public void xsetOvreGrans(org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang.OvreGrans ovreGrans)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang.OvreGrans target = null;
                      target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang.OvreGrans)get_store().find_element_user(OVREGRANS$2, 0);
                      if (target == null)
                      {
                        target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang.OvreGrans)get_store().add_element_user(OVREGRANS$2);
                      }
                      target.set(ovreGrans);
                    }
                }
                /**
                 * An XML undreGrans(@http://www.example.org/GrundMarginal).
                 *
                 * This is an atomic type that is a restriction of org.example.grundMarginal.GoMDocDocument$GoMDoc$GrundOchMarginal$StandardPoang$UndreGrans.
                 */
                public static class UndreGransImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang.UndreGrans
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
                 * An XML ovreGrans(@http://www.example.org/GrundMarginal).
                 *
                 * This is an atomic type that is a restriction of org.example.grundMarginal.GoMDocDocument$GoMDoc$GrundOchMarginal$StandardPoang$OvreGrans.
                 */
                public static class OvreGransImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang.OvreGrans
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
             * An XML vardeYta(@http://www.example.org/GrundMarginal).
             *
             * This is a complex type.
             */
            public static class VardeYtaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta
            {
                private static final long serialVersionUID = 1L;
                
                public VardeYtaImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName UNDREGRANS$0 = 
                    new javax.xml.namespace.QName("http://www.example.org/GrundMarginal", "undreGrans");
                private static final javax.xml.namespace.QName OVREGRANS$2 = 
                    new javax.xml.namespace.QName("http://www.example.org/GrundMarginal", "ovreGrans");
                
                
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
                public org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta.UndreGrans xgetUndreGrans()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta.UndreGrans target = null;
                      target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta.UndreGrans)get_store().find_element_user(UNDREGRANS$0, 0);
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
                public void xsetUndreGrans(org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta.UndreGrans undreGrans)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta.UndreGrans target = null;
                      target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta.UndreGrans)get_store().find_element_user(UNDREGRANS$0, 0);
                      if (target == null)
                      {
                        target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta.UndreGrans)get_store().add_element_user(UNDREGRANS$0);
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
                public org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta.OvreGrans xgetOvreGrans()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta.OvreGrans target = null;
                      target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta.OvreGrans)get_store().find_element_user(OVREGRANS$2, 0);
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
                public void xsetOvreGrans(org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta.OvreGrans ovreGrans)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta.OvreGrans target = null;
                      target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta.OvreGrans)get_store().find_element_user(OVREGRANS$2, 0);
                      if (target == null)
                      {
                        target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta.OvreGrans)get_store().add_element_user(OVREGRANS$2);
                      }
                      target.set(ovreGrans);
                    }
                }
                /**
                 * An XML undreGrans(@http://www.example.org/GrundMarginal).
                 *
                 * This is an atomic type that is a restriction of org.example.grundMarginal.GoMDocDocument$GoMDoc$GrundOchMarginal$VardeYta$UndreGrans.
                 */
                public static class UndreGransImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta.UndreGrans
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
                 * An XML ovreGrans(@http://www.example.org/GrundMarginal).
                 *
                 * This is an atomic type that is a restriction of org.example.grundMarginal.GoMDocDocument$GoMDoc$GrundOchMarginal$VardeYta$OvreGrans.
                 */
                public static class OvreGransImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta.OvreGrans
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
             * An XML varde(@http://www.example.org/GrundMarginal).
             *
             * This is a complex type.
             */
            public static class VardeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde
            {
                private static final long serialVersionUID = 1L;
                
                public VardeImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName GRUNDVARDE$0 = 
                    new javax.xml.namespace.QName("http://www.example.org/GrundMarginal", "grundVarde");
                private static final javax.xml.namespace.QName MARGINALVARDE$2 = 
                    new javax.xml.namespace.QName("http://www.example.org/GrundMarginal", "marginalVarde");
                
                
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
                public org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde.GrundVarde xgetGrundVarde()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde.GrundVarde target = null;
                      target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde.GrundVarde)get_store().find_element_user(GRUNDVARDE$0, 0);
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
                public void xsetGrundVarde(org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde.GrundVarde grundVarde)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde.GrundVarde target = null;
                      target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde.GrundVarde)get_store().find_element_user(GRUNDVARDE$0, 0);
                      if (target == null)
                      {
                        target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde.GrundVarde)get_store().add_element_user(GRUNDVARDE$0);
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
                public org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde.MarginalVarde xgetMarginalVarde()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde.MarginalVarde target = null;
                      target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde.MarginalVarde)get_store().find_element_user(MARGINALVARDE$2, 0);
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
                public void xsetMarginalVarde(org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde.MarginalVarde marginalVarde)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde.MarginalVarde target = null;
                      target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde.MarginalVarde)get_store().find_element_user(MARGINALVARDE$2, 0);
                      if (target == null)
                      {
                        target = (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde.MarginalVarde)get_store().add_element_user(MARGINALVARDE$2);
                      }
                      target.set(marginalVarde);
                    }
                }
                /**
                 * An XML grundVarde(@http://www.example.org/GrundMarginal).
                 *
                 * This is an atomic type that is a restriction of org.example.grundMarginal.GoMDocDocument$GoMDoc$GrundOchMarginal$Varde$GrundVarde.
                 */
                public static class GrundVardeImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde.GrundVarde
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
                 * An XML marginalVarde(@http://www.example.org/GrundMarginal).
                 *
                 * This is an atomic type that is a restriction of org.example.grundMarginal.GoMDocDocument$GoMDoc$GrundOchMarginal$Varde$MarginalVarde.
                 */
                public static class MarginalVardeImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde.MarginalVarde
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
    }
}
