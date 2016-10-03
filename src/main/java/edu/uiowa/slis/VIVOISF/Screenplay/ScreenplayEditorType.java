package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScreenplayEditorIterator theScreenplayEditorIterator = (ScreenplayEditorIterator)findAncestorWithClass(this, ScreenplayEditorIterator.class);
			pageContext.getOut().print(theScreenplayEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for editor tag ");
		}
		return SKIP_BODY;
	}
}

