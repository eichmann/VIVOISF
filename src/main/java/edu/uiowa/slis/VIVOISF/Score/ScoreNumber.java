package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScoreNumberIterator theScore = (ScoreNumberIterator)findAncestorWithClass(this, ScoreNumberIterator.class);
			pageContext.getOut().print(theScore.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for number tag ");
		}
		return SKIP_BODY;
	}
}

