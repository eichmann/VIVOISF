package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentSection currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentSectionIterator thePersonalCommunicationDocument = (PersonalCommunicationDocumentSectionIterator)findAncestorWithClass(this, PersonalCommunicationDocumentSectionIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocument.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for section tag ");
		}
		return SKIP_BODY;
	}
}

