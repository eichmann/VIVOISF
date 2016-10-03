package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BriefLccnIterator theBrief = (BriefLccnIterator)findAncestorWithClass(this, BriefLccnIterator.class);
			pageContext.getOut().print(theBrief.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for lccn tag ");
		}
		return SKIP_BODY;
	}
}

