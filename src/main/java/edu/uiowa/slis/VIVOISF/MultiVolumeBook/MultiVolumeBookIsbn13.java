package edu.uiowa.slis.VIVOISF.MultiVolumeBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultiVolumeBookIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MultiVolumeBookIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(MultiVolumeBookIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MultiVolumeBookIsbn13Iterator theMultiVolumeBook = (MultiVolumeBookIsbn13Iterator)findAncestorWithClass(this, MultiVolumeBookIsbn13Iterator.class);
			pageContext.getOut().print(theMultiVolumeBook.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing MultiVolumeBook for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

