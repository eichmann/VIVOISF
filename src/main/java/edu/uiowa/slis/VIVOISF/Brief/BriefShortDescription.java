package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BriefShortDescriptionIterator theBrief = (BriefShortDescriptionIterator)findAncestorWithClass(this, BriefShortDescriptionIterator.class);
			pageContext.getOut().print(theBrief.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

