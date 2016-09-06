package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BriefDoiIterator theBrief = (BriefDoiIterator)findAncestorWithClass(this, BriefDoiIterator.class);
			pageContext.getOut().print(theBrief.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for doi tag ");
		}
		return SKIP_BODY;
	}
}

