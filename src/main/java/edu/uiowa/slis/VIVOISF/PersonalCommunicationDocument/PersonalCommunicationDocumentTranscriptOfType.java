package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentTranscriptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentTranscriptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentTranscriptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentTranscriptOfIterator thePersonalCommunicationDocumentTranscriptOfIterator = (PersonalCommunicationDocumentTranscriptOfIterator)findAncestorWithClass(this, PersonalCommunicationDocumentTranscriptOfIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocumentTranscriptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

