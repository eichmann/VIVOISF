package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartTranscriptOfIterator theDocumentPartTranscriptOfIterator = (DocumentPartTranscriptOfIterator)findAncestorWithClass(this, DocumentPartTranscriptOfIterator.class);
			pageContext.getOut().print(theDocumentPartTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

