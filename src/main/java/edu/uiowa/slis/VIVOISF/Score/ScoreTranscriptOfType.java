package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreTranscriptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreTranscriptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreTranscriptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScoreTranscriptOfIterator theScoreTranscriptOfIterator = (ScoreTranscriptOfIterator)findAncestorWithClass(this, ScoreTranscriptOfIterator.class);
			pageContext.getOut().print(theScoreTranscriptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

