package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BriefOwnerIterator theBriefOwnerIterator = (BriefOwnerIterator)findAncestorWithClass(this, BriefOwnerIterator.class);
			pageContext.getOut().print(theBriefOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for owner tag ");
		}
		return SKIP_BODY;
	}
}

