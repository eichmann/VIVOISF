package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentPages currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentPagesIterator thePersonalCommunicationDocument = (PersonalCommunicationDocumentPagesIterator)findAncestorWithClass(this, PersonalCommunicationDocumentPagesIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocument.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for pages tag ");
		}
		return SKIP_BODY;
	}
}

