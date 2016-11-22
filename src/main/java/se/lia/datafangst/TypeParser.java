package se.lia.datafangst;

import org.apache.xmlbeans.XmlObject;

import dataImport.FormularDocument;
import dataImport.FormularDocument.Formular;




public class TypeParser extends Parser
{
	/**
	 * Returnerar FileType av XmlObject
	 * @param xml XmlObject
	 * @return Enum (GRUNDOCHMARGINAL/ALDERSINVERKAN)
	 */
	public  static FileType getFileType(XmlObject xml)
	{
		FormularDocument f = (FormularDocument) xml;
		Formular m = f.getFormular();
		return FileType.valueOf(m.getFilTyp().toString());
	}
}
