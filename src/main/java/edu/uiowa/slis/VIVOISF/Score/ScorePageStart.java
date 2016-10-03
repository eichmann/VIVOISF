package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScorePageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScorePageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(ScorePageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScorePageStartIterator theScore = (ScorePageStartIterator)findAncestorWithClass(this, ScorePageStartIterator.class);
			pageContext.getOut().print(theScore.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

