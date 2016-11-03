/*
 * An XML document type.
 * Localname: Aldersinverkan_root
 * Namespace: http://www.example.org/Underlag
 * Java type: org.example.underlag.AldersinverkanRootDocument
 *
 * Automatically generated - do not modify.
 */
package org.example.underlag.impl;
/**
 * A document containing one Aldersinverkan_root(@http://www.example.org/Underlag) element.
 *
 * This is a complex type.
 */
public class AldersinverkanRootDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.example.underlag.AldersinverkanRootDocument
{
    private static final long serialVersionUID = 1L;
    
    public AldersinverkanRootDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALDERSINVERKANROOT$0 = 
        new javax.xml.namespace.QName("http://www.example.org/Underlag", "Aldersinverkan_root");
    
    
    /**
     * Gets the "Aldersinverkan_root" element
     */
    public org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot getAldersinverkanRoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot target = null;
            target = (org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot)get_store().find_element_user(ALDERSINVERKANROOT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Aldersinverkan_root" element
     */
    public void setAldersinverkanRoot(org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot aldersinverkanRoot)
    {
        generatedSetterHelperImpl(aldersinverkanRoot, ALDERSINVERKANROOT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Aldersinverkan_root" element
     */
    public org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot addNewAldersinverkanRoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot target = null;
            target = (org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot)get_store().add_element_user(ALDERSINVERKANROOT$0);
            return target;
        }
    }
    /**
     * An XML Aldersinverkan_root(@http://www.example.org/Underlag).
     *
     * This is a complex type.
     */
    public static class AldersinverkanRootImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot
    {
        private static final long serialVersionUID = 1L;
        
        public AldersinverkanRootImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FASTIGHETSTAXERINGSAR$0 = 
            new javax.xml.namespace.QName("http://www.example.org/Underlag", "Fastighetstaxeringsar");
        private static final javax.xml.namespace.QName ALDERSINVERKAN$2 = 
            new javax.xml.namespace.QName("http://www.example.org/Underlag", "Aldersinverkan");
        private static final javax.xml.namespace.QName VARDEAR$4 = 
            new javax.xml.namespace.QName("http://www.example.org/Underlag", "Vardear");
        private static final javax.xml.namespace.QName STANDARDPOANG$6 = 
            new javax.xml.namespace.QName("http://www.example.org/Underlag", "Standardpoang");
        private static final javax.xml.namespace.QName REDUKTIONSFAKTOR$8 = 
            new javax.xml.namespace.QName("http://www.example.org/Underlag", "Reduktionsfaktor");
        
        
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
        public org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Fastighetstaxeringsar xgetFastighetstaxeringsar()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Fastighetstaxeringsar target = null;
                target = (org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Fastighetstaxeringsar)get_store().find_element_user(FASTIGHETSTAXERINGSAR$0, 0);
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
        public void xsetFastighetstaxeringsar(org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Fastighetstaxeringsar fastighetstaxeringsar)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Fastighetstaxeringsar target = null;
                target = (org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Fastighetstaxeringsar)get_store().find_element_user(FASTIGHETSTAXERINGSAR$0, 0);
                if (target == null)
                {
                    target = (org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Fastighetstaxeringsar)get_store().add_element_user(FASTIGHETSTAXERINGSAR$0);
                }
                target.set(fastighetstaxeringsar);
            }
        }
        
        /**
         * Gets array of all "Aldersinverkan" elements
         */
        public org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Aldersinverkan[] getAldersinverkanArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ALDERSINVERKAN$2, targetList);
                org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Aldersinverkan[] result = new org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Aldersinverkan[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Aldersinverkan" element
         */
        public org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Aldersinverkan getAldersinverkanArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Aldersinverkan target = null;
                target = (org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Aldersinverkan)get_store().find_element_user(ALDERSINVERKAN$2, i);
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
        public void setAldersinverkanArray(org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Aldersinverkan[] aldersinverkanArray)
        {
            check_orphaned();
            arraySetterHelper(aldersinverkanArray, ALDERSINVERKAN$2);
        }
        
        /**
         * Sets ith "Aldersinverkan" element
         */
        public void setAldersinverkanArray(int i, org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Aldersinverkan aldersinverkan)
        {
            generatedSetterHelperImpl(aldersinverkan, ALDERSINVERKAN$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Aldersinverkan" element
         */
        public org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Aldersinverkan insertNewAldersinverkan(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Aldersinverkan target = null;
                target = (org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Aldersinverkan)get_store().insert_element_user(ALDERSINVERKAN$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Aldersinverkan" element
         */
        public org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Aldersinverkan addNewAldersinverkan()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Aldersinverkan target = null;
                target = (org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Aldersinverkan)get_store().add_element_user(ALDERSINVERKAN$2);
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
        public org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Vardear[] getVardearArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VARDEAR$4, targetList);
                org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Vardear[] result = new org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Vardear[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Vardear" element
         */
        public org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Vardear getVardearArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Vardear target = null;
                target = (org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Vardear)get_store().find_element_user(VARDEAR$4, i);
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
        public void setVardearArray(org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Vardear[] vardearArray)
        {
            check_orphaned();
            arraySetterHelper(vardearArray, VARDEAR$4);
        }
        
        /**
         * Sets ith "Vardear" element
         */
        public void setVardearArray(int i, org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Vardear vardear)
        {
            generatedSetterHelperImpl(vardear, VARDEAR$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Vardear" element
         */
        public org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Vardear insertNewVardear(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Vardear target = null;
                target = (org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Vardear)get_store().insert_element_user(VARDEAR$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Vardear" element
         */
        public org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Vardear addNewVardear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Vardear target = null;
                target = (org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Vardear)get_store().add_element_user(VARDEAR$4);
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
        public org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Standardpoang[] getStandardpoangArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STANDARDPOANG$6, targetList);
                org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Standardpoang[] result = new org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Standardpoang[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Standardpoang" element
         */
        public org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Standardpoang getStandardpoangArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Standardpoang target = null;
                target = (org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Standardpoang)get_store().find_element_user(STANDARDPOANG$6, i);
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
        public void setStandardpoangArray(org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Standardpoang[] standardpoangArray)
        {
            check_orphaned();
            arraySetterHelper(standardpoangArray, STANDARDPOANG$6);
        }
        
        /**
         * Sets ith "Standardpoang" element
         */
        public void setStandardpoangArray(int i, org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Standardpoang standardpoang)
        {
            generatedSetterHelperImpl(standardpoang, STANDARDPOANG$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Standardpoang" element
         */
        public org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Standardpoang insertNewStandardpoang(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Standardpoang target = null;
                target = (org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Standardpoang)get_store().insert_element_user(STANDARDPOANG$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Standardpoang" element
         */
        public org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Standardpoang addNewStandardpoang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Standardpoang target = null;
                target = (org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Standardpoang)get_store().add_element_user(STANDARDPOANG$6);
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
        public org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Reduktionsfaktor getReduktionsfaktor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Reduktionsfaktor target = null;
                target = (org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Reduktionsfaktor)get_store().find_element_user(REDUKTIONSFAKTOR$8, 0);
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
        public void setReduktionsfaktor(org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Reduktionsfaktor reduktionsfaktor)
        {
            generatedSetterHelperImpl(reduktionsfaktor, REDUKTIONSFAKTOR$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Reduktionsfaktor" element
         */
        public org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Reduktionsfaktor addNewReduktionsfaktor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Reduktionsfaktor target = null;
                target = (org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Reduktionsfaktor)get_store().add_element_user(REDUKTIONSFAKTOR$8);
                return target;
            }
        }
        /**
         * An XML Fastighetstaxeringsar(@http://www.example.org/Underlag).
         *
         * This is an atomic type that is a restriction of org.example.underlag.AldersinverkanRootDocument$AldersinverkanRoot$Fastighetstaxeringsar.
         */
        public static class FastighetstaxeringsarImpl extends org.apache.xmlbeans.impl.values.JavaGDateHolderEx implements org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Fastighetstaxeringsar
        {
            private static final long serialVersionUID = 1L;
            
            public FastighetstaxeringsarImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected FastighetstaxeringsarImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML Aldersinverkan(@http://www.example.org/Underlag).
         *
         * This is a complex type.
         */
        public static class AldersinverkanImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Aldersinverkan
        {
            private static final long serialVersionUID = 1L;
            
            public AldersinverkanImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PROCENT$0 = 
                new javax.xml.namespace.QName("http://www.example.org/Underlag", "Procent");
            
            
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
            public org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Aldersinverkan.Procent xgetProcent()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Aldersinverkan.Procent target = null;
                    target = (org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Aldersinverkan.Procent)get_store().find_element_user(PROCENT$0, 0);
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
            public void xsetProcent(org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Aldersinverkan.Procent procent)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Aldersinverkan.Procent target = null;
                    target = (org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Aldersinverkan.Procent)get_store().find_element_user(PROCENT$0, 0);
                    if (target == null)
                    {
                      target = (org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Aldersinverkan.Procent)get_store().add_element_user(PROCENT$0);
                    }
                    target.set(procent);
                }
            }
            /**
             * An XML Procent(@http://www.example.org/Underlag).
             *
             * This is an atomic type that is a restriction of org.example.underlag.AldersinverkanRootDocument$AldersinverkanRoot$Aldersinverkan$Procent.
             */
            public static class ProcentImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Aldersinverkan.Procent
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
         * An XML Vardear(@http://www.example.org/Underlag).
         *
         * This is a complex type.
         */
        public static class VardearImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Vardear
        {
            private static final long serialVersionUID = 1L;
            
            public VardearImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName UNDREGRANS$0 = 
                new javax.xml.namespace.QName("http://www.example.org/Underlag", "Undregrans");
            private static final javax.xml.namespace.QName OVREGRANS$2 = 
                new javax.xml.namespace.QName("http://www.example.org/Underlag", "Ovregrans");
            
            
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
            public org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Vardear.Undregrans xgetUndregrans()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Vardear.Undregrans target = null;
                    target = (org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Vardear.Undregrans)get_store().find_element_user(UNDREGRANS$0, 0);
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
            public void xsetUndregrans(org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Vardear.Undregrans undregrans)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Vardear.Undregrans target = null;
                    target = (org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Vardear.Undregrans)get_store().find_element_user(UNDREGRANS$0, 0);
                    if (target == null)
                    {
                      target = (org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Vardear.Undregrans)get_store().add_element_user(UNDREGRANS$0);
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
            public org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Vardear.Ovregrans xgetOvregrans()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Vardear.Ovregrans target = null;
                    target = (org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Vardear.Ovregrans)get_store().find_element_user(OVREGRANS$2, 0);
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
            public void xsetOvregrans(org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Vardear.Ovregrans ovregrans)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Vardear.Ovregrans target = null;
                    target = (org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Vardear.Ovregrans)get_store().find_element_user(OVREGRANS$2, 0);
                    if (target == null)
                    {
                      target = (org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Vardear.Ovregrans)get_store().add_element_user(OVREGRANS$2);
                    }
                    target.set(ovregrans);
                }
            }
            /**
             * An XML Undregrans(@http://www.example.org/Underlag).
             *
             * This is an atomic type that is a restriction of org.example.underlag.AldersinverkanRootDocument$AldersinverkanRoot$Vardear$Undregrans.
             */
            public static class UndregransImpl extends org.apache.xmlbeans.impl.values.JavaGDateHolderEx implements org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Vardear.Undregrans
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
             * An XML Ovregrans(@http://www.example.org/Underlag).
             *
             * This is an atomic type that is a restriction of org.example.underlag.AldersinverkanRootDocument$AldersinverkanRoot$Vardear$Ovregrans.
             */
            public static class OvregransImpl extends org.apache.xmlbeans.impl.values.JavaGDateHolderEx implements org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Vardear.Ovregrans
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
         * An XML Standardpoang(@http://www.example.org/Underlag).
         *
         * This is a complex type.
         */
        public static class StandardpoangImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Standardpoang
        {
            private static final long serialVersionUID = 1L;
            
            public StandardpoangImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName UNDREGRANS$0 = 
                new javax.xml.namespace.QName("http://www.example.org/Underlag", "Undregrans");
            private static final javax.xml.namespace.QName OVREGRANS$2 = 
                new javax.xml.namespace.QName("http://www.example.org/Underlag", "Ovregrans");
            
            
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
            public org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Standardpoang.Undregrans xgetUndregrans()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Standardpoang.Undregrans target = null;
                    target = (org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Standardpoang.Undregrans)get_store().find_element_user(UNDREGRANS$0, 0);
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
            public void xsetUndregrans(org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Standardpoang.Undregrans undregrans)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Standardpoang.Undregrans target = null;
                    target = (org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Standardpoang.Undregrans)get_store().find_element_user(UNDREGRANS$0, 0);
                    if (target == null)
                    {
                      target = (org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Standardpoang.Undregrans)get_store().add_element_user(UNDREGRANS$0);
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
            public org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Standardpoang.Ovregrans xgetOvregrans()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Standardpoang.Ovregrans target = null;
                    target = (org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Standardpoang.Ovregrans)get_store().find_element_user(OVREGRANS$2, 0);
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
            public void xsetOvregrans(org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Standardpoang.Ovregrans ovregrans)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Standardpoang.Ovregrans target = null;
                    target = (org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Standardpoang.Ovregrans)get_store().find_element_user(OVREGRANS$2, 0);
                    if (target == null)
                    {
                      target = (org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Standardpoang.Ovregrans)get_store().add_element_user(OVREGRANS$2);
                    }
                    target.set(ovregrans);
                }
            }
            /**
             * An XML Undregrans(@http://www.example.org/Underlag).
             *
             * This is an atomic type that is a restriction of org.example.underlag.AldersinverkanRootDocument$AldersinverkanRoot$Standardpoang$Undregrans.
             */
            public static class UndregransImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Standardpoang.Undregrans
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
             * An XML Ovregrans(@http://www.example.org/Underlag).
             *
             * This is an atomic type that is a restriction of org.example.underlag.AldersinverkanRootDocument$AldersinverkanRoot$Standardpoang$Ovregrans.
             */
            public static class OvregransImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Standardpoang.Ovregrans
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
         * An XML Reduktionsfaktor(@http://www.example.org/Underlag).
         *
         * This is a complex type.
         */
        public static class ReduktionsfaktorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Reduktionsfaktor
        {
            private static final long serialVersionUID = 1L;
            
            public ReduktionsfaktorImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName FAKTOR$0 = 
                new javax.xml.namespace.QName("http://www.example.org/Underlag", "Faktor");
            
            
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
            public org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Reduktionsfaktor.Faktor xgetFaktor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Reduktionsfaktor.Faktor target = null;
                    target = (org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Reduktionsfaktor.Faktor)get_store().find_element_user(FAKTOR$0, 0);
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
            public void xsetFaktor(org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Reduktionsfaktor.Faktor faktor)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Reduktionsfaktor.Faktor target = null;
                    target = (org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Reduktionsfaktor.Faktor)get_store().find_element_user(FAKTOR$0, 0);
                    if (target == null)
                    {
                      target = (org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Reduktionsfaktor.Faktor)get_store().add_element_user(FAKTOR$0);
                    }
                    target.set(faktor);
                }
            }
            /**
             * An XML Faktor(@http://www.example.org/Underlag).
             *
             * This is an atomic type that is a restriction of org.example.underlag.AldersinverkanRootDocument$AldersinverkanRoot$Reduktionsfaktor$Faktor.
             */
            public static class FaktorImpl extends org.apache.xmlbeans.impl.values.JavaDecimalHolderEx implements org.example.underlag.AldersinverkanRootDocument.AldersinverkanRoot.Reduktionsfaktor.Faktor
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
}
