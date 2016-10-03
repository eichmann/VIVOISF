package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideIsbn10Iterator theSlide = (SlideIsbn10Iterator)findAncestorWithClass(this, SlideIsbn10Iterator.class);
			pageContext.getOut().print(theSlide.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

