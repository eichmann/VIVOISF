package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentTheAbstractIterator thePersonalCommunicationDocument = (PersonalCommunicationDocumentTheAbstractIterator)findAncestorWithClass(this, PersonalCommunicationDocumentTheAbstractIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocument.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

