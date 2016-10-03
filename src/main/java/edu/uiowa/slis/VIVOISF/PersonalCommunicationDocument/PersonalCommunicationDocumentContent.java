package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentContent currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentContentIterator thePersonalCommunicationDocument = (PersonalCommunicationDocumentContentIterator)findAncestorWithClass(this, PersonalCommunicationDocumentContentIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocument.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for content tag ");
		}
		return SKIP_BODY;
	}
}

