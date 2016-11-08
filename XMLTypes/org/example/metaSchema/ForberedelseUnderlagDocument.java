/*
 * An XML document type.
 * Localname: ForberedelseUnderlag
 * Namespace: http://www.example.org/metaSchema
 * Java type: org.example.metaSchema.ForberedelseUnderlagDocument
 *
 * Automatically generated - do not modify.
 */
package org.example.metaSchema;


/**
 * A document containing one ForberedelseUnderlag(@http://www.example.org/metaSchema) element.
 *
 * This is a complex type.
 */
public interface ForberedelseUnderlagDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ForberedelseUnderlagDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCDC654518B85F28E08CDA8E17E2DCA50").resolveHandle("forberedelseunderlag3f4fdoctype");
    
    /**
     * Gets the "ForberedelseUnderlag" element
     */
    org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag getForberedelseUnderlag();
    
    /**
     * Sets the "ForberedelseUnderlag" element
     */
    void setForberedelseUnderlag(org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag forberedelseUnderlag);
    
    /**
     * Appends and returns a new empty "ForberedelseUnderlag" element
     */
    org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag addNewForberedelseUnderlag();
    
    /**
     * An XML ForberedelseUnderlag(@http://www.example.org/metaSchema).
     *
     * This is a complex type.
     */
    public interface ForberedelseUnderlag extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ForberedelseUnderlag.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCDC654518B85F28E08CDA8E17E2DCA50").resolveHandle("forberedelseunderlag9a3belemtype");
        
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
         * Gets the "Filer" element
         */
        org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer getFiler();
        
        /**
         * Sets the "Filer" element
         */
        void setFiler(org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer filer);
        
        /**
         * Appends and returns a new empty "Filer" element
         */
        org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer addNewFiler();
        
        /**
         * An XML Filer(@http://www.example.org/metaSchema).
         *
         * This is a complex type.
         */
        public interface Filer extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Filer.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCDC654518B85F28E08CDA8E17E2DCA50").resolveHandle("filer26fdelemtype");
            
            /**
             * Gets array of all "Fil" elements
             */
            org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer.Fil[] getFilArray();
            
            /**
             * Gets ith "Fil" element
             */
            org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer.Fil getFilArray(int i);
            
            /**
             * Returns number of "Fil" element
             */
            int sizeOfFilArray();
            
            /**
             * Sets array of all "Fil" element
             */
            void setFilArray(org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer.Fil[] filArray);
            
            /**
             * Sets ith "Fil" element
             */
            void setFilArray(int i, org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer.Fil fil);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Fil" element
             */
            org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer.Fil insertNewFil(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Fil" element
             */
            org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer.Fil addNewFil();
            
            /**
             * Removes the ith "Fil" element
             */
            void removeFil(int i);
            
            /**
             * An XML Fil(@http://www.example.org/metaSchema).
             *
             * This is an atomic type that is a restriction of org.example.metaSchema.ForberedelseUnderlagDocument$ForberedelseUnderlag$Filer$Fil.
             */
            public interface Fil extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Fil.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCDC654518B85F28E08CDA8E17E2DCA50").resolveHandle("filb452elemtype");
                
                /**
                 * Gets the "amne" attribute
                 */
                java.lang.String getAmne();
                
                /**
                 * Gets (as xml) the "amne" attribute
                 */
                org.apache.xmlbeans.XmlString xgetAmne();
                
                /**
                 * Sets the "amne" attribute
                 */
                void setAmne(java.lang.String amne);
                
                /**
                 * Sets (as xml) the "amne" attribute
                 */
                void xsetAmne(org.apache.xmlbeans.XmlString amne);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer.Fil newInstance() {
                      return (org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer.Fil) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer.Fil newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer.Fil) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer newInstance() {
                  return (org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag.Filer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag newInstance() {
              return (org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.example.metaSchema.ForberedelseUnderlagDocument.ForberedelseUnderlag) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.example.metaSchema.ForberedelseUnderlagDocument newInstance() {
          return (org.example.metaSchema.ForberedelseUnderlagDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.example.metaSchema.ForberedelseUnderlagDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.example.metaSchema.ForberedelseUnderlagDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.example.metaSchema.ForberedelseUnderlagDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.example.metaSchema.ForberedelseUnderlagDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.example.metaSchema.ForberedelseUnderlagDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.example.metaSchema.ForberedelseUnderlagDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.example.metaSchema.ForberedelseUnderlagDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.example.metaSchema.ForberedelseUnderlagDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.example.metaSchema.ForberedelseUnderlagDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.example.metaSchema.ForberedelseUnderlagDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.example.metaSchema.ForberedelseUnderlagDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.example.metaSchema.ForberedelseUnderlagDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.example.metaSchema.ForberedelseUnderlagDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.example.metaSchema.ForberedelseUnderlagDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.example.metaSchema.ForberedelseUnderlagDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.example.metaSchema.ForberedelseUnderlagDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.example.metaSchema.ForberedelseUnderlagDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.example.metaSchema.ForberedelseUnderlagDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.example.metaSchema.ForberedelseUnderlagDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.example.metaSchema.ForberedelseUnderlagDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.example.metaSchema.ForberedelseUnderlagDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.example.metaSchema.ForberedelseUnderlagDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.example.metaSchema.ForberedelseUnderlagDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.example.metaSchema.ForberedelseUnderlagDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.example.metaSchema.ForberedelseUnderlagDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.example.metaSchema.ForberedelseUnderlagDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.example.metaSchema.ForberedelseUnderlagDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.example.metaSchema.ForberedelseUnderlagDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.example.metaSchema.ForberedelseUnderlagDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.example.metaSchema.ForberedelseUnderlagDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.example.metaSchema.ForberedelseUnderlagDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.example.metaSchema.ForberedelseUnderlagDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.example.metaSchema.ForberedelseUnderlagDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.example.metaSchema.ForberedelseUnderlagDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
