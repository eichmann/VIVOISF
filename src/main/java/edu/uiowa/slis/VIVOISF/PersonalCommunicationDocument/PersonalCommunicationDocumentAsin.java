package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentAsinIterator thePersonalCommunicationDocument = (PersonalCommunicationDocumentAsinIterator)findAncestorWithClass(this, PersonalCommunicationDocumentAsinIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocument.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for asin tag ");
		}
		return SKIP_BODY;
	}
}
