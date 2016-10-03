package edu.uiowa.slis.VIVOISF.MultiVolumeBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultiVolumeBookCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MultiVolumeBookCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(MultiVolumeBookCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MultiVolumeBookCodenIterator theMultiVolumeBook = (MultiVolumeBookCodenIterator)findAncestorWithClass(this, MultiVolumeBookCodenIterator.class);
			pageContext.getOut().print(theMultiVolumeBook.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing MultiVolumeBook for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for coden tag ");
		}
		return SKIP_BODY;
	}
}

