package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentHasTranslation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentHasTranslation currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentHasTranslation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentHasTranslationIterator thePersonalCommunicationDocumentHasTranslationIterator = (PersonalCommunicationDocumentHasTranslationIterator)findAncestorWithClass(this, PersonalCommunicationDocumentHasTranslationIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocumentHasTranslationIterator.getHasTranslation());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

