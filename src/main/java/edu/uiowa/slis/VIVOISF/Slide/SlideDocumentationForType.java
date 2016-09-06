package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideDocumentationForIterator theSlideDocumentationForIterator = (SlideDocumentationForIterator)findAncestorWithClass(this, SlideDocumentationForIterator.class);
			pageContext.getOut().print(theSlideDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

