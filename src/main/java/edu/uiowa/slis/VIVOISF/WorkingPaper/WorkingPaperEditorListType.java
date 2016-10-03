package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperEditorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperEditorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperEditorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperEditorListIterator theWorkingPaperEditorListIterator = (WorkingPaperEditorListIterator)findAncestorWithClass(this, WorkingPaperEditorListIterator.class);
			pageContext.getOut().print(theWorkingPaperEditorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for editorList tag ");
		}
		return SKIP_BODY;
	}
}
