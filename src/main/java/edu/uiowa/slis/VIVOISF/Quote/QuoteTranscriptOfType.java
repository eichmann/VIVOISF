package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteTranscriptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteTranscriptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteTranscriptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			QuoteTranscriptOfIterator theQuoteTranscriptOfIterator = (QuoteTranscriptOfIterator)findAncestorWithClass(this, QuoteTranscriptOfIterator.class);
			pageContext.getOut().print(theQuoteTranscriptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

