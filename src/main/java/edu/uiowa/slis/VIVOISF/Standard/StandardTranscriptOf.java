package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StandardTranscriptOfIterator theStandardTranscriptOfIterator = (StandardTranscriptOfIterator)findAncestorWithClass(this, StandardTranscriptOfIterator.class);
			pageContext.getOut().print(theStandardTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

