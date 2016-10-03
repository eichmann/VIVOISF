package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentHandleIterator thePersonalCommunicationDocument = (PersonalCommunicationDocumentHandleIterator)findAncestorWithClass(this, PersonalCommunicationDocumentHandleIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocument.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for handle tag ");
		}
		return SKIP_BODY;
	}
}

