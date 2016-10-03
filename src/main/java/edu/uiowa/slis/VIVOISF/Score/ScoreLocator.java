package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScoreLocatorIterator theScore = (ScoreLocatorIterator)findAncestorWithClass(this, ScoreLocatorIterator.class);
			pageContext.getOut().print(theScore.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for locator tag ");
		}
		return SKIP_BODY;
	}
}

