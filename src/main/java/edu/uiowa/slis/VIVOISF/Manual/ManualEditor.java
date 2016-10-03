package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManualEditorIterator theManualEditorIterator = (ManualEditorIterator)findAncestorWithClass(this, ManualEditorIterator.class);
			pageContext.getOut().print(theManualEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for editor tag ");
		}
		return SKIP_BODY;
	}
}

