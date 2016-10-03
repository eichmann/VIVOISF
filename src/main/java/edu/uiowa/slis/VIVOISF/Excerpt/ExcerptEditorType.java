package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExcerptEditorIterator theExcerptEditorIterator = (ExcerptEditorIterator)findAncestorWithClass(this, ExcerptEditorIterator.class);
			pageContext.getOut().print(theExcerptEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for editor tag ");
		}
		return SKIP_BODY;
	}
}

