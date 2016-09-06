package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentCitedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentCitedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentCitedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentCitedByIterator thePersonalCommunicationDocumentCitedByIterator = (PersonalCommunicationDocumentCitedByIterator)findAncestorWithClass(this, PersonalCommunicationDocumentCitedByIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocumentCitedByIterator.getCitedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

