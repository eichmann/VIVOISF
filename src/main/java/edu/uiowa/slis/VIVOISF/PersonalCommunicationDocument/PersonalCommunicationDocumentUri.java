package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentUri currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentUriIterator thePersonalCommunicationDocument = (PersonalCommunicationDocumentUriIterator)findAncestorWithClass(this, PersonalCommunicationDocumentUriIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocument.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for uri tag ");
		}
		return SKIP_BODY;
	}
}

