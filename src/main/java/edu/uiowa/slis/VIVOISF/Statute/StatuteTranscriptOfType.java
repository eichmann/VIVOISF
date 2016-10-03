package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteTranscriptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteTranscriptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteTranscriptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StatuteTranscriptOfIterator theStatuteTranscriptOfIterator = (StatuteTranscriptOfIterator)findAncestorWithClass(this, StatuteTranscriptOfIterator.class);
			pageContext.getOut().print(theStatuteTranscriptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

