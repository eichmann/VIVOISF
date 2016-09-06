package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentHasTranslationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentHasTranslationType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentHasTranslationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentHasTranslationIterator thePersonalCommunicationDocumentHasTranslationIterator = (PersonalCommunicationDocumentHasTranslationIterator)findAncestorWithClass(this, PersonalCommunicationDocumentHasTranslationIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocumentHasTranslationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

