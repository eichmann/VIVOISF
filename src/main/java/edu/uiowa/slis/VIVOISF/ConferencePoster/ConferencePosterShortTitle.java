package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterShortTitleIterator theConferencePoster = (ConferencePosterShortTitleIterator)findAncestorWithClass(this, ConferencePosterShortTitleIterator.class);
			pageContext.getOut().print(theConferencePoster.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

