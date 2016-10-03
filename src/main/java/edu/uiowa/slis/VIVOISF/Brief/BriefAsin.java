package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BriefAsinIterator theBrief = (BriefAsinIterator)findAncestorWithClass(this, BriefAsinIterator.class);
			pageContext.getOut().print(theBrief.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for asin tag ");
		}
		return SKIP_BODY;
	}
}

