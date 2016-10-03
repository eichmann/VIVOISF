package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IssueEditorIterator theIssueEditorIterator = (IssueEditorIterator)findAncestorWithClass(this, IssueEditorIterator.class);
			pageContext.getOut().print(theIssueEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for editor tag ");
		}
		return SKIP_BODY;
	}
}

