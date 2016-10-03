package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentIsbn10Iterator thePersonalCommunicationDocument = (PersonalCommunicationDocumentIsbn10Iterator)findAncestorWithClass(this, PersonalCommunicationDocumentIsbn10Iterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocument.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

