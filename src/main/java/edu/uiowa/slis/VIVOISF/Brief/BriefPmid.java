package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BriefPmidIterator theBrief = (BriefPmidIterator)findAncestorWithClass(this, BriefPmidIterator.class);
			pageContext.getOut().print(theBrief.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for pmid tag ");
		}
		return SKIP_BODY;
	}
}

