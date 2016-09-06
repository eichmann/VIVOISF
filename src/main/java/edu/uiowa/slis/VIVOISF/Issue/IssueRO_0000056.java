package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IssueRO_0000056Iterator theIssueRO_0000056Iterator = (IssueRO_0000056Iterator)findAncestorWithClass(this, IssueRO_0000056Iterator.class);
			pageContext.getOut().print(theIssueRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

