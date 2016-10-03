package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentUpcIterator thePersonalCommunicationDocument = (PersonalCommunicationDocumentUpcIterator)findAncestorWithClass(this, PersonalCommunicationDocumentUpcIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocument.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for upc tag ");
		}
		return SKIP_BODY;
	}
}

