package edu.uiowa.slis.VIVOISF.MultiVolumeBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultiVolumeBookUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MultiVolumeBookUri currentInstance = null;
	private static final Log log = LogFactory.getLog(MultiVolumeBookUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MultiVolumeBookUriIterator theMultiVolumeBook = (MultiVolumeBookUriIterator)findAncestorWithClass(this, MultiVolumeBookUriIterator.class);
			pageContext.getOut().print(theMultiVolumeBook.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing MultiVolumeBook for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for uri tag ");
		}
		return SKIP_BODY;
	}
}

