package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentPageEndIterator thePersonalCommunicationDocument = (PersonalCommunicationDocumentPageEndIterator)findAncestorWithClass(this, PersonalCommunicationDocumentPageEndIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocument.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

