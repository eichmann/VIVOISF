package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentShortDescriptionIterator thePersonalCommunicationDocument = (PersonalCommunicationDocumentShortDescriptionIterator)findAncestorWithClass(this, PersonalCommunicationDocumentShortDescriptionIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocument.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

