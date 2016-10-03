package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualEditorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualEditorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualEditorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManualEditorListIterator theManualEditorListIterator = (ManualEditorListIterator)findAncestorWithClass(this, ManualEditorListIterator.class);
			pageContext.getOut().print(theManualEditorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for editorList tag ");
		}
		return SKIP_BODY;
	}
}

