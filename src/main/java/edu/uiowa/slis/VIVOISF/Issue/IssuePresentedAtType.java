package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssuePresentedAtType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssuePresentedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(IssuePresentedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IssuePresentedAtIterator theIssuePresentedAtIterator = (IssuePresentedAtIterator)findAncestorWithClass(this, IssuePresentedAtIterator.class);
			pageContext.getOut().print(theIssuePresentedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

