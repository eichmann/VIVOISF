package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LetterTranscriptOfIterator theLetterTranscriptOfIterator = (LetterTranscriptOfIterator)findAncestorWithClass(this, LetterTranscriptOfIterator.class);
			pageContext.getOut().print(theLetterTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

