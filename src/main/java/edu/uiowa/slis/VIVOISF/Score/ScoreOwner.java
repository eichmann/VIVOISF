package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScoreOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScoreOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(ScoreOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScoreOwnerIterator theScoreOwnerIterator = (ScoreOwnerIterator)findAncestorWithClass(this, ScoreOwnerIterator.class);
			pageContext.getOut().print(theScoreOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for owner tag ");
		}
		return SKIP_BODY;
	}
}

