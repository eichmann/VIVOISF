package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualEditorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualEditorList currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualEditorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManualEditorListIterator theManualEditorListIterator = (ManualEditorListIterator)findAncestorWithClass(this, ManualEditorListIterator.class);
			pageContext.getOut().print(theManualEditorListIterator.getEditorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for editorList tag ");
		}
		return SKIP_BODY;
	}
}

