package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentTranslatorIterator thePersonalCommunicationDocumentTranslatorIterator = (PersonalCommunicationDocumentTranslatorIterator)findAncestorWithClass(this, PersonalCommunicationDocumentTranslatorIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocumentTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for translator tag ");
		}
		return SKIP_BODY;
	}
}

