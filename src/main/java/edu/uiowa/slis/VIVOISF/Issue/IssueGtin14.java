package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IssueGtin14Iterator theIssue = (IssueGtin14Iterator)findAncestorWithClass(this, IssueGtin14Iterator.class);
			pageContext.getOut().print(theIssue.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

