package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueCitedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueCitedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueCitedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IssueCitedByIterator theIssueCitedByIterator = (IssueCitedByIterator)findAncestorWithClass(this, IssueCitedByIterator.class);
			pageContext.getOut().print(theIssueCitedByIterator.getCitedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

