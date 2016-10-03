package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisEditorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisEditorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisEditorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisEditorListIterator theThesisEditorListIterator = (ThesisEditorListIterator)findAncestorWithClass(this, ThesisEditorListIterator.class);
			pageContext.getOut().print(theThesisEditorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for editorList tag ");
		}
		return SKIP_BODY;
	}
}

