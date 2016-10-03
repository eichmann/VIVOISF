package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BriefNumPagesIterator theBrief = (BriefNumPagesIterator)findAncestorWithClass(this, BriefNumPagesIterator.class);
			pageContext.getOut().print(theBrief.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for numPages tag ");
		}
		return SKIP_BODY;
	}
}

