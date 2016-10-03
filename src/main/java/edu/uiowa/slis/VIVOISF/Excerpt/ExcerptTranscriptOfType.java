package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptTranscriptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptTranscriptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptTranscriptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExcerptTranscriptOfIterator theExcerptTranscriptOfIterator = (ExcerptTranscriptOfIterator)findAncestorWithClass(this, ExcerptTranscriptOfIterator.class);
			pageContext.getOut().print(theExcerptTranscriptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

