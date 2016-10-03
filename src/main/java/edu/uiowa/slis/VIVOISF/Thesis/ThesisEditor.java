package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisEditorIterator theThesisEditorIterator = (ThesisEditorIterator)findAncestorWithClass(this, ThesisEditorIterator.class);
			pageContext.getOut().print(theThesisEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for editor tag ");
		}
		return SKIP_BODY;
	}
}

