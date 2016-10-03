package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentPageStartIterator thePersonalCommunicationDocument = (PersonalCommunicationDocumentPageStartIterator)findAncestorWithClass(this, PersonalCommunicationDocumentPageStartIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocument.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

