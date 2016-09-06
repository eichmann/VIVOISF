package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentStatusIterator thePersonalCommunicationDocumentStatusIterator = (PersonalCommunicationDocumentStatusIterator)findAncestorWithClass(this, PersonalCommunicationDocumentStatusIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocumentStatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for status tag ");
		}
		return SKIP_BODY;
	}
}

