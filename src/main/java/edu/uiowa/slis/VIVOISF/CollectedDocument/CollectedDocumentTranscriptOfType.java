package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentTranscriptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentTranscriptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentTranscriptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentTranscriptOfIterator theCollectedDocumentTranscriptOfIterator = (CollectedDocumentTranscriptOfIterator)findAncestorWithClass(this, CollectedDocumentTranscriptOfIterator.class);
			pageContext.getOut().print(theCollectedDocumentTranscriptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

