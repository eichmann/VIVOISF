package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideTranslatorIterator theSlideTranslatorIterator = (SlideTranslatorIterator)findAncestorWithClass(this, SlideTranslatorIterator.class);
			pageContext.getOut().print(theSlideTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for translator tag ");
		}
		return SKIP_BODY;
	}
}

