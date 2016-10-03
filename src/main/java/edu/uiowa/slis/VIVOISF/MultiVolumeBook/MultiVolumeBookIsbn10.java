package edu.uiowa.slis.VIVOISF.MultiVolumeBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultiVolumeBookIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MultiVolumeBookIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(MultiVolumeBookIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MultiVolumeBookIsbn10Iterator theMultiVolumeBook = (MultiVolumeBookIsbn10Iterator)findAncestorWithClass(this, MultiVolumeBookIsbn10Iterator.class);
			pageContext.getOut().print(theMultiVolumeBook.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing MultiVolumeBook for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

