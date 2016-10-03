package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceTranscriptOfIterator theReferenceSourceTranscriptOfIterator = (ReferenceSourceTranscriptOfIterator)findAncestorWithClass(this, ReferenceSourceTranscriptOfIterator.class);
			pageContext.getOut().print(theReferenceSourceTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

