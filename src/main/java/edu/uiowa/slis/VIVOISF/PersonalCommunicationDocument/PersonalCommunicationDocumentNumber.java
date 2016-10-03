package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentNumberIterator thePersonalCommunicationDocument = (PersonalCommunicationDocumentNumberIterator)findAncestorWithClass(this, PersonalCommunicationDocumentNumberIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocument.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for number tag ");
		}
		return SKIP_BODY;
	}
}

