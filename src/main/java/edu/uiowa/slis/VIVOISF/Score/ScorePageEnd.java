package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScorePageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScorePageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(ScorePageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScorePageEndIterator theScore = (ScorePageEndIterator)findAncestorWithClass(this, ScorePageEndIterator.class);
			pageContext.getOut().print(theScore.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

