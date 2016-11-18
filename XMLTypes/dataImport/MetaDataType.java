/*
 * XML Type:  metaDataType
 * Namespace: DataImport
 * Java type: dataImport.MetaDataType
 *
 * Automatically generated - do not modify.
 */
package dataImport;


/**
 * An XML metaDataType(@DataImport).
 *
 * This is a complex type.
 */
public interface MetaDataType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MetaDataType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s500A60C439E4DF255255AAF1EE1F7E67").resolveHandle("metadatatype2cfdtype");
    
    /**
     * Gets the "AnkomstDatum" element
     */
    java.util.Calendar getAnkomstDatum();
    
    /**
     * Gets (as xml) the "AnkomstDatum" element
     */
    org.apache.xmlbeans.XmlDate xgetAnkomstDatum();
    
    /**
     * Sets the "AnkomstDatum" element
     */
    void setAnkomstDatum(java.util.Calendar ankomstDatum);
    
    /**
     * Sets (as xml) the "AnkomstDatum" element
     */
    void xsetAnkomstDatum(org.apache.xmlbeans.XmlDate ankomstDatum);
    
    /**
     * Gets the "TidsStampel" element
     */
    java.util.Calendar getTidsStampel();
    
    /**
     * Gets (as xml) the "TidsStampel" element
     */
    org.apache.xmlbeans.XmlTime xgetTidsStampel();
    
    /**
     * Sets the "TidsStampel" element
     */
    void setTidsStampel(java.util.Calendar tidsStampel);
    
    /**
     * Sets (as xml) the "TidsStampel" element
     */
    void xsetTidsStampel(org.apache.xmlbeans.XmlTime tidsStampel);
    
    /**
     * Gets the "TotalLaddning" element
     */
    boolean getTotalLaddning();
    
    /**
     * Gets (as xml) the "TotalLaddning" element
     */
    org.apache.xmlbeans.XmlBoolean xgetTotalLaddning();
    
    /**
     * Sets the "TotalLaddning" element
     */
    void setTotalLaddning(boolean totalLaddning);
    
    /**
     * Sets (as xml) the "TotalLaddning" element
     */
    void xsetTotalLaddning(org.apache.xmlbeans.XmlBoolean totalLaddning);
    
    /**
     * Gets the "FilTyp" element
     */
    dataImport.MetaDataType.FilTyp.Enum getFilTyp();
    
    /**
     * Gets (as xml) the "FilTyp" element
     */
    dataImport.MetaDataType.FilTyp xgetFilTyp();
    
    /**
     * Sets the "FilTyp" element
     */
    void setFilTyp(dataImport.MetaDataType.FilTyp.Enum filTyp);
    
    /**
     * Sets (as xml) the "FilTyp" element
     */
    void xsetFilTyp(dataImport.MetaDataType.FilTyp filTyp);
    
    /**
     * An XML FilTyp(@DataImport).
     *
     * This is an atomic type that is a restriction of dataImport.MetaDataType$FilTyp.
     */
    public interface FilTyp extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FilTyp.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s500A60C439E4DF255255AAF1EE1F7E67").resolveHandle("filtype3fbelemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum GRUNDOCHMARGINAL = Enum.forString("GRUNDOCHMARGINAL");
        static final Enum ALDERSINVERKAN = Enum.forString("ALDERSINVERKAN");
        
        static final int INT_GRUNDOCHMARGINAL = Enum.INT_GRUNDOCHMARGINAL;
        static final int INT_ALDERSINVERKAN = Enum.INT_ALDERSINVERKAN;
        
        /**
         * Enumeration value class for dataImport.MetaDataType$FilTyp.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_GRUNDOCHMARGINAL
         * Enum.forString(s); // returns the enum value for a string
         * Enum.forInt(i); // returns the enum value for an int
         * </pre>
         * Enumeration objects are immutable singleton objects that
         * can be compared using == object equality. They have no
         * public constructor. See the constants defined within this
         * class for all the valid values.
         */
        static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
        {
            /**
             * Returns the enum value for a string, or null if none.
             */
            public static Enum forString(java.lang.String s)
                { return (Enum)table.forString(s); }
            /**
             * Returns the enum value corresponding to an int, or null if none.
             */
            public static Enum forInt(int i)
                { return (Enum)table.forInt(i); }
            
            private Enum(java.lang.String s, int i)
                { super(s, i); }
            
            static final int INT_GRUNDOCHMARGINAL = 1;
            static final int INT_ALDERSINVERKAN = 2;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("GRUNDOCHMARGINAL", INT_GRUNDOCHMARGINAL),
                    new Enum("ALDERSINVERKAN", INT_ALDERSINVERKAN),
                }
            );
            private static final long serialVersionUID = 1L;
            private java.lang.Object readResolve() { return forInt(intValue()); } 
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static dataImport.MetaDataType.FilTyp newValue(java.lang.Object obj) {
              return (dataImport.MetaDataType.FilTyp) type.newValue( obj ); }
            
            public static dataImport.MetaDataType.FilTyp newInstance() {
              return (dataImport.MetaDataType.FilTyp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static dataImport.MetaDataType.FilTyp newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (dataImport.MetaDataType.FilTyp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static dataImport.MetaDataType newInstance() {
          return (dataImport.MetaDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static dataImport.MetaDataType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (dataImport.MetaDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static dataImport.MetaDataType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (dataImport.MetaDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static dataImport.MetaDataType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (dataImport.MetaDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static dataImport.MetaDataType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.MetaDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static dataImport.MetaDataType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.MetaDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static dataImport.MetaDataType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.MetaDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static dataImport.MetaDataType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.MetaDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static dataImport.MetaDataType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.MetaDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static dataImport.MetaDataType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.MetaDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static dataImport.MetaDataType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.MetaDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static dataImport.MetaDataType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.MetaDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static dataImport.MetaDataType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (dataImport.MetaDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static dataImport.MetaDataType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (dataImport.MetaDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static dataImport.MetaDataType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (dataImport.MetaDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static dataImport.MetaDataType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (dataImport.MetaDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static dataImport.MetaDataType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (dataImport.MetaDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static dataImport.MetaDataType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (dataImport.MetaDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
