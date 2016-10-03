package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScorePages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScorePages currentInstance = null;
	private static final Log log = LogFactory.getLog(ScorePages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScorePagesIterator theScore = (ScorePagesIterator)findAncestorWithClass(this, ScorePagesIterator.class);
			pageContext.getOut().print(theScore.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for pages tag ");
		}
		return SKIP_BODY;
	}
}

