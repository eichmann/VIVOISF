package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefPresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefPresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefPresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BriefPresentedAtIterator theBriefPresentedAtIterator = (BriefPresentedAtIterator)findAncestorWithClass(this, BriefPresentedAtIterator.class);
			pageContext.getOut().print(theBriefPresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

