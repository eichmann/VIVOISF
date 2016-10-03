package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideProducerIterator theSlideProducerIterator = (SlideProducerIterator)findAncestorWithClass(this, SlideProducerIterator.class);
			pageContext.getOut().print(theSlideProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for producer tag ");
		}
		return SKIP_BODY;
	}
}

