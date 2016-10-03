package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScoreNumPagesIterator theScore = (ScoreNumPagesIterator)findAncestorWithClass(this, ScoreNumPagesIterator.class);
			pageContext.getOut().print(theScore.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for numPages tag ");
		}
		return SKIP_BODY;
	}
}

