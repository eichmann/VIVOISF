package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScoreAsinIterator theScore = (ScoreAsinIterator)findAncestorWithClass(this, ScoreAsinIterator.class);
			pageContext.getOut().print(theScore.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for asin tag ");
		}
		return SKIP_BODY;
	}
}

