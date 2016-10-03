package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideIsbn13Iterator theSlide = (SlideIsbn13Iterator)findAncestorWithClass(this, SlideIsbn13Iterator.class);
			pageContext.getOut().print(theSlide.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

