package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentTranscriptOfIterator theLegalCaseDocumentTranscriptOfIterator = (LegalCaseDocumentTranscriptOfIterator)findAncestorWithClass(this, LegalCaseDocumentTranscriptOfIterator.class);
			pageContext.getOut().print(theLegalCaseDocumentTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

