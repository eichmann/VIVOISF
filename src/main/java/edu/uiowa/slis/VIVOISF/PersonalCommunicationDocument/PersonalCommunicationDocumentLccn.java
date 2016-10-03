package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentLccnIterator thePersonalCommunicationDocument = (PersonalCommunicationDocumentLccnIterator)findAncestorWithClass(this, PersonalCommunicationDocumentLccnIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocument.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for lccn tag ");
		}
		return SKIP_BODY;
	}
}

