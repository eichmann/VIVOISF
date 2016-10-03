package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScoreOclcnumIterator theScore = (ScoreOclcnumIterator)findAncestorWithClass(this, ScoreOclcnumIterator.class);
			pageContext.getOut().print(theScore.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

