package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideTheAbstractIterator theSlide = (SlideTheAbstractIterator)findAncestorWithClass(this, SlideTheAbstractIterator.class);
			pageContext.getOut().print(theSlide.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

