package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentIsbn13Iterator thePersonalCommunicationDocument = (PersonalCommunicationDocumentIsbn13Iterator)findAncestorWithClass(this, PersonalCommunicationDocumentIsbn13Iterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocument.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

