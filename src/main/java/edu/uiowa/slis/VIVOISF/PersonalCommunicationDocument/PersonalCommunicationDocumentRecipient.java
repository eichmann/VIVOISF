package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentRecipient extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentRecipient currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentRecipient.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentRecipientIterator thePersonalCommunicationDocumentRecipientIterator = (PersonalCommunicationDocumentRecipientIterator)findAncestorWithClass(this, PersonalCommunicationDocumentRecipientIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocumentRecipientIterator.getRecipient());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for recipient tag ");
		}
		return SKIP_BODY;
	}
}

