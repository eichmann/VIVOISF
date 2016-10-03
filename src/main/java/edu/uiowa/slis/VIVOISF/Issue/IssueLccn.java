package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IssueLccnIterator theIssue = (IssueLccnIterator)findAncestorWithClass(this, IssueLccnIterator.class);
			pageContext.getOut().print(theIssue.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for lccn tag ");
		}
		return SKIP_BODY;
	}
}

