package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentLocatorIterator thePersonalCommunicationDocument = (PersonalCommunicationDocumentLocatorIterator)findAncestorWithClass(this, PersonalCommunicationDocumentLocatorIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocument.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for locator tag ");
		}
		return SKIP_BODY;
	}
}

