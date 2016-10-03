package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentTranscriptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentTranscriptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentTranscriptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentTranscriptOfIterator theLegalDocumentTranscriptOfIterator = (LegalDocumentTranscriptOfIterator)findAncestorWithClass(this, LegalDocumentTranscriptOfIterator.class);
			pageContext.getOut().print(theLegalDocumentTranscriptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

