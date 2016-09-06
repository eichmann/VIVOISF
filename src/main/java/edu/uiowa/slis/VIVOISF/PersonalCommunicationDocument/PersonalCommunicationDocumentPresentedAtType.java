package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentPresentedAtType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentPresentedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentPresentedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentPresentedAtIterator thePersonalCommunicationDocumentPresentedAtIterator = (PersonalCommunicationDocumentPresentedAtIterator)findAncestorWithClass(this, PersonalCommunicationDocumentPresentedAtIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocumentPresentedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

