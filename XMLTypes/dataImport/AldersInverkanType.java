/*
 * XML Type:  AldersInverkanType
 * Namespace: DataImport
 * Java type: dataImport.AldersInverkanType
 *
 * Automatically generated - do not modify.
 */
package dataImport;


/**
 * An XML AldersInverkanType(@DataImport).
 *
 * This is a complex type.
 */
public interface AldersInverkanType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AldersInverkanType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s500A60C439E4DF255255AAF1EE1F7E67").resolveHandle("aldersinverkantypedee5type");
    
    /**
     * Gets the "Fastighetstaxeringsar" element
     */
    java.util.Calendar getFastighetstaxeringsar();
    
    /**
     * Gets (as xml) the "Fastighetstaxeringsar" element
     */
    dataImport.FastighetsTaxeringsArType xgetFastighetstaxeringsar();
    
    /**
     * Sets the "Fastighetstaxeringsar" element
     */
    void setFastighetstaxeringsar(java.util.Calendar fastighetstaxeringsar);
    
    /**
     * Sets (as xml) the "Fastighetstaxeringsar" element
     */
    void xsetFastighetstaxeringsar(dataImport.FastighetsTaxeringsArType fastighetstaxeringsar);
    
    /**
     * Gets array of all "Aldersinverkan" elements
     */
    dataImport.AldersInverkanType.Aldersinverkan[] getAldersinverkanArray();
    
    /**
     * Gets ith "Aldersinverkan" element
     */
    dataImport.AldersInverkanType.Aldersinverkan getAldersinverkanArray(int i);
    
    /**
     * Returns number of "Aldersinverkan" element
     */
    int sizeOfAldersinverkanArray();
    
    /**
     * Sets array of all "Aldersinverkan" element
     */
    void setAldersinverkanArray(dataImport.AldersInverkanType.Aldersinverkan[] aldersinverkanArray);
    
    /**
     * Sets ith "Aldersinverkan" element
     */
    void setAldersinverkanArray(int i, dataImport.AldersInverkanType.Aldersinverkan aldersinverkan);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Aldersinverkan" element
     */
    dataImport.AldersInverkanType.Aldersinverkan insertNewAldersinverkan(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Aldersinverkan" element
     */
    dataImport.AldersInverkanType.Aldersinverkan addNewAldersinverkan();
    
    /**
     * Removes the ith "Aldersinverkan" element
     */
    void removeAldersinverkan(int i);
    
    /**
     * Gets array of all "Vardear" elements
     */
    dataImport.AldersInverkanType.Vardear[] getVardearArray();
    
    /**
     * Gets ith "Vardear" element
     */
    dataImport.AldersInverkanType.Vardear getVardearArray(int i);
    
    /**
     * Returns number of "Vardear" element
     */
    int sizeOfVardearArray();
    
    /**
     * Sets array of all "Vardear" element
     */
    void setVardearArray(dataImport.AldersInverkanType.Vardear[] vardearArray);
    
    /**
     * Sets ith "Vardear" element
     */
    void setVardearArray(int i, dataImport.AldersInverkanType.Vardear vardear);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Vardear" element
     */
    dataImport.AldersInverkanType.Vardear insertNewVardear(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Vardear" element
     */
    dataImport.AldersInverkanType.Vardear addNewVardear();
    
    /**
     * Removes the ith "Vardear" element
     */
    void removeVardear(int i);
    
    /**
     * Gets array of all "Standardpoang" elements
     */
    dataImport.AldersInverkanType.Standardpoang[] getStandardpoangArray();
    
    /**
     * Gets ith "Standardpoang" element
     */
    dataImport.AldersInverkanType.Standardpoang getStandardpoangArray(int i);
    
    /**
     * Returns number of "Standardpoang" element
     */
    int sizeOfStandardpoangArray();
    
    /**
     * Sets array of all "Standardpoang" element
     */
    void setStandardpoangArray(dataImport.AldersInverkanType.Standardpoang[] standardpoangArray);
    
    /**
     * Sets ith "Standardpoang" element
     */
    void setStandardpoangArray(int i, dataImport.AldersInverkanType.Standardpoang standardpoang);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Standardpoang" element
     */
    dataImport.AldersInverkanType.Standardpoang insertNewStandardpoang(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Standardpoang" element
     */
    dataImport.AldersInverkanType.Standardpoang addNewStandardpoang();
    
    /**
     * Removes the ith "Standardpoang" element
     */
    void removeStandardpoang(int i);
    
    /**
     * Gets the "Reduktionsfaktor" element
     */
    dataImport.AldersInverkanType.Reduktionsfaktor getReduktionsfaktor();
    
    /**
     * Sets the "Reduktionsfaktor" element
     */
    void setReduktionsfaktor(dataImport.AldersInverkanType.Reduktionsfaktor reduktionsfaktor);
    
    /**
     * Appends and returns a new empty "Reduktionsfaktor" element
     */
    dataImport.AldersInverkanType.Reduktionsfaktor addNewReduktionsfaktor();
    
    /**
     * An XML Aldersinverkan(@DataImport).
     *
     * This is a complex type.
     */
    public interface Aldersinverkan extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Aldersinverkan.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s500A60C439E4DF255255AAF1EE1F7E67").resolveHandle("aldersinverkan6a88elemtype");
        
        /**
         * Gets the "Procent" element
         */
        int getProcent();
        
        /**
         * Gets (as xml) the "Procent" element
         */
        dataImport.AldersInverkanType.Aldersinverkan.Procent xgetProcent();
        
        /**
         * Sets the "Procent" element
         */
        void setProcent(int procent);
        
        /**
         * Sets (as xml) the "Procent" element
         */
        void xsetProcent(dataImport.AldersInverkanType.Aldersinverkan.Procent procent);
        
        /**
         * An XML Procent(@DataImport).
         *
         * This is an atomic type that is a restriction of dataImport.AldersInverkanType$Aldersinverkan$Procent.
         */
        public interface Procent extends org.apache.xmlbeans.XmlInt
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Procent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s500A60C439E4DF255255AAF1EE1F7E67").resolveHandle("procentc287elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static dataImport.AldersInverkanType.Aldersinverkan.Procent newValue(java.lang.Object obj) {
                  return (dataImport.AldersInverkanType.Aldersinverkan.Procent) type.newValue( obj ); }
                
                public static dataImport.AldersInverkanType.Aldersinverkan.Procent newInstance() {
                  return (dataImport.AldersInverkanType.Aldersinverkan.Procent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static dataImport.AldersInverkanType.Aldersinverkan.Procent newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (dataImport.AldersInverkanType.Aldersinverkan.Procent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static dataImport.AldersInverkanType.Aldersinverkan newInstance() {
              return (dataImport.AldersInverkanType.Aldersinverkan) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static dataImport.AldersInverkanType.Aldersinverkan newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (dataImport.AldersInverkanType.Aldersinverkan) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML Vardear(@DataImport).
     *
     * This is a complex type.
     */
    public interface Vardear extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Vardear.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s500A60C439E4DF255255AAF1EE1F7E67").resolveHandle("vardear174aelemtype");
        
        /**
         * Gets the "Undregrans" element
         */
        java.util.Calendar getUndregrans();
        
        /**
         * Gets (as xml) the "Undregrans" element
         */
        dataImport.AldersInverkanType.Vardear.Undregrans xgetUndregrans();
        
        /**
         * Sets the "Undregrans" element
         */
        void setUndregrans(java.util.Calendar undregrans);
        
        /**
         * Sets (as xml) the "Undregrans" element
         */
        void xsetUndregrans(dataImport.AldersInverkanType.Vardear.Undregrans undregrans);
        
        /**
         * Gets the "Ovregrans" element
         */
        java.util.Calendar getOvregrans();
        
        /**
         * Gets (as xml) the "Ovregrans" element
         */
        dataImport.AldersInverkanType.Vardear.Ovregrans xgetOvregrans();
        
        /**
         * Sets the "Ovregrans" element
         */
        void setOvregrans(java.util.Calendar ovregrans);
        
        /**
         * Sets (as xml) the "Ovregrans" element
         */
        void xsetOvregrans(dataImport.AldersInverkanType.Vardear.Ovregrans ovregrans);
        
        /**
         * An XML Undregrans(@DataImport).
         *
         * This is an atomic type that is a restriction of dataImport.AldersInverkanType$Vardear$Undregrans.
         */
        public interface Undregrans extends org.apache.xmlbeans.XmlGYear
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Undregrans.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s500A60C439E4DF255255AAF1EE1F7E67").resolveHandle("undregransce43elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static dataImport.AldersInverkanType.Vardear.Undregrans newValue(java.lang.Object obj) {
                  return (dataImport.AldersInverkanType.Vardear.Undregrans) type.newValue( obj ); }
                
                public static dataImport.AldersInverkanType.Vardear.Undregrans newInstance() {
                  return (dataImport.AldersInverkanType.Vardear.Undregrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static dataImport.AldersInverkanType.Vardear.Undregrans newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (dataImport.AldersInverkanType.Vardear.Undregrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Ovregrans(@DataImport).
         *
         * This is an atomic type that is a restriction of dataImport.AldersInverkanType$Vardear$Ovregrans.
         */
        public interface Ovregrans extends org.apache.xmlbeans.XmlGYear
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ovregrans.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s500A60C439E4DF255255AAF1EE1F7E67").resolveHandle("ovregransd457elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static dataImport.AldersInverkanType.Vardear.Ovregrans newValue(java.lang.Object obj) {
                  return (dataImport.AldersInverkanType.Vardear.Ovregrans) type.newValue( obj ); }
                
                public static dataImport.AldersInverkanType.Vardear.Ovregrans newInstance() {
                  return (dataImport.AldersInverkanType.Vardear.Ovregrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static dataImport.AldersInverkanType.Vardear.Ovregrans newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (dataImport.AldersInverkanType.Vardear.Ovregrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static dataImport.AldersInverkanType.Vardear newInstance() {
              return (dataImport.AldersInverkanType.Vardear) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static dataImport.AldersInverkanType.Vardear newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (dataImport.AldersInverkanType.Vardear) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML Standardpoang(@DataImport).
     *
     * This is a complex type.
     */
    public interface Standardpoang extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Standardpoang.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s500A60C439E4DF255255AAF1EE1F7E67").resolveHandle("standardpoang5c0felemtype");
        
        /**
         * Gets the "Undregrans" element
         */
        int getUndregrans();
        
        /**
         * Gets (as xml) the "Undregrans" element
         */
        dataImport.AldersInverkanType.Standardpoang.Undregrans xgetUndregrans();
        
        /**
         * Sets the "Undregrans" element
         */
        void setUndregrans(int undregrans);
        
        /**
         * Sets (as xml) the "Undregrans" element
         */
        void xsetUndregrans(dataImport.AldersInverkanType.Standardpoang.Undregrans undregrans);
        
        /**
         * Gets the "Ovregrans" element
         */
        int getOvregrans();
        
        /**
         * Gets (as xml) the "Ovregrans" element
         */
        dataImport.AldersInverkanType.Standardpoang.Ovregrans xgetOvregrans();
        
        /**
         * Sets the "Ovregrans" element
         */
        void setOvregrans(int ovregrans);
        
        /**
         * Sets (as xml) the "Ovregrans" element
         */
        void xsetOvregrans(dataImport.AldersInverkanType.Standardpoang.Ovregrans ovregrans);
        
        /**
         * An XML Undregrans(@DataImport).
         *
         * This is an atomic type that is a restriction of dataImport.AldersInverkanType$Standardpoang$Undregrans.
         */
        public interface Undregrans extends org.apache.xmlbeans.XmlInt
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Undregrans.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s500A60C439E4DF255255AAF1EE1F7E67").resolveHandle("undregrans3448elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static dataImport.AldersInverkanType.Standardpoang.Undregrans newValue(java.lang.Object obj) {
                  return (dataImport.AldersInverkanType.Standardpoang.Undregrans) type.newValue( obj ); }
                
                public static dataImport.AldersInverkanType.Standardpoang.Undregrans newInstance() {
                  return (dataImport.AldersInverkanType.Standardpoang.Undregrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static dataImport.AldersInverkanType.Standardpoang.Undregrans newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (dataImport.AldersInverkanType.Standardpoang.Undregrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Ovregrans(@DataImport).
         *
         * This is an atomic type that is a restriction of dataImport.AldersInverkanType$Standardpoang$Ovregrans.
         */
        public interface Ovregrans extends org.apache.xmlbeans.XmlInt
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ovregrans.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s500A60C439E4DF255255AAF1EE1F7E67").resolveHandle("ovregrans5b5celemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static dataImport.AldersInverkanType.Standardpoang.Ovregrans newValue(java.lang.Object obj) {
                  return (dataImport.AldersInverkanType.Standardpoang.Ovregrans) type.newValue( obj ); }
                
                public static dataImport.AldersInverkanType.Standardpoang.Ovregrans newInstance() {
                  return (dataImport.AldersInverkanType.Standardpoang.Ovregrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static dataImport.AldersInverkanType.Standardpoang.Ovregrans newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (dataImport.AldersInverkanType.Standardpoang.Ovregrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static dataImport.AldersInverkanType.Standardpoang newInstance() {
              return (dataImport.AldersInverkanType.Standardpoang) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static dataImport.AldersInverkanType.Standardpoang newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (dataImport.AldersInverkanType.Standardpoang) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML Reduktionsfaktor(@DataImport).
     *
     * This is a complex type.
     */
    public interface Reduktionsfaktor extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Reduktionsfaktor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s500A60C439E4DF255255AAF1EE1F7E67").resolveHandle("reduktionsfaktor6b40elemtype");
        
        /**
         * Gets the "Faktor" element
         */
        java.math.BigDecimal getFaktor();
        
        /**
         * Gets (as xml) the "Faktor" element
         */
        dataImport.AldersInverkanType.Reduktionsfaktor.Faktor xgetFaktor();
        
        /**
         * Sets the "Faktor" element
         */
        void setFaktor(java.math.BigDecimal faktor);
        
        /**
         * Sets (as xml) the "Faktor" element
         */
        void xsetFaktor(dataImport.AldersInverkanType.Reduktionsfaktor.Faktor faktor);
        
        /**
         * An XML Faktor(@DataImport).
         *
         * This is an atomic type that is a restriction of dataImport.AldersInverkanType$Reduktionsfaktor$Faktor.
         */
        public interface Faktor extends org.apache.xmlbeans.XmlDecimal
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Faktor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s500A60C439E4DF255255AAF1EE1F7E67").resolveHandle("faktor1b5delemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static dataImport.AldersInverkanType.Reduktionsfaktor.Faktor newValue(java.lang.Object obj) {
                  return (dataImport.AldersInverkanType.Reduktionsfaktor.Faktor) type.newValue( obj ); }
                
                public static dataImport.AldersInverkanType.Reduktionsfaktor.Faktor newInstance() {
                  return (dataImport.AldersInverkanType.Reduktionsfaktor.Faktor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static dataImport.AldersInverkanType.Reduktionsfaktor.Faktor newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (dataImport.AldersInverkanType.Reduktionsfaktor.Faktor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static dataImport.AldersInverkanType.Reduktionsfaktor newInstance() {
              return (dataImport.AldersInverkanType.Reduktionsfaktor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static dataImport.AldersInverkanType.Reduktionsfaktor newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (dataImport.AldersInverkanType.Reduktionsfaktor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static dataImport.AldersInverkanType newInstance() {
          return (dataImport.AldersInverkanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static dataImport.AldersInverkanType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (dataImport.AldersInverkanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static dataImport.AldersInverkanType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (dataImport.AldersInverkanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static dataImport.AldersInverkanType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (dataImport.AldersInverkanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static dataImport.AldersInverkanType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.AldersInverkanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static dataImport.AldersInverkanType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.AldersInverkanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static dataImport.AldersInverkanType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.AldersInverkanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static dataImport.AldersInverkanType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.AldersInverkanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static dataImport.AldersInverkanType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.AldersInverkanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static dataImport.AldersInverkanType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.AldersInverkanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static dataImport.AldersInverkanType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.AldersInverkanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static dataImport.AldersInverkanType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.AldersInverkanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static dataImport.AldersInverkanType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (dataImport.AldersInverkanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static dataImport.AldersInverkanType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (dataImport.AldersInverkanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static dataImport.AldersInverkanType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (dataImport.AldersInverkanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static dataImport.AldersInverkanType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (dataImport.AldersInverkanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static dataImport.AldersInverkanType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (dataImport.AldersInverkanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static dataImport.AldersInverkanType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (dataImport.AldersInverkanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
