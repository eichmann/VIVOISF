package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BriefShortTitleIterator theBrief = (BriefShortTitleIterator)findAncestorWithClass(this, BriefShortTitleIterator.class);
			pageContext.getOut().print(theBrief.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

