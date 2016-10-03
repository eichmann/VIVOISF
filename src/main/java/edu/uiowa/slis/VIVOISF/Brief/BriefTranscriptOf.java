package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BriefTranscriptOfIterator theBriefTranscriptOfIterator = (BriefTranscriptOfIterator)findAncestorWithClass(this, BriefTranscriptOfIterator.class);
			pageContext.getOut().print(theBriefTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

