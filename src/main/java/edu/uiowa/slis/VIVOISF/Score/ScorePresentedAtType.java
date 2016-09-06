package edu.uiowa.slis.VIVOISF.Score;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScorePresentedAtType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScorePresentedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(ScorePresentedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScorePresentedAtIterator theScorePresentedAtIterator = (ScorePresentedAtIterator)findAncestorWithClass(this, ScorePresentedAtIterator.class);
			pageContext.getOut().print(theScorePresentedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Score for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Score for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

