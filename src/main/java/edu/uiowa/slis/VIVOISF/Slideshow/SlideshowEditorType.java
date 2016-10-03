package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowEditorIterator theSlideshowEditorIterator = (SlideshowEditorIterator)findAncestorWithClass(this, SlideshowEditorIterator.class);
			pageContext.getOut().print(theSlideshowEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for editor tag ");
		}
		return SKIP_BODY;
	}
}
