package edu.uiowa.slis.VIVOISF.MultiVolumeBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultiVolumeBookAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MultiVolumeBookAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(MultiVolumeBookAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MultiVolumeBookAsinIterator theMultiVolumeBook = (MultiVolumeBookAsinIterator)findAncestorWithClass(this, MultiVolumeBookAsinIterator.class);
			pageContext.getOut().print(theMultiVolumeBook.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing MultiVolumeBook for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for asin tag ");
		}
		return SKIP_BODY;
	}
}

