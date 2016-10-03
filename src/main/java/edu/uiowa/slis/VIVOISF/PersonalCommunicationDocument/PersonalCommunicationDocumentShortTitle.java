package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentShortTitleIterator thePersonalCommunicationDocument = (PersonalCommunicationDocumentShortTitleIterator)findAncestorWithClass(this, PersonalCommunicationDocumentShortTitleIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocument.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

