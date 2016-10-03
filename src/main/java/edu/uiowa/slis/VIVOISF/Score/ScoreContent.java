package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreContent currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScoreContentIterator theScore = (ScoreContentIterator)findAncestorWithClass(this, ScoreContentIterator.class);
			pageContext.getOut().print(theScore.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for content tag ");
		}
		return SKIP_BODY;
	}
}

