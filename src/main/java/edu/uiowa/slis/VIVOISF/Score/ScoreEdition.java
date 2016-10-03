package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScoreEditionIterator theScore = (ScoreEditionIterator)findAncestorWithClass(this, ScoreEditionIterator.class);
			pageContext.getOut().print(theScore.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for edition tag ");
		}
		return SKIP_BODY;
	}
}

