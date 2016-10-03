package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreReviewOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreReviewOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreReviewOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScoreReviewOfIterator theScoreReviewOfIterator = (ScoreReviewOfIterator)findAncestorWithClass(this, ScoreReviewOfIterator.class);
			pageContext.getOut().print(theScoreReviewOfIterator.getReviewOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

