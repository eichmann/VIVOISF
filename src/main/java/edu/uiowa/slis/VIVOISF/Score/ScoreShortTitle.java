package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScoreShortTitleIterator theScore = (ScoreShortTitleIterator)findAncestorWithClass(this, ScoreShortTitleIterator.class);
			pageContext.getOut().print(theScore.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

