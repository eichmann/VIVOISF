package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BriefGtin14Iterator theBrief = (BriefGtin14Iterator)findAncestorWithClass(this, BriefGtin14Iterator.class);
			pageContext.getOut().print(theBrief.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

