package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowHasTelephoneType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowHasTelephoneType currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowHasTelephoneType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowHasTelephoneIterator theSlideshowHasTelephoneIterator = (SlideshowHasTelephoneIterator)findAncestorWithClass(this, SlideshowHasTelephoneIterator.class);
			pageContext.getOut().print(theSlideshowHasTelephoneIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

