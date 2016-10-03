package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentSici currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentSiciIterator thePersonalCommunicationDocument = (PersonalCommunicationDocumentSiciIterator)findAncestorWithClass(this, PersonalCommunicationDocumentSiciIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocument.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for sici tag ");
		}
		return SKIP_BODY;
	}
}

