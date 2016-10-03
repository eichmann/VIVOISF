package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BriefPageStartIterator theBrief = (BriefPageStartIterator)findAncestorWithClass(this, BriefPageStartIterator.class);
			pageContext.getOut().print(theBrief.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

