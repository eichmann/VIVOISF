package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentEditionIterator thePersonalCommunicationDocument = (PersonalCommunicationDocumentEditionIterator)findAncestorWithClass(this, PersonalCommunicationDocumentEditionIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocument.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for edition tag ");
		}
		return SKIP_BODY;
	}
}

