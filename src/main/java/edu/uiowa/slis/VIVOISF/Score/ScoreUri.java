package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreUri currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScoreUriIterator theScore = (ScoreUriIterator)findAncestorWithClass(this, ScoreUriIterator.class);
			pageContext.getOut().print(theScore.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for uri tag ");
		}
		return SKIP_BODY;
	}
}

