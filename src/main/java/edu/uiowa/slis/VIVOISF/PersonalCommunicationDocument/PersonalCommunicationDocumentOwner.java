package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentOwnerIterator thePersonalCommunicationDocumentOwnerIterator = (PersonalCommunicationDocumentOwnerIterator)findAncestorWithClass(this, PersonalCommunicationDocumentOwnerIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocumentOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for owner tag ");
		}
		return SKIP_BODY;
	}
}

