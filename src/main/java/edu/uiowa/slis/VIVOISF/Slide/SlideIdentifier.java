package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideIdentifierIterator theSlide = (SlideIdentifierIterator)findAncestorWithClass(this, SlideIdentifierIterator.class);
			pageContext.getOut().print(theSlide.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for identifier tag ");
		}
		return SKIP_BODY;
	}
}

