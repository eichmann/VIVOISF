package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentStatusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentStatusIterator thePersonalCommunicationDocumentStatusIterator = (PersonalCommunicationDocumentStatusIterator)findAncestorWithClass(this, PersonalCommunicationDocumentStatusIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocumentStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for status tag ");
		}
		return SKIP_BODY;
	}
}

