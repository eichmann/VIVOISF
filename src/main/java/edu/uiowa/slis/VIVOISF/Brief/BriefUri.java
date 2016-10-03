package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefUri currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BriefUriIterator theBrief = (BriefUriIterator)findAncestorWithClass(this, BriefUriIterator.class);
			pageContext.getOut().print(theBrief.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for uri tag ");
		}
		return SKIP_BODY;
	}
}

