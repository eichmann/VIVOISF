package edu.uiowa.slis.VIVOISF.MultiVolumeBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultiVolumeBookSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MultiVolumeBookSici currentInstance = null;
	private static final Log log = LogFactory.getLog(MultiVolumeBookSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MultiVolumeBookSiciIterator theMultiVolumeBook = (MultiVolumeBookSiciIterator)findAncestorWithClass(this, MultiVolumeBookSiciIterator.class);
			pageContext.getOut().print(theMultiVolumeBook.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing MultiVolumeBook for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for sici tag ");
		}
		return SKIP_BODY;
	}
}

