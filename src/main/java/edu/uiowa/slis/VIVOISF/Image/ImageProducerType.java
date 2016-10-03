package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageProducerIterator theImageProducerIterator = (ImageProducerIterator)findAncestorWithClass(this, ImageProducerIterator.class);
			pageContext.getOut().print(theImageProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for producer tag ");
		}
		return SKIP_BODY;
	}
}

