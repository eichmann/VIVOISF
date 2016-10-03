package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentTranscriptOfIterator theDocumentTranscriptOfIterator = (DocumentTranscriptOfIterator)findAncestorWithClass(this, DocumentTranscriptOfIterator.class);
			pageContext.getOut().print(theDocumentTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

