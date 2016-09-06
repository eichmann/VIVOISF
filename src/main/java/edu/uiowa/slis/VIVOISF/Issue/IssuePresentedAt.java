package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssuePresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssuePresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(IssuePresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IssuePresentedAtIterator theIssuePresentedAtIterator = (IssuePresentedAtIterator)findAncestorWithClass(this, IssuePresentedAtIterator.class);
			pageContext.getOut().print(theIssuePresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

