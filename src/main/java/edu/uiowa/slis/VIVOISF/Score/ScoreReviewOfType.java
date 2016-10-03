package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScoreReviewOfIterator theScoreReviewOfIterator = (ScoreReviewOfIterator)findAncestorWithClass(this, ScoreReviewOfIterator.class);
			pageContext.getOut().print(theScoreReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

