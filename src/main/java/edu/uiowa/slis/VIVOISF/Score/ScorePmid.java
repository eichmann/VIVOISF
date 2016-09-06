package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScorePmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScorePmid currentInstance = null;
	private static final Log log = LogFactory.getLog(ScorePmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScorePmidIterator theScore = (ScorePmidIterator)findAncestorWithClass(this, ScorePmidIterator.class);
			pageContext.getOut().print(theScore.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for pmid tag ");
		}
		return SKIP_BODY;
	}
}

