package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreCitedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreCitedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreCitedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScoreCitedByIterator theScoreCitedByIterator = (ScoreCitedByIterator)findAncestorWithClass(this, ScoreCitedByIterator.class);
			pageContext.getOut().print(theScoreCitedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

