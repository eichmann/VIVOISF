package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentTranscriptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentTranscriptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentTranscriptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentTranscriptOfIterator theLegalCaseDocumentTranscriptOfIterator = (LegalCaseDocumentTranscriptOfIterator)findAncestorWithClass(this, LegalCaseDocumentTranscriptOfIterator.class);
			pageContext.getOut().print(theLegalCaseDocumentTranscriptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

