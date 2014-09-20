package System;


/**
 * @author chacha
 * @version 1.0
 * @created 19-Jul-2014 09:51:09 p.m.
 */
public class tgparse extends DefaultHandler {

	public static tgxml data = null;
	Boolean elementOn = false;
	String elementValue = null;

	public tgparse(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * This method called to get the tags value in XML
	 * 
	 * @param ch
	 * @param start
	 * @param length
	 * @exception SAXException
	 */
	@Override
	public void characters(char[] ch, int start, int length)
	  throws SAXException{

	}

	/**
	 * This method will be called when the tags of the XML end
	 * 
	 * @param uri
	 * @param localName
	 * @param qName
	 * @exception SAXException
	 */
	@Override
	public void endElement(String uri, String localName, String qName)
	  throws SAXException{

	}

	public static tgxml getXMLData(){
		return null;
	}

	/**
	 * 
	 * @param data
	 */
	public static void setXMLData(tgxml data){

	}

	/**
	 * This method will be called when the tags of the XML starts
	 * 
	 * @param uri
	 * @param localName
	 * @param qName
	 * @param attributes
	 * @exception SAXException
	 */
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes)
	  throws SAXException{

	}

}