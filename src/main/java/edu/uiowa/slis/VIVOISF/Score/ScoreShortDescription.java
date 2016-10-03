package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScoreShortDescriptionIterator theScore = (ScoreShortDescriptionIterator)findAncestorWithClass(this, ScoreShortDescriptionIterator.class);
			pageContext.getOut().print(theScore.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

