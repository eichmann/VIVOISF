package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentIdentifierIterator thePersonalCommunicationDocument = (PersonalCommunicationDocumentIdentifierIterator)findAncestorWithClass(this, PersonalCommunicationDocumentIdentifierIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocument.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for identifier tag ");
		}
		return SKIP_BODY;
	}
}

