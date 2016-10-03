package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BriefPageEndIterator theBrief = (BriefPageEndIterator)findAncestorWithClass(this, BriefPageEndIterator.class);
			pageContext.getOut().print(theBrief.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

