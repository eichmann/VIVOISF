package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IssueDistributorIterator theIssueDistributorIterator = (IssueDistributorIterator)findAncestorWithClass(this, IssueDistributorIterator.class);
			pageContext.getOut().print(theIssueDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for distributor tag ");
		}
		return SKIP_BODY;
	}
}

