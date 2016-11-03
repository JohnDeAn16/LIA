/*
 * An XML document type.
 * Localname: ForberedelseUnderlag
 * Namespace: http://www.example.org/metaSchema
 * Java type: org.example.metaSchema.ForberedelseUnderlagDocument
 *
 * Automatically generated - do not modify.
 */
package org.example.metaSchema.impl;
/**
 * A document containing one ForberedelseUnderlag(@http://www.example.org/metaSchema) element.
 *
 * This is a complex type.
 */
public class ForberedelseUnderlagDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.example.metaSchema.ForberedelseUnderlagDocument
{
    private static final long serialVersionUID = 1L;
    
    public ForberedelseUnderlagDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORBEREDELSEUNDERLAG$0 = 
        new javax.xml.namespace.QName("http://www.example.org/metaSchema", "ForberedelseUnderlag");
    
    
    /**
     * Gets the "ForberedelseUnderlag" element
     */
    public org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag getForberedelseUnderlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag target = null;
            target = (org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag)get_store().find_element_user(FORBEREDELSEUNDERLAG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ForberedelseUnderlag" element
     */
    public void setForberedelseUnderlag(org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag forberedelseUnderlag)
    {
        generatedSetterHelperImpl(forberedelseUnderlag, FORBEREDELSEUNDERLAG$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ForberedelseUnderlag" element
     */
    public org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag addNewForberedelseUnderlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag target = null;
            target = (org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag)get_store().add_element_user(FORBEREDELSEUNDERLAG$0);
            return target;
        }
    }
    /**
     * An XML ForberedelseUnderlag(@http://www.example.org/metaSchema).
     *
     * This is a complex type.
     */
    public static class ForberedelseUnderlagImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag
    {
        private static final long serialVersionUID = 1L;
        
        public ForberedelseUnderlagImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ANKOMSTDATUM$0 = 
            new javax.xml.namespace.QName("http://www.example.org/metaSchema", "AnkomstDatum");
        private static final javax.xml.namespace.QName TIDSSTAMPEL$2 = 
            new javax.xml.namespace.QName("http://www.example.org/metaSchema", "TidsStampel");
        private static final javax.xml.namespace.QName TOTALLADDNING$4 = 
            new javax.xml.namespace.QName("http://www.example.org/metaSchema", "TotalLaddning");
        private static final javax.xml.namespace.QName FILER$6 = 
            new javax.xml.namespace.QName("http://www.example.org/metaSchema", "Filer");
        
        
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
         * Gets the "Filer" element
         */
        public org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer getFiler()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer target = null;
                target = (org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer)get_store().find_element_user(FILER$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Filer" element
         */
        public void setFiler(org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer filer)
        {
            generatedSetterHelperImpl(filer, FILER$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Filer" element
         */
        public org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer addNewFiler()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer target = null;
                target = (org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer)get_store().add_element_user(FILER$6);
                return target;
            }
        }
        /**
         * An XML Filer(@http://www.example.org/metaSchema).
         *
         * This is a complex type.
         */
        public static class FilerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer
        {
            private static final long serialVersionUID = 1L;
            
            public FilerImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName FIL$0 = 
                new javax.xml.namespace.QName("http://www.example.org/metaSchema", "Fil");
            
            
            /**
             * Gets array of all "Fil" elements
             */
            public org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer.Fil[] getFilArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(FIL$0, targetList);
                    org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer.Fil[] result = new org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer.Fil[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Fil" element
             */
            public org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer.Fil getFilArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer.Fil target = null;
                    target = (org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer.Fil)get_store().find_element_user(FIL$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Fil" element
             */
            public int sizeOfFilArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(FIL$0);
                }
            }
            
            /**
             * Sets array of all "Fil" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setFilArray(org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer.Fil[] filArray)
            {
                check_orphaned();
                arraySetterHelper(filArray, FIL$0);
            }
            
            /**
             * Sets ith "Fil" element
             */
            public void setFilArray(int i, org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer.Fil fil)
            {
                generatedSetterHelperImpl(fil, FIL$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Fil" element
             */
            public org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer.Fil insertNewFil(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer.Fil target = null;
                    target = (org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer.Fil)get_store().insert_element_user(FIL$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Fil" element
             */
            public org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer.Fil addNewFil()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer.Fil target = null;
                    target = (org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer.Fil)get_store().add_element_user(FIL$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Fil" element
             */
            public void removeFil(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(FIL$0, i);
                }
            }
            /**
             * An XML Fil(@http://www.example.org/metaSchema).
             *
             * This is an atomic type that is a restriction of org.example.metaSchema.ForberedelseUnderlagDocument$ForberedelseUnderlag$Filer$Fil.
             */
            public static class FilImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer.Fil
            {
                private static final long serialVersionUID = 1L;
                
                public FilImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, true);
                }
                
                protected FilImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
                
                private static final javax.xml.namespace.QName AMNE$0 = 
                    new javax.xml.namespace.QName("", "amne");
                
                
                /**
                 * Gets the "amne" attribute
                 */
                public java.lang.String getAmne()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AMNE$0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "amne" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetAmne()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AMNE$0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "amne" attribute
                 */
                public void setAmne(java.lang.String amne)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AMNE$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AMNE$0);
                      }
                      target.setStringValue(amne);
                    }
                }
                
                /**
                 * Sets (as xml) the "amne" attribute
                 */
                public void xsetAmne(org.apache.xmlbeans.XmlString amne)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AMNE$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AMNE$0);
                      }
                      target.set(amne);
                    }
                }
            }
        }
    }
}
