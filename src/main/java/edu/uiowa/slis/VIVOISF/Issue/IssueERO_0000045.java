package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IssueERO_0000045Iterator theIssue = (IssueERO_0000045Iterator)findAncestorWithClass(this, IssueERO_0000045Iterator.class);
			pageContext.getOut().print(theIssue.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

