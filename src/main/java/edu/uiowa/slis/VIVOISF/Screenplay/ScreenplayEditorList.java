package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayEditorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayEditorList currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayEditorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScreenplayEditorListIterator theScreenplayEditorListIterator = (ScreenplayEditorListIterator)findAncestorWithClass(this, ScreenplayEditorListIterator.class);
			pageContext.getOut().print(theScreenplayEditorListIterator.getEditorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for editorList tag ");
		}
		return SKIP_BODY;
	}
}

