package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IssueEanucc13Iterator theIssue = (IssueEanucc13Iterator)findAncestorWithClass(this, IssueEanucc13Iterator.class);
			pageContext.getOut().print(theIssue.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

