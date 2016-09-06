package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentDoiIterator thePersonalCommunicationDocument = (PersonalCommunicationDocumentDoiIterator)findAncestorWithClass(this, PersonalCommunicationDocumentDoiIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocument.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for doi tag ");
		}
		return SKIP_BODY;
	}
}

