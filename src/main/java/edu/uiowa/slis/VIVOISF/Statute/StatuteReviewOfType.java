package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StatuteReviewOfIterator theStatuteReviewOfIterator = (StatuteReviewOfIterator)findAncestorWithClass(this, StatuteReviewOfIterator.class);
			pageContext.getOut().print(theStatuteReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

