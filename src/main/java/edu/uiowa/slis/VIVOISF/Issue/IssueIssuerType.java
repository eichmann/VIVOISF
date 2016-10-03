package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IssueIssuerIterator theIssueIssuerIterator = (IssueIssuerIterator)findAncestorWithClass(this, IssueIssuerIterator.class);
			pageContext.getOut().print(theIssueIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for issuer tag ");
		}
		return SKIP_BODY;
	}
}

