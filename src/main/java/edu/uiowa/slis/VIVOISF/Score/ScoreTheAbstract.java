package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScoreTheAbstractIterator theScore = (ScoreTheAbstractIterator)findAncestorWithClass(this, ScoreTheAbstractIterator.class);
			pageContext.getOut().print(theScore.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

