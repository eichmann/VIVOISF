package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperEditorIterator theWorkingPaperEditorIterator = (WorkingPaperEditorIterator)findAncestorWithClass(this, WorkingPaperEditorIterator.class);
			pageContext.getOut().print(theWorkingPaperEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for editor tag ");
		}
		return SKIP_BODY;
	}
}

