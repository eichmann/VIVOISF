package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreCitedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreCitedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreCitedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScoreCitedByIterator theScoreCitedByIterator = (ScoreCitedByIterator)findAncestorWithClass(this, ScoreCitedByIterator.class);
			pageContext.getOut().print(theScoreCitedByIterator.getCitedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

