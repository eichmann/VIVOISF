package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentDocumentationForIterator thePersonalCommunicationDocumentDocumentationForIterator = (PersonalCommunicationDocumentDocumentationForIterator)findAncestorWithClass(this, PersonalCommunicationDocumentDocumentationForIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocumentDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

