package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScoreStatusIterator theScoreStatusIterator = (ScoreStatusIterator)findAncestorWithClass(this, ScoreStatusIterator.class);
			pageContext.getOut().print(theScoreStatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for status tag ");
		}
		return SKIP_BODY;
	}
}

