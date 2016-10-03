package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreSici currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScoreSiciIterator theScore = (ScoreSiciIterator)findAncestorWithClass(this, ScoreSiciIterator.class);
			pageContext.getOut().print(theScore.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for sici tag ");
		}
		return SKIP_BODY;
	}
}

