package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScoreUpcIterator theScore = (ScoreUpcIterator)findAncestorWithClass(this, ScoreUpcIterator.class);
			pageContext.getOut().print(theScore.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for upc tag ");
		}
		return SKIP_BODY;
	}
}

