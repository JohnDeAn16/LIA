/*
 * An XML document type.
 * Localname: GoMDoc
 * Namespace: http://www.example.org/GrundMarginal
 * Java type: org.example.grundMarginal.GoMDocDocument
 *
 * Automatically generated - do not modify.
 */
package org.example.grundMarginal;


/**
 * A document containing one GoMDoc(@http://www.example.org/GrundMarginal) element.
 *
 * This is a complex type.
 */
public interface GoMDocDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GoMDocDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s590423E410BDEBA4AC0B876F94C44E9B").resolveHandle("gomdoc3bf5doctype");
    
    /**
     * Gets the "GoMDoc" element
     */
    org.example.grundMarginal.GoMDocDocument.GoMDoc getGoMDoc();
    
    /**
     * Sets the "GoMDoc" element
     */
    void setGoMDoc(org.example.grundMarginal.GoMDocDocument.GoMDoc goMDoc);
    
    /**
     * Appends and returns a new empty "GoMDoc" element
     */
    org.example.grundMarginal.GoMDocDocument.GoMDoc addNewGoMDoc();
    
    /**
     * An XML GoMDoc(@http://www.example.org/GrundMarginal).
     *
     * This is a complex type.
     */
    public interface GoMDoc extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GoMDoc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s590423E410BDEBA4AC0B876F94C44E9B").resolveHandle("gomdocd304elemtype");
        
        /**
         * Gets array of all "GrundOchMarginal" elements
         */
        org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal[] getGrundOchMarginalArray();
        
        /**
         * Gets ith "GrundOchMarginal" element
         */
        org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal getGrundOchMarginalArray(int i);
        
        /**
         * Returns number of "GrundOchMarginal" element
         */
        int sizeOfGrundOchMarginalArray();
        
        /**
         * Sets array of all "GrundOchMarginal" element
         */
        void setGrundOchMarginalArray(org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal[] grundOchMarginalArray);
        
        /**
         * Sets ith "GrundOchMarginal" element
         */
        void setGrundOchMarginalArray(int i, org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal grundOchMarginal);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "GrundOchMarginal" element
         */
        org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal insertNewGrundOchMarginal(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "GrundOchMarginal" element
         */
        org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal addNewGrundOchMarginal();
        
        /**
         * Removes the ith "GrundOchMarginal" element
         */
        void removeGrundOchMarginal(int i);
        
        /**
         * An XML GrundOchMarginal(@http://www.example.org/GrundMarginal).
         *
         * This is a complex type.
         */
        public interface GrundOchMarginal extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GrundOchMarginal.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s590423E410BDEBA4AC0B876F94C44E9B").resolveHandle("grundochmarginal3cdbelemtype");
            
            /**
             * Gets the "fastighetsTaxeringsAr" element
             */
            java.util.Calendar getFastighetsTaxeringsAr();
            
            /**
             * Gets (as xml) the "fastighetsTaxeringsAr" element
             */
            org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.FastighetsTaxeringsAr xgetFastighetsTaxeringsAr();
            
            /**
             * Sets the "fastighetsTaxeringsAr" element
             */
            void setFastighetsTaxeringsAr(java.util.Calendar fastighetsTaxeringsAr);
            
            /**
             * Sets (as xml) the "fastighetsTaxeringsAr" element
             */
            void xsetFastighetsTaxeringsAr(org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.FastighetsTaxeringsAr fastighetsTaxeringsAr);
            
            /**
             * Gets array of all "nivaFaktor" elements
             */
            org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor[] getNivaFaktorArray();
            
            /**
             * Gets ith "nivaFaktor" element
             */
            org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor getNivaFaktorArray(int i);
            
            /**
             * Returns number of "nivaFaktor" element
             */
            int sizeOfNivaFaktorArray();
            
            /**
             * Sets array of all "nivaFaktor" element
             */
            void setNivaFaktorArray(org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor[] nivaFaktorArray);
            
            /**
             * Sets ith "nivaFaktor" element
             */
            void setNivaFaktorArray(int i, org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor nivaFaktor);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "nivaFaktor" element
             */
            org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor insertNewNivaFaktor(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "nivaFaktor" element
             */
            org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor addNewNivaFaktor();
            
            /**
             * Removes the ith "nivaFaktor" element
             */
            void removeNivaFaktor(int i);
            
            /**
             * Gets array of all "standardPoang" elements
             */
            org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang[] getStandardPoangArray();
            
            /**
             * Gets ith "standardPoang" element
             */
            org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang getStandardPoangArray(int i);
            
            /**
             * Returns number of "standardPoang" element
             */
            int sizeOfStandardPoangArray();
            
            /**
             * Sets array of all "standardPoang" element
             */
            void setStandardPoangArray(org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang[] standardPoangArray);
            
            /**
             * Sets ith "standardPoang" element
             */
            void setStandardPoangArray(int i, org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang standardPoang);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "standardPoang" element
             */
            org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang insertNewStandardPoang(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "standardPoang" element
             */
            org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang addNewStandardPoang();
            
            /**
             * Removes the ith "standardPoang" element
             */
            void removeStandardPoang(int i);
            
            /**
             * Gets array of all "vardeYta" elements
             */
            org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta[] getVardeYtaArray();
            
            /**
             * Gets ith "vardeYta" element
             */
            org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta getVardeYtaArray(int i);
            
            /**
             * Returns number of "vardeYta" element
             */
            int sizeOfVardeYtaArray();
            
            /**
             * Sets array of all "vardeYta" element
             */
            void setVardeYtaArray(org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta[] vardeYtaArray);
            
            /**
             * Sets ith "vardeYta" element
             */
            void setVardeYtaArray(int i, org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta vardeYta);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "vardeYta" element
             */
            org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta insertNewVardeYta(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "vardeYta" element
             */
            org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta addNewVardeYta();
            
            /**
             * Removes the ith "vardeYta" element
             */
            void removeVardeYta(int i);
            
            /**
             * Gets the "varde" element
             */
            org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde getVarde();
            
            /**
             * Sets the "varde" element
             */
            void setVarde(org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde varde);
            
            /**
             * Appends and returns a new empty "varde" element
             */
            org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde addNewVarde();
            
            /**
             * An XML fastighetsTaxeringsAr(@http://www.example.org/GrundMarginal).
             *
             * This is an atomic type that is a restriction of org.example.grundMarginal.GoMDocDocument$GoMDoc$GrundOchMarginal$FastighetsTaxeringsAr.
             */
            public interface FastighetsTaxeringsAr extends org.apache.xmlbeans.XmlGYear
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FastighetsTaxeringsAr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s590423E410BDEBA4AC0B876F94C44E9B").resolveHandle("fastighetstaxeringsar702belemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.FastighetsTaxeringsAr newValue(java.lang.Object obj) {
                      return (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.FastighetsTaxeringsAr) type.newValue( obj ); }
                    
                    public static org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.FastighetsTaxeringsAr newInstance() {
                      return (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.FastighetsTaxeringsAr) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.FastighetsTaxeringsAr newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.FastighetsTaxeringsAr) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML nivaFaktor(@http://www.example.org/GrundMarginal).
             *
             * This is a complex type.
             */
            public interface NivaFaktor extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NivaFaktor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s590423E410BDEBA4AC0B876F94C44E9B").resolveHandle("nivafaktor0dc4elemtype");
                
                /**
                 * Gets the "undreGrans" element
                 */
                java.math.BigDecimal getUndreGrans();
                
                /**
                 * Gets (as xml) the "undreGrans" element
                 */
                org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor.UndreGrans xgetUndreGrans();
                
                /**
                 * Sets the "undreGrans" element
                 */
                void setUndreGrans(java.math.BigDecimal undreGrans);
                
                /**
                 * Sets (as xml) the "undreGrans" element
                 */
                void xsetUndreGrans(org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor.UndreGrans undreGrans);
                
                /**
                 * Gets the "ovreGrans" element
                 */
                java.math.BigDecimal getOvreGrans();
                
                /**
                 * Gets (as xml) the "ovreGrans" element
                 */
                org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor.OvreGrans xgetOvreGrans();
                
                /**
                 * Sets the "ovreGrans" element
                 */
                void setOvreGrans(java.math.BigDecimal ovreGrans);
                
                /**
                 * Sets (as xml) the "ovreGrans" element
                 */
                void xsetOvreGrans(org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor.OvreGrans ovreGrans);
                
                /**
                 * An XML undreGrans(@http://www.example.org/GrundMarginal).
                 *
                 * This is an atomic type that is a restriction of org.example.grundMarginal.GoMDocDocument$GoMDoc$GrundOchMarginal$NivaFaktor$UndreGrans.
                 */
                public interface UndreGrans extends org.apache.xmlbeans.XmlDecimal
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UndreGrans.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s590423E410BDEBA4AC0B876F94C44E9B").resolveHandle("undregrans6babelemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor.UndreGrans newValue(java.lang.Object obj) {
                        return (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor.UndreGrans) type.newValue( obj ); }
                      
                      public static org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor.UndreGrans newInstance() {
                        return (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor.UndreGrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor.UndreGrans newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor.UndreGrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML ovreGrans(@http://www.example.org/GrundMarginal).
                 *
                 * This is an atomic type that is a restriction of org.example.grundMarginal.GoMDocDocument$GoMDoc$GrundOchMarginal$NivaFaktor$OvreGrans.
                 */
                public interface OvreGrans extends org.apache.xmlbeans.XmlDecimal
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OvreGrans.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s590423E410BDEBA4AC0B876F94C44E9B").resolveHandle("ovregransb1d7elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor.OvreGrans newValue(java.lang.Object obj) {
                        return (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor.OvreGrans) type.newValue( obj ); }
                      
                      public static org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor.OvreGrans newInstance() {
                        return (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor.OvreGrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor.OvreGrans newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor.OvreGrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor newInstance() {
                      return (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.NivaFaktor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML standardPoang(@http://www.example.org/GrundMarginal).
             *
             * This is a complex type.
             */
            public interface StandardPoang extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StandardPoang.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s590423E410BDEBA4AC0B876F94C44E9B").resolveHandle("standardpoang8585elemtype");
                
                /**
                 * Gets the "undreGrans" element
                 */
                int getUndreGrans();
                
                /**
                 * Gets (as xml) the "undreGrans" element
                 */
                org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang.UndreGrans xgetUndreGrans();
                
                /**
                 * Sets the "undreGrans" element
                 */
                void setUndreGrans(int undreGrans);
                
                /**
                 * Sets (as xml) the "undreGrans" element
                 */
                void xsetUndreGrans(org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang.UndreGrans undreGrans);
                
                /**
                 * Gets the "ovreGrans" element
                 */
                int getOvreGrans();
                
                /**
                 * Gets (as xml) the "ovreGrans" element
                 */
                org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang.OvreGrans xgetOvreGrans();
                
                /**
                 * Sets the "ovreGrans" element
                 */
                void setOvreGrans(int ovreGrans);
                
                /**
                 * Sets (as xml) the "ovreGrans" element
                 */
                void xsetOvreGrans(org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang.OvreGrans ovreGrans);
                
                /**
                 * An XML undreGrans(@http://www.example.org/GrundMarginal).
                 *
                 * This is an atomic type that is a restriction of org.example.grundMarginal.GoMDocDocument$GoMDoc$GrundOchMarginal$StandardPoang$UndreGrans.
                 */
                public interface UndreGrans extends org.apache.xmlbeans.XmlInt
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UndreGrans.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s590423E410BDEBA4AC0B876F94C44E9B").resolveHandle("undregrans0a3eelemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang.UndreGrans newValue(java.lang.Object obj) {
                        return (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang.UndreGrans) type.newValue( obj ); }
                      
                      public static org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang.UndreGrans newInstance() {
                        return (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang.UndreGrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang.UndreGrans newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang.UndreGrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML ovreGrans(@http://www.example.org/GrundMarginal).
                 *
                 * This is an atomic type that is a restriction of org.example.grundMarginal.GoMDocDocument$GoMDoc$GrundOchMarginal$StandardPoang$OvreGrans.
                 */
                public interface OvreGrans extends org.apache.xmlbeans.XmlInt
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OvreGrans.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s590423E410BDEBA4AC0B876F94C44E9B").resolveHandle("ovregrans0492elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang.OvreGrans newValue(java.lang.Object obj) {
                        return (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang.OvreGrans) type.newValue( obj ); }
                      
                      public static org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang.OvreGrans newInstance() {
                        return (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang.OvreGrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang.OvreGrans newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang.OvreGrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang newInstance() {
                      return (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.StandardPoang) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML vardeYta(@http://www.example.org/GrundMarginal).
             *
             * This is a complex type.
             */
            public interface VardeYta extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VardeYta.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s590423E410BDEBA4AC0B876F94C44E9B").resolveHandle("vardeyta6a95elemtype");
                
                /**
                 * Gets the "undreGrans" element
                 */
                int getUndreGrans();
                
                /**
                 * Gets (as xml) the "undreGrans" element
                 */
                org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta.UndreGrans xgetUndreGrans();
                
                /**
                 * Sets the "undreGrans" element
                 */
                void setUndreGrans(int undreGrans);
                
                /**
                 * Sets (as xml) the "undreGrans" element
                 */
                void xsetUndreGrans(org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta.UndreGrans undreGrans);
                
                /**
                 * Gets the "ovreGrans" element
                 */
                int getOvreGrans();
                
                /**
                 * Gets (as xml) the "ovreGrans" element
                 */
                org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta.OvreGrans xgetOvreGrans();
                
                /**
                 * Sets the "ovreGrans" element
                 */
                void setOvreGrans(int ovreGrans);
                
                /**
                 * Sets (as xml) the "ovreGrans" element
                 */
                void xsetOvreGrans(org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta.OvreGrans ovreGrans);
                
                /**
                 * An XML undreGrans(@http://www.example.org/GrundMarginal).
                 *
                 * This is an atomic type that is a restriction of org.example.grundMarginal.GoMDocDocument$GoMDoc$GrundOchMarginal$VardeYta$UndreGrans.
                 */
                public interface UndreGrans extends org.apache.xmlbeans.XmlInt
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UndreGrans.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s590423E410BDEBA4AC0B876F94C44E9B").resolveHandle("undregrans163celemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta.UndreGrans newValue(java.lang.Object obj) {
                        return (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta.UndreGrans) type.newValue( obj ); }
                      
                      public static org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta.UndreGrans newInstance() {
                        return (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta.UndreGrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta.UndreGrans newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta.UndreGrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML ovreGrans(@http://www.example.org/GrundMarginal).
                 *
                 * This is an atomic type that is a restriction of org.example.grundMarginal.GoMDocDocument$GoMDoc$GrundOchMarginal$VardeYta$OvreGrans.
                 */
                public interface OvreGrans extends org.apache.xmlbeans.XmlInt
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OvreGrans.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s590423E410BDEBA4AC0B876F94C44E9B").resolveHandle("ovregransf768elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta.OvreGrans newValue(java.lang.Object obj) {
                        return (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta.OvreGrans) type.newValue( obj ); }
                      
                      public static org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta.OvreGrans newInstance() {
                        return (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta.OvreGrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta.OvreGrans newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta.OvreGrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta newInstance() {
                      return (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.VardeYta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML varde(@http://www.example.org/GrundMarginal).
             *
             * This is a complex type.
             */
            public interface Varde extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Varde.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s590423E410BDEBA4AC0B876F94C44E9B").resolveHandle("varde802felemtype");
                
                /**
                 * Gets the "grundVarde" element
                 */
                int getGrundVarde();
                
                /**
                 * Gets (as xml) the "grundVarde" element
                 */
                org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde.GrundVarde xgetGrundVarde();
                
                /**
                 * Sets the "grundVarde" element
                 */
                void setGrundVarde(int grundVarde);
                
                /**
                 * Sets (as xml) the "grundVarde" element
                 */
                void xsetGrundVarde(org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde.GrundVarde grundVarde);
                
                /**
                 * Gets the "marginalVarde" element
                 */
                int getMarginalVarde();
                
                /**
                 * Gets (as xml) the "marginalVarde" element
                 */
                org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde.MarginalVarde xgetMarginalVarde();
                
                /**
                 * Sets the "marginalVarde" element
                 */
                void setMarginalVarde(int marginalVarde);
                
                /**
                 * Sets (as xml) the "marginalVarde" element
                 */
                void xsetMarginalVarde(org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde.MarginalVarde marginalVarde);
                
                /**
                 * An XML grundVarde(@http://www.example.org/GrundMarginal).
                 *
                 * This is an atomic type that is a restriction of org.example.grundMarginal.GoMDocDocument$GoMDoc$GrundOchMarginal$Varde$GrundVarde.
                 */
                public interface GrundVarde extends org.apache.xmlbeans.XmlInt
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GrundVarde.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s590423E410BDEBA4AC0B876F94C44E9B").resolveHandle("grundvardebf73elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde.GrundVarde newValue(java.lang.Object obj) {
                        return (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde.GrundVarde) type.newValue( obj ); }
                      
                      public static org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde.GrundVarde newInstance() {
                        return (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde.GrundVarde) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde.GrundVarde newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde.GrundVarde) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML marginalVarde(@http://www.example.org/GrundMarginal).
                 *
                 * This is an atomic type that is a restriction of org.example.grundMarginal.GoMDocDocument$GoMDoc$GrundOchMarginal$Varde$MarginalVarde.
                 */
                public interface MarginalVarde extends org.apache.xmlbeans.XmlInt
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MarginalVarde.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s590423E410BDEBA4AC0B876F94C44E9B").resolveHandle("marginalvarde74eaelemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde.MarginalVarde newValue(java.lang.Object obj) {
                        return (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde.MarginalVarde) type.newValue( obj ); }
                      
                      public static org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde.MarginalVarde newInstance() {
                        return (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde.MarginalVarde) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde.MarginalVarde newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde.MarginalVarde) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde newInstance() {
                      return (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal.Varde) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal newInstance() {
                  return (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.example.grundMarginal.GoMDocDocument.GoMDoc.GrundOchMarginal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.example.grundMarginal.GoMDocDocument.GoMDoc newInstance() {
              return (org.example.grundMarginal.GoMDocDocument.GoMDoc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.example.grundMarginal.GoMDocDocument.GoMDoc newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.example.grundMarginal.GoMDocDocument.GoMDoc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.example.grundMarginal.GoMDocDocument newInstance() {
          return (org.example.grundMarginal.GoMDocDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.example.grundMarginal.GoMDocDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.example.grundMarginal.GoMDocDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.example.grundMarginal.GoMDocDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.example.grundMarginal.GoMDocDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.example.grundMarginal.GoMDocDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.example.grundMarginal.GoMDocDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.example.grundMarginal.GoMDocDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.example.grundMarginal.GoMDocDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.example.grundMarginal.GoMDocDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.example.grundMarginal.GoMDocDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.example.grundMarginal.GoMDocDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.example.grundMarginal.GoMDocDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.example.grundMarginal.GoMDocDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.example.grundMarginal.GoMDocDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.example.grundMarginal.GoMDocDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.example.grundMarginal.GoMDocDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.example.grundMarginal.GoMDocDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.example.grundMarginal.GoMDocDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.example.grundMarginal.GoMDocDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.example.grundMarginal.GoMDocDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.example.grundMarginal.GoMDocDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.example.grundMarginal.GoMDocDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.example.grundMarginal.GoMDocDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.example.grundMarginal.GoMDocDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.example.grundMarginal.GoMDocDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.example.grundMarginal.GoMDocDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.example.grundMarginal.GoMDocDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.example.grundMarginal.GoMDocDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.example.grundMarginal.GoMDocDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.example.grundMarginal.GoMDocDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.example.grundMarginal.GoMDocDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.example.grundMarginal.GoMDocDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.example.grundMarginal.GoMDocDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.example.grundMarginal.GoMDocDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
