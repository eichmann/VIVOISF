package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueSici currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IssueSiciIterator theIssue = (IssueSiciIterator)findAncestorWithClass(this, IssueSiciIterator.class);
			pageContext.getOut().print(theIssue.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for sici tag ");
		}
		return SKIP_BODY;
	}
}

