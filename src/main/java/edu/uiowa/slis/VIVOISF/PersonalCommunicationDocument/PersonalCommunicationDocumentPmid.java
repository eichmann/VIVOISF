package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentPmidIterator thePersonalCommunicationDocument = (PersonalCommunicationDocumentPmidIterator)findAncestorWithClass(this, PersonalCommunicationDocumentPmidIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocument.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for pmid tag ");
		}
		return SKIP_BODY;
	}
}

