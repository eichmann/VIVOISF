package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScoreCodenIterator theScore = (ScoreCodenIterator)findAncestorWithClass(this, ScoreCodenIterator.class);
			pageContext.getOut().print(theScore.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for coden tag ");
		}
		return SKIP_BODY;
	}
}

