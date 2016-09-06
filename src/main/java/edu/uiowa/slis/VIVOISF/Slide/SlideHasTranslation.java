package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideHasTranslation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideHasTranslation currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideHasTranslation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideHasTranslationIterator theSlideHasTranslationIterator = (SlideHasTranslationIterator)findAncestorWithClass(this, SlideHasTranslationIterator.class);
			pageContext.getOut().print(theSlideHasTranslationIterator.getHasTranslation());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

