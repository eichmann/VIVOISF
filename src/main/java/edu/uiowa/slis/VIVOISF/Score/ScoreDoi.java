package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScoreDoiIterator theScore = (ScoreDoiIterator)findAncestorWithClass(this, ScoreDoiIterator.class);
			pageContext.getOut().print(theScore.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for doi tag ");
		}
		return SKIP_BODY;
	}
}

