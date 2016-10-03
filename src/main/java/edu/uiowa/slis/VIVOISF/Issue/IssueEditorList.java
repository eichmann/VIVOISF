package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueEditorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueEditorList currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueEditorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IssueEditorListIterator theIssueEditorListIterator = (IssueEditorListIterator)findAncestorWithClass(this, IssueEditorListIterator.class);
			pageContext.getOut().print(theIssueEditorListIterator.getEditorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for editorList tag ");
		}
		return SKIP_BODY;
	}
}

