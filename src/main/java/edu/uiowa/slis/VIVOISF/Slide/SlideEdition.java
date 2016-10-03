package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideEditionIterator theSlide = (SlideEditionIterator)findAncestorWithClass(this, SlideEditionIterator.class);
			pageContext.getOut().print(theSlide.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for edition tag ");
		}
		return SKIP_BODY;
	}
}

