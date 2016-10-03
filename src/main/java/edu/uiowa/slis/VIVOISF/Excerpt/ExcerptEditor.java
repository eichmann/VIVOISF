package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExcerptEditorIterator theExcerptEditorIterator = (ExcerptEditorIterator)findAncestorWithClass(this, ExcerptEditorIterator.class);
			pageContext.getOut().print(theExcerptEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for editor tag ");
		}
		return SKIP_BODY;
	}
}

