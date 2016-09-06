package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IssueReproducedInIterator theIssueReproducedInIterator = (IssueReproducedInIterator)findAncestorWithClass(this, IssueReproducedInIterator.class);
			pageContext.getOut().print(theIssueReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

