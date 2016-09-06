package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IssueInformationResourceSupportedByIterator theIssueInformationResourceSupportedByIterator = (IssueInformationResourceSupportedByIterator)findAncestorWithClass(this, IssueInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theIssueInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

