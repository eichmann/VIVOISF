package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueTranslationOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueTranslationOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueTranslationOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IssueTranslationOfIterator theIssueTranslationOfIterator = (IssueTranslationOfIterator)findAncestorWithClass(this, IssueTranslationOfIterator.class);
			pageContext.getOut().print(theIssueTranslationOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

