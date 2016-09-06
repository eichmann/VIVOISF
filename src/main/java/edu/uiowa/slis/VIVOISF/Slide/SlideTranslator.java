package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideTranslatorIterator theSlideTranslatorIterator = (SlideTranslatorIterator)findAncestorWithClass(this, SlideTranslatorIterator.class);
			pageContext.getOut().print(theSlideTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for translator tag ");
		}
		return SKIP_BODY;
	}
}

