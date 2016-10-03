package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefPages currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BriefPagesIterator theBrief = (BriefPagesIterator)findAncestorWithClass(this, BriefPagesIterator.class);
			pageContext.getOut().print(theBrief.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for pages tag ");
		}
		return SKIP_BODY;
	}
}

