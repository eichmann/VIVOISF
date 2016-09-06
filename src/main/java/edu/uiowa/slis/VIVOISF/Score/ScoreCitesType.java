package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScoreCitesIterator theScoreCitesIterator = (ScoreCitesIterator)findAncestorWithClass(this, ScoreCitesIterator.class);
			pageContext.getOut().print(theScoreCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for cites tag ");
		}
		return SKIP_BODY;
	}
}

