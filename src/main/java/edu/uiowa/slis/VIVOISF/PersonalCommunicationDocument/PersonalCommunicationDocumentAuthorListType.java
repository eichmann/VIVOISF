package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentAuthorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentAuthorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentAuthorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentAuthorListIterator thePersonalCommunicationDocumentAuthorListIterator = (PersonalCommunicationDocumentAuthorListIterator)findAncestorWithClass(this, PersonalCommunicationDocumentAuthorListIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocumentAuthorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for authorList tag ");
		}
		return SKIP_BODY;
	}
}

