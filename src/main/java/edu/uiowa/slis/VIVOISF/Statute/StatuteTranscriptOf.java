package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StatuteTranscriptOfIterator theStatuteTranscriptOfIterator = (StatuteTranscriptOfIterator)findAncestorWithClass(this, StatuteTranscriptOfIterator.class);
			pageContext.getOut().print(theStatuteTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

