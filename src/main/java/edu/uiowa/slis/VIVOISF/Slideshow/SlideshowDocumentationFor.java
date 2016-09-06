package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowDocumentationFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowDocumentationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowDocumentationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowDocumentationForIterator theSlideshowDocumentationForIterator = (SlideshowDocumentationForIterator)findAncestorWithClass(this, SlideshowDocumentationForIterator.class);
			pageContext.getOut().print(theSlideshowDocumentationForIterator.getDocumentationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

