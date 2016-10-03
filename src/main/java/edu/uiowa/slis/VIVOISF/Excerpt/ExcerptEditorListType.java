package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptEditorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptEditorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptEditorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExcerptEditorListIterator theExcerptEditorListIterator = (ExcerptEditorListIterator)findAncestorWithClass(this, ExcerptEditorListIterator.class);
			pageContext.getOut().print(theExcerptEditorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for editorList tag ");
		}
		return SKIP_BODY;
	}
}

