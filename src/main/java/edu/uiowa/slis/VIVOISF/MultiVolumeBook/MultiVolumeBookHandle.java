package edu.uiowa.slis.VIVOISF.MultiVolumeBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultiVolumeBookHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MultiVolumeBookHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(MultiVolumeBookHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MultiVolumeBookHandleIterator theMultiVolumeBook = (MultiVolumeBookHandleIterator)findAncestorWithClass(this, MultiVolumeBookHandleIterator.class);
			pageContext.getOut().print(theMultiVolumeBook.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing MultiVolumeBook for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for handle tag ");
		}
		return SKIP_BODY;
	}
}

