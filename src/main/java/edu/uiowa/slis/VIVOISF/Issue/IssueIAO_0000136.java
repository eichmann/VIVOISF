package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IssueIAO_0000136Iterator theIssueIAO_0000136Iterator = (IssueIAO_0000136Iterator)findAncestorWithClass(this, IssueIAO_0000136Iterator.class);
			pageContext.getOut().print(theIssueIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

