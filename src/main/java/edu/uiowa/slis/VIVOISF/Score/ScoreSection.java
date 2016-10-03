package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreSection currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScoreSectionIterator theScore = (ScoreSectionIterator)findAncestorWithClass(this, ScoreSectionIterator.class);
			pageContext.getOut().print(theScore.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for section tag ");
		}
		return SKIP_BODY;
	}
}

