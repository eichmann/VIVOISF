package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefEditorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefEditorList currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefEditorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BriefEditorListIterator theBriefEditorListIterator = (BriefEditorListIterator)findAncestorWithClass(this, BriefEditorListIterator.class);
			pageContext.getOut().print(theBriefEditorListIterator.getEditorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for editorList tag ");
		}
		return SKIP_BODY;
	}
}

