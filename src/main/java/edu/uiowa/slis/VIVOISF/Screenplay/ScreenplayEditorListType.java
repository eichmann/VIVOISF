package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayEditorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayEditorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayEditorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScreenplayEditorListIterator theScreenplayEditorListIterator = (ScreenplayEditorListIterator)findAncestorWithClass(this, ScreenplayEditorListIterator.class);
			pageContext.getOut().print(theScreenplayEditorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for editorList tag ");
		}
		return SKIP_BODY;
	}
}

