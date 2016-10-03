package edu.uiowa.slis.VIVOISF.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CodeEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CodeEditorIterator theCodeEditorIterator = (CodeEditorIterator)findAncestorWithClass(this, CodeEditorIterator.class);
			pageContext.getOut().print(theCodeEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for editor tag ");
		}
		return SKIP_BODY;
	}
}

