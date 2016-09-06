package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssuePmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssuePmid currentInstance = null;
	private static final Log log = LogFactory.getLog(IssuePmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IssuePmidIterator theIssue = (IssuePmidIterator)findAncestorWithClass(this, IssuePmidIterator.class);
			pageContext.getOut().print(theIssue.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for pmid tag ");
		}
		return SKIP_BODY;
	}
}

