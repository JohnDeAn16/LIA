/*
 * XML Type:  GrundOchMarginalType
 * Namespace: DataImport
 * Java type: dataImport.GrundOchMarginalType
 *
 * Automatically generated - do not modify.
 */
package dataImport;


/**
 * An XML GrundOchMarginalType(@DataImport).
 *
 * This is a complex type.
 */
public interface GrundOchMarginalType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GrundOchMarginalType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s500A60C439E4DF255255AAF1EE1F7E67").resolveHandle("grundochmarginaltype0e1ftype");
    
    /**
     * Gets the "fastighetsTaxeringsAr" element
     */
    java.util.Calendar getFastighetsTaxeringsAr();
    
    /**
     * Gets (as xml) the "fastighetsTaxeringsAr" element
     */
    dataImport.FastighetsTaxeringsArType xgetFastighetsTaxeringsAr();
    
    /**
     * Sets the "fastighetsTaxeringsAr" element
     */
    void setFastighetsTaxeringsAr(java.util.Calendar fastighetsTaxeringsAr);
    
    /**
     * Sets (as xml) the "fastighetsTaxeringsAr" element
     */
    void xsetFastighetsTaxeringsAr(dataImport.FastighetsTaxeringsArType fastighetsTaxeringsAr);
    
    /**
     * Gets array of all "nivaFaktor" elements
     */
    dataImport.GrundOchMarginalType.NivaFaktor[] getNivaFaktorArray();
    
    /**
     * Gets ith "nivaFaktor" element
     */
    dataImport.GrundOchMarginalType.NivaFaktor getNivaFaktorArray(int i);
    
    /**
     * Returns number of "nivaFaktor" element
     */
    int sizeOfNivaFaktorArray();
    
    /**
     * Sets array of all "nivaFaktor" element
     */
    void setNivaFaktorArray(dataImport.GrundOchMarginalType.NivaFaktor[] nivaFaktorArray);
    
    /**
     * Sets ith "nivaFaktor" element
     */
    void setNivaFaktorArray(int i, dataImport.GrundOchMarginalType.NivaFaktor nivaFaktor);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "nivaFaktor" element
     */
    dataImport.GrundOchMarginalType.NivaFaktor insertNewNivaFaktor(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "nivaFaktor" element
     */
    dataImport.GrundOchMarginalType.NivaFaktor addNewNivaFaktor();
    
    /**
     * Removes the ith "nivaFaktor" element
     */
    void removeNivaFaktor(int i);
    
    /**
     * Gets array of all "standardPoang" elements
     */
    dataImport.GrundOchMarginalType.StandardPoang[] getStandardPoangArray();
    
    /**
     * Gets ith "standardPoang" element
     */
    dataImport.GrundOchMarginalType.StandardPoang getStandardPoangArray(int i);
    
    /**
     * Returns number of "standardPoang" element
     */
    int sizeOfStandardPoangArray();
    
    /**
     * Sets array of all "standardPoang" element
     */
    void setStandardPoangArray(dataImport.GrundOchMarginalType.StandardPoang[] standardPoangArray);
    
    /**
     * Sets ith "standardPoang" element
     */
    void setStandardPoangArray(int i, dataImport.GrundOchMarginalType.StandardPoang standardPoang);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "standardPoang" element
     */
    dataImport.GrundOchMarginalType.StandardPoang insertNewStandardPoang(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "standardPoang" element
     */
    dataImport.GrundOchMarginalType.StandardPoang addNewStandardPoang();
    
    /**
     * Removes the ith "standardPoang" element
     */
    void removeStandardPoang(int i);
    
    /**
     * Gets array of all "vardeYta" elements
     */
    dataImport.GrundOchMarginalType.VardeYta[] getVardeYtaArray();
    
    /**
     * Gets ith "vardeYta" element
     */
    dataImport.GrundOchMarginalType.VardeYta getVardeYtaArray(int i);
    
    /**
     * Returns number of "vardeYta" element
     */
    int sizeOfVardeYtaArray();
    
    /**
     * Sets array of all "vardeYta" element
     */
    void setVardeYtaArray(dataImport.GrundOchMarginalType.VardeYta[] vardeYtaArray);
    
    /**
     * Sets ith "vardeYta" element
     */
    void setVardeYtaArray(int i, dataImport.GrundOchMarginalType.VardeYta vardeYta);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "vardeYta" element
     */
    dataImport.GrundOchMarginalType.VardeYta insertNewVardeYta(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "vardeYta" element
     */
    dataImport.GrundOchMarginalType.VardeYta addNewVardeYta();
    
    /**
     * Removes the ith "vardeYta" element
     */
    void removeVardeYta(int i);
    
    /**
     * Gets the "varde" element
     */
    dataImport.GrundOchMarginalType.Varde getVarde();
    
    /**
     * Sets the "varde" element
     */
    void setVarde(dataImport.GrundOchMarginalType.Varde varde);
    
    /**
     * Appends and returns a new empty "varde" element
     */
    dataImport.GrundOchMarginalType.Varde addNewVarde();
    
    /**
     * An XML nivaFaktor(@DataImport).
     *
     * This is a complex type.
     */
    public interface NivaFaktor extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NivaFaktor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s500A60C439E4DF255255AAF1EE1F7E67").resolveHandle("nivafaktorbc08elemtype");
        
        /**
         * Gets the "undreGrans" element
         */
        java.math.BigDecimal getUndreGrans();
        
        /**
         * Gets (as xml) the "undreGrans" element
         */
        dataImport.GrundOchMarginalType.NivaFaktor.UndreGrans xgetUndreGrans();
        
        /**
         * Sets the "undreGrans" element
         */
        void setUndreGrans(java.math.BigDecimal undreGrans);
        
        /**
         * Sets (as xml) the "undreGrans" element
         */
        void xsetUndreGrans(dataImport.GrundOchMarginalType.NivaFaktor.UndreGrans undreGrans);
        
        /**
         * Gets the "ovreGrans" element
         */
        java.math.BigDecimal getOvreGrans();
        
        /**
         * Gets (as xml) the "ovreGrans" element
         */
        dataImport.GrundOchMarginalType.NivaFaktor.OvreGrans xgetOvreGrans();
        
        /**
         * Sets the "ovreGrans" element
         */
        void setOvreGrans(java.math.BigDecimal ovreGrans);
        
        /**
         * Sets (as xml) the "ovreGrans" element
         */
        void xsetOvreGrans(dataImport.GrundOchMarginalType.NivaFaktor.OvreGrans ovreGrans);
        
        /**
         * An XML undreGrans(@DataImport).
         *
         * This is an atomic type that is a restriction of dataImport.GrundOchMarginalType$NivaFaktor$UndreGrans.
         */
        public interface UndreGrans extends org.apache.xmlbeans.XmlDecimal
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UndreGrans.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s500A60C439E4DF255255AAF1EE1F7E67").resolveHandle("undregrans4cefelemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static dataImport.GrundOchMarginalType.NivaFaktor.UndreGrans newValue(java.lang.Object obj) {
                  return (dataImport.GrundOchMarginalType.NivaFaktor.UndreGrans) type.newValue( obj ); }
                
                public static dataImport.GrundOchMarginalType.NivaFaktor.UndreGrans newInstance() {
                  return (dataImport.GrundOchMarginalType.NivaFaktor.UndreGrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static dataImport.GrundOchMarginalType.NivaFaktor.UndreGrans newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (dataImport.GrundOchMarginalType.NivaFaktor.UndreGrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ovreGrans(@DataImport).
         *
         * This is an atomic type that is a restriction of dataImport.GrundOchMarginalType$NivaFaktor$OvreGrans.
         */
        public interface OvreGrans extends org.apache.xmlbeans.XmlDecimal
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OvreGrans.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s500A60C439E4DF255255AAF1EE1F7E67").resolveHandle("ovregrans2f1belemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static dataImport.GrundOchMarginalType.NivaFaktor.OvreGrans newValue(java.lang.Object obj) {
                  return (dataImport.GrundOchMarginalType.NivaFaktor.OvreGrans) type.newValue( obj ); }
                
                public static dataImport.GrundOchMarginalType.NivaFaktor.OvreGrans newInstance() {
                  return (dataImport.GrundOchMarginalType.NivaFaktor.OvreGrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static dataImport.GrundOchMarginalType.NivaFaktor.OvreGrans newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (dataImport.GrundOchMarginalType.NivaFaktor.OvreGrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static dataImport.GrundOchMarginalType.NivaFaktor newInstance() {
              return (dataImport.GrundOchMarginalType.NivaFaktor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static dataImport.GrundOchMarginalType.NivaFaktor newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (dataImport.GrundOchMarginalType.NivaFaktor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML standardPoang(@DataImport).
     *
     * This is a complex type.
     */
    public interface StandardPoang extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StandardPoang.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s500A60C439E4DF255255AAF1EE1F7E67").resolveHandle("standardpoangc8c9elemtype");
        
        /**
         * Gets the "undreGrans" element
         */
        int getUndreGrans();
        
        /**
         * Gets (as xml) the "undreGrans" element
         */
        dataImport.GrundOchMarginalType.StandardPoang.UndreGrans xgetUndreGrans();
        
        /**
         * Sets the "undreGrans" element
         */
        void setUndreGrans(int undreGrans);
        
        /**
         * Sets (as xml) the "undreGrans" element
         */
        void xsetUndreGrans(dataImport.GrundOchMarginalType.StandardPoang.UndreGrans undreGrans);
        
        /**
         * Gets the "ovreGrans" element
         */
        int getOvreGrans();
        
        /**
         * Gets (as xml) the "ovreGrans" element
         */
        dataImport.GrundOchMarginalType.StandardPoang.OvreGrans xgetOvreGrans();
        
        /**
         * Sets the "ovreGrans" element
         */
        void setOvreGrans(int ovreGrans);
        
        /**
         * Sets (as xml) the "ovreGrans" element
         */
        void xsetOvreGrans(dataImport.GrundOchMarginalType.StandardPoang.OvreGrans ovreGrans);
        
        /**
         * An XML undreGrans(@DataImport).
         *
         * This is an atomic type that is a restriction of dataImport.GrundOchMarginalType$StandardPoang$UndreGrans.
         */
        public interface UndreGrans extends org.apache.xmlbeans.XmlInt
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UndreGrans.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s500A60C439E4DF255255AAF1EE1F7E67").resolveHandle("undregrans3a82elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static dataImport.GrundOchMarginalType.StandardPoang.UndreGrans newValue(java.lang.Object obj) {
                  return (dataImport.GrundOchMarginalType.StandardPoang.UndreGrans) type.newValue( obj ); }
                
                public static dataImport.GrundOchMarginalType.StandardPoang.UndreGrans newInstance() {
                  return (dataImport.GrundOchMarginalType.StandardPoang.UndreGrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static dataImport.GrundOchMarginalType.StandardPoang.UndreGrans newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (dataImport.GrundOchMarginalType.StandardPoang.UndreGrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ovreGrans(@DataImport).
         *
         * This is an atomic type that is a restriction of dataImport.GrundOchMarginalType$StandardPoang$OvreGrans.
         */
        public interface OvreGrans extends org.apache.xmlbeans.XmlInt
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OvreGrans.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s500A60C439E4DF255255AAF1EE1F7E67").resolveHandle("ovregrans18d6elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static dataImport.GrundOchMarginalType.StandardPoang.OvreGrans newValue(java.lang.Object obj) {
                  return (dataImport.GrundOchMarginalType.StandardPoang.OvreGrans) type.newValue( obj ); }
                
                public static dataImport.GrundOchMarginalType.StandardPoang.OvreGrans newInstance() {
                  return (dataImport.GrundOchMarginalType.StandardPoang.OvreGrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static dataImport.GrundOchMarginalType.StandardPoang.OvreGrans newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (dataImport.GrundOchMarginalType.StandardPoang.OvreGrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static dataImport.GrundOchMarginalType.StandardPoang newInstance() {
              return (dataImport.GrundOchMarginalType.StandardPoang) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static dataImport.GrundOchMarginalType.StandardPoang newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (dataImport.GrundOchMarginalType.StandardPoang) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML vardeYta(@DataImport).
     *
     * This is a complex type.
     */
    public interface VardeYta extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VardeYta.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s500A60C439E4DF255255AAF1EE1F7E67").resolveHandle("vardeytafdd9elemtype");
        
        /**
         * Gets the "undreGrans" element
         */
        int getUndreGrans();
        
        /**
         * Gets (as xml) the "undreGrans" element
         */
        dataImport.GrundOchMarginalType.VardeYta.UndreGrans xgetUndreGrans();
        
        /**
         * Sets the "undreGrans" element
         */
        void setUndreGrans(int undreGrans);
        
        /**
         * Sets (as xml) the "undreGrans" element
         */
        void xsetUndreGrans(dataImport.GrundOchMarginalType.VardeYta.UndreGrans undreGrans);
        
        /**
         * Gets the "ovreGrans" element
         */
        int getOvreGrans();
        
        /**
         * Gets (as xml) the "ovreGrans" element
         */
        dataImport.GrundOchMarginalType.VardeYta.OvreGrans xgetOvreGrans();
        
        /**
         * Sets the "ovreGrans" element
         */
        void setOvreGrans(int ovreGrans);
        
        /**
         * Sets (as xml) the "ovreGrans" element
         */
        void xsetOvreGrans(dataImport.GrundOchMarginalType.VardeYta.OvreGrans ovreGrans);
        
        /**
         * An XML undreGrans(@DataImport).
         *
         * This is an atomic type that is a restriction of dataImport.GrundOchMarginalType$VardeYta$UndreGrans.
         */
        public interface UndreGrans extends org.apache.xmlbeans.XmlInt
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UndreGrans.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s500A60C439E4DF255255AAF1EE1F7E67").resolveHandle("undregrans9c80elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static dataImport.GrundOchMarginalType.VardeYta.UndreGrans newValue(java.lang.Object obj) {
                  return (dataImport.GrundOchMarginalType.VardeYta.UndreGrans) type.newValue( obj ); }
                
                public static dataImport.GrundOchMarginalType.VardeYta.UndreGrans newInstance() {
                  return (dataImport.GrundOchMarginalType.VardeYta.UndreGrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static dataImport.GrundOchMarginalType.VardeYta.UndreGrans newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (dataImport.GrundOchMarginalType.VardeYta.UndreGrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ovreGrans(@DataImport).
         *
         * This is an atomic type that is a restriction of dataImport.GrundOchMarginalType$VardeYta$OvreGrans.
         */
        public interface OvreGrans extends org.apache.xmlbeans.XmlInt
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OvreGrans.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s500A60C439E4DF255255AAF1EE1F7E67").resolveHandle("ovregrans19acelemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static dataImport.GrundOchMarginalType.VardeYta.OvreGrans newValue(java.lang.Object obj) {
                  return (dataImport.GrundOchMarginalType.VardeYta.OvreGrans) type.newValue( obj ); }
                
                public static dataImport.GrundOchMarginalType.VardeYta.OvreGrans newInstance() {
                  return (dataImport.GrundOchMarginalType.VardeYta.OvreGrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static dataImport.GrundOchMarginalType.VardeYta.OvreGrans newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (dataImport.GrundOchMarginalType.VardeYta.OvreGrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static dataImport.GrundOchMarginalType.VardeYta newInstance() {
              return (dataImport.GrundOchMarginalType.VardeYta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static dataImport.GrundOchMarginalType.VardeYta newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (dataImport.GrundOchMarginalType.VardeYta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML varde(@DataImport).
     *
     * This is a complex type.
     */
    public interface Varde extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Varde.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s500A60C439E4DF255255AAF1EE1F7E67").resolveHandle("varde3573elemtype");
        
        /**
         * Gets the "grundVarde" element
         */
        int getGrundVarde();
        
        /**
         * Gets (as xml) the "grundVarde" element
         */
        dataImport.GrundOchMarginalType.Varde.GrundVarde xgetGrundVarde();
        
        /**
         * Sets the "grundVarde" element
         */
        void setGrundVarde(int grundVarde);
        
        /**
         * Sets (as xml) the "grundVarde" element
         */
        void xsetGrundVarde(dataImport.GrundOchMarginalType.Varde.GrundVarde grundVarde);
        
        /**
         * Gets the "marginalVarde" element
         */
        int getMarginalVarde();
        
        /**
         * Gets (as xml) the "marginalVarde" element
         */
        dataImport.GrundOchMarginalType.Varde.MarginalVarde xgetMarginalVarde();
        
        /**
         * Sets the "marginalVarde" element
         */
        void setMarginalVarde(int marginalVarde);
        
        /**
         * Sets (as xml) the "marginalVarde" element
         */
        void xsetMarginalVarde(dataImport.GrundOchMarginalType.Varde.MarginalVarde marginalVarde);
        
        /**
         * An XML grundVarde(@DataImport).
         *
         * This is an atomic type that is a restriction of dataImport.GrundOchMarginalType$Varde$GrundVarde.
         */
        public interface GrundVarde extends org.apache.xmlbeans.XmlInt
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GrundVarde.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s500A60C439E4DF255255AAF1EE1F7E67").resolveHandle("grundvarde08b7elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static dataImport.GrundOchMarginalType.Varde.GrundVarde newValue(java.lang.Object obj) {
                  return (dataImport.GrundOchMarginalType.Varde.GrundVarde) type.newValue( obj ); }
                
                public static dataImport.GrundOchMarginalType.Varde.GrundVarde newInstance() {
                  return (dataImport.GrundOchMarginalType.Varde.GrundVarde) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static dataImport.GrundOchMarginalType.Varde.GrundVarde newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (dataImport.GrundOchMarginalType.Varde.GrundVarde) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML marginalVarde(@DataImport).
         *
         * This is an atomic type that is a restriction of dataImport.GrundOchMarginalType$Varde$MarginalVarde.
         */
        public interface MarginalVarde extends org.apache.xmlbeans.XmlInt
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MarginalVarde.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s500A60C439E4DF255255AAF1EE1F7E67").resolveHandle("marginalvardec12eelemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static dataImport.GrundOchMarginalType.Varde.MarginalVarde newValue(java.lang.Object obj) {
                  return (dataImport.GrundOchMarginalType.Varde.MarginalVarde) type.newValue( obj ); }
                
                public static dataImport.GrundOchMarginalType.Varde.MarginalVarde newInstance() {
                  return (dataImport.GrundOchMarginalType.Varde.MarginalVarde) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static dataImport.GrundOchMarginalType.Varde.MarginalVarde newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (dataImport.GrundOchMarginalType.Varde.MarginalVarde) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static dataImport.GrundOchMarginalType.Varde newInstance() {
              return (dataImport.GrundOchMarginalType.Varde) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static dataImport.GrundOchMarginalType.Varde newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (dataImport.GrundOchMarginalType.Varde) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static dataImport.GrundOchMarginalType newInstance() {
          return (dataImport.GrundOchMarginalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static dataImport.GrundOchMarginalType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (dataImport.GrundOchMarginalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static dataImport.GrundOchMarginalType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (dataImport.GrundOchMarginalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static dataImport.GrundOchMarginalType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (dataImport.GrundOchMarginalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static dataImport.GrundOchMarginalType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.GrundOchMarginalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static dataImport.GrundOchMarginalType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.GrundOchMarginalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static dataImport.GrundOchMarginalType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.GrundOchMarginalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static dataImport.GrundOchMarginalType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.GrundOchMarginalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static dataImport.GrundOchMarginalType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.GrundOchMarginalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static dataImport.GrundOchMarginalType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.GrundOchMarginalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static dataImport.GrundOchMarginalType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.GrundOchMarginalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static dataImport.GrundOchMarginalType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.GrundOchMarginalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static dataImport.GrundOchMarginalType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (dataImport.GrundOchMarginalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static dataImport.GrundOchMarginalType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (dataImport.GrundOchMarginalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static dataImport.GrundOchMarginalType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (dataImport.GrundOchMarginalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static dataImport.GrundOchMarginalType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (dataImport.GrundOchMarginalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static dataImport.GrundOchMarginalType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (dataImport.GrundOchMarginalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static dataImport.GrundOchMarginalType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (dataImport.GrundOchMarginalType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
