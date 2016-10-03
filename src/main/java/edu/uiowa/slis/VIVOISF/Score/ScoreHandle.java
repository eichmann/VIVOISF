package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScoreHandleIterator theScore = (ScoreHandleIterator)findAncestorWithClass(this, ScoreHandleIterator.class);
			pageContext.getOut().print(theScore.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for handle tag ");
		}
		return SKIP_BODY;
	}
}

