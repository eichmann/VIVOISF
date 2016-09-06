package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IssueTranslatorIterator theIssueTranslatorIterator = (IssueTranslatorIterator)findAncestorWithClass(this, IssueTranslatorIterator.class);
			pageContext.getOut().print(theIssueTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for translator tag ");
		}
		return SKIP_BODY;
	}
}

