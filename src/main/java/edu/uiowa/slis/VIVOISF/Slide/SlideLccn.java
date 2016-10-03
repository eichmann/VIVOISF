package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideLccnIterator theSlide = (SlideLccnIterator)findAncestorWithClass(this, SlideLccnIterator.class);
			pageContext.getOut().print(theSlide.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for lccn tag ");
		}
		return SKIP_BODY;
	}
}

