package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManualEditorIterator theManualEditorIterator = (ManualEditorIterator)findAncestorWithClass(this, ManualEditorIterator.class);
			pageContext.getOut().print(theManualEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for editor tag ");
		}
		return SKIP_BODY;
	}
}

