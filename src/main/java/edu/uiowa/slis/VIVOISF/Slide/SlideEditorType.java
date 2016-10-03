package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideEditorIterator theSlideEditorIterator = (SlideEditorIterator)findAncestorWithClass(this, SlideEditorIterator.class);
			pageContext.getOut().print(theSlideEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for editor tag ");
		}
		return SKIP_BODY;
	}
}

