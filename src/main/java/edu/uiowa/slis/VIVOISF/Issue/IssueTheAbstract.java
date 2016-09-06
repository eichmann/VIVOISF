package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IssueTheAbstractIterator theIssue = (IssueTheAbstractIterator)findAncestorWithClass(this, IssueTheAbstractIterator.class);
			pageContext.getOut().print(theIssue.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

