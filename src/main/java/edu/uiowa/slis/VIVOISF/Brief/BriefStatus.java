package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BriefStatusIterator theBriefStatusIterator = (BriefStatusIterator)findAncestorWithClass(this, BriefStatusIterator.class);
			pageContext.getOut().print(theBriefStatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for status tag ");
		}
		return SKIP_BODY;
	}
}

