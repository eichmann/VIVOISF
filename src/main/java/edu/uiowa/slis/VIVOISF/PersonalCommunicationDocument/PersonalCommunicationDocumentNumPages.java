package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentNumPagesIterator thePersonalCommunicationDocument = (PersonalCommunicationDocumentNumPagesIterator)findAncestorWithClass(this, PersonalCommunicationDocumentNumPagesIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocument.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for numPages tag ");
		}
		return SKIP_BODY;
	}
}

