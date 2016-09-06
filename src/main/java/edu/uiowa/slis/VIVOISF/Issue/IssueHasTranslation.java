package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueHasTranslation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueHasTranslation currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueHasTranslation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IssueHasTranslationIterator theIssueHasTranslationIterator = (IssueHasTranslationIterator)findAncestorWithClass(this, IssueHasTranslationIterator.class);
			pageContext.getOut().print(theIssueHasTranslationIterator.getHasTranslation());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

