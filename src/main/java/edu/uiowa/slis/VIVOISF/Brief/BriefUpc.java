package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BriefUpcIterator theBrief = (BriefUpcIterator)findAncestorWithClass(this, BriefUpcIterator.class);
			pageContext.getOut().print(theBrief.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for upc tag ");
		}
		return SKIP_BODY;
	}
}

