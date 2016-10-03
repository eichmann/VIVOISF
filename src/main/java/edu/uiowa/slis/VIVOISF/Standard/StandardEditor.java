package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StandardEditorIterator theStandardEditorIterator = (StandardEditorIterator)findAncestorWithClass(this, StandardEditorIterator.class);
			pageContext.getOut().print(theStandardEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for editor tag ");
		}
		return SKIP_BODY;
	}
}

