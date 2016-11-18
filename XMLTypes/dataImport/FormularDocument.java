/*
 * An XML document type.
 * Localname: Formular
 * Namespace: DataImport
 * Java type: dataImport.FormularDocument
 *
 * Automatically generated - do not modify.
 */
package dataImport;


/**
 * A document containing one Formular(@DataImport) element.
 *
 * This is a complex type.
 */
public interface FormularDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FormularDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s500A60C439E4DF255255AAF1EE1F7E67").resolveHandle("formular13cadoctype");
    
    /**
     * Gets the "Formular" element
     */
    dataImport.FormularDocument.Formular getFormular();
    
    /**
     * Sets the "Formular" element
     */
    void setFormular(dataImport.FormularDocument.Formular formular);
    
    /**
     * Appends and returns a new empty "Formular" element
     */
    dataImport.FormularDocument.Formular addNewFormular();
    
    /**
     * An XML Formular(@DataImport).
     *
     * This is a complex type.
     */
    public interface Formular extends dataImport.MetaDataType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Formular.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s500A60C439E4DF255255AAF1EE1F7E67").resolveHandle("formularae52elemtype");
        
        /**
         * Gets the "GrundOchMarginal" element
         */
        dataImport.GrundOchMarginalType getGrundOchMarginal();
        
        /**
         * True if has "GrundOchMarginal" element
         */
        boolean isSetGrundOchMarginal();
        
        /**
         * Sets the "GrundOchMarginal" element
         */
        void setGrundOchMarginal(dataImport.GrundOchMarginalType grundOchMarginal);
        
        /**
         * Appends and returns a new empty "GrundOchMarginal" element
         */
        dataImport.GrundOchMarginalType addNewGrundOchMarginal();
        
        /**
         * Unsets the "GrundOchMarginal" element
         */
        void unsetGrundOchMarginal();
        
        /**
         * Gets the "AldersInverkan" element
         */
        dataImport.AldersInverkanType getAldersInverkan();
        
        /**
         * True if has "AldersInverkan" element
         */
        boolean isSetAldersInverkan();
        
        /**
         * Sets the "AldersInverkan" element
         */
        void setAldersInverkan(dataImport.AldersInverkanType aldersInverkan);
        
        /**
         * Appends and returns a new empty "AldersInverkan" element
         */
        dataImport.AldersInverkanType addNewAldersInverkan();
        
        /**
         * Unsets the "AldersInverkan" element
         */
        void unsetAldersInverkan();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static dataImport.FormularDocument.Formular newInstance() {
              return (dataImport.FormularDocument.Formular) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static dataImport.FormularDocument.Formular newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (dataImport.FormularDocument.Formular) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static dataImport.FormularDocument newInstance() {
          return (dataImport.FormularDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static dataImport.FormularDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (dataImport.FormularDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static dataImport.FormularDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (dataImport.FormularDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static dataImport.FormularDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (dataImport.FormularDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static dataImport.FormularDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.FormularDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static dataImport.FormularDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.FormularDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static dataImport.FormularDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.FormularDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static dataImport.FormularDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.FormularDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static dataImport.FormularDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.FormularDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static dataImport.FormularDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.FormularDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static dataImport.FormularDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.FormularDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static dataImport.FormularDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.FormularDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static dataImport.FormularDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (dataImport.FormularDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static dataImport.FormularDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (dataImport.FormularDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static dataImport.FormularDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (dataImport.FormularDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static dataImport.FormularDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (dataImport.FormularDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static dataImport.FormularDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (dataImport.FormularDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static dataImport.FormularDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (dataImport.FormularDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
