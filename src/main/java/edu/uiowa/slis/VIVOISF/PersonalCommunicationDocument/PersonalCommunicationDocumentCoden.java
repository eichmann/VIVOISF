package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentCodenIterator thePersonalCommunicationDocument = (PersonalCommunicationDocumentCodenIterator)findAncestorWithClass(this, PersonalCommunicationDocumentCodenIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocument.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for coden tag ");
		}
		return SKIP_BODY;
	}
}

