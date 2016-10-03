package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentGtin14Iterator thePersonalCommunicationDocument = (PersonalCommunicationDocumentGtin14Iterator)findAncestorWithClass(this, PersonalCommunicationDocumentGtin14Iterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocument.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

