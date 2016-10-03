package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BriefNumberIterator theBrief = (BriefNumberIterator)findAncestorWithClass(this, BriefNumberIterator.class);
			pageContext.getOut().print(theBrief.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for number tag ");
		}
		return SKIP_BODY;
	}
}

