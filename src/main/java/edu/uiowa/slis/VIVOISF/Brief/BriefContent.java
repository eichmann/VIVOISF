package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefContent currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BriefContentIterator theBrief = (BriefContentIterator)findAncestorWithClass(this, BriefContentIterator.class);
			pageContext.getOut().print(theBrief.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for content tag ");
		}
		return SKIP_BODY;
	}
}

