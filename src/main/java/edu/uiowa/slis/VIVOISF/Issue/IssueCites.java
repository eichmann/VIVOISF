package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueCites extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueCites currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueCites.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IssueCitesIterator theIssueCitesIterator = (IssueCitesIterator)findAncestorWithClass(this, IssueCitesIterator.class);
			pageContext.getOut().print(theIssueCitesIterator.getCites());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for cites tag ");
		}
		return SKIP_BODY;
	}
}

