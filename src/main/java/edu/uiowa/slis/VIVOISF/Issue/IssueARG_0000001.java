package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IssueARG_0000001Iterator theIssue = (IssueARG_0000001Iterator)findAncestorWithClass(this, IssueARG_0000001Iterator.class);
			pageContext.getOut().print(theIssue.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

