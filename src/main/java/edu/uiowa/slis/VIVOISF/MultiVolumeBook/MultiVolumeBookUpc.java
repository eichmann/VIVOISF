package edu.uiowa.slis.VIVOISF.MultiVolumeBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultiVolumeBookUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MultiVolumeBookUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(MultiVolumeBookUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MultiVolumeBookUpcIterator theMultiVolumeBook = (MultiVolumeBookUpcIterator)findAncestorWithClass(this, MultiVolumeBookUpcIterator.class);
			pageContext.getOut().print(theMultiVolumeBook.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing MultiVolumeBook for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for upc tag ");
		}
		return SKIP_BODY;
	}
}

