package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlidePresentedAtType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlidePresentedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(SlidePresentedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlidePresentedAtIterator theSlidePresentedAtIterator = (SlidePresentedAtIterator)findAncestorWithClass(this, SlidePresentedAtIterator.class);
			pageContext.getOut().print(theSlidePresentedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

