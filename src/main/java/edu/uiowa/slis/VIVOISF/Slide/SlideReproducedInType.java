package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideReproducedInIterator theSlideReproducedInIterator = (SlideReproducedInIterator)findAncestorWithClass(this, SlideReproducedInIterator.class);
			pageContext.getOut().print(theSlideReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

