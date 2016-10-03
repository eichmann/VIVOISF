package edu.uiowa.slis.VIVOISF.MultiVolumeBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultiVolumeBookDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MultiVolumeBookDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(MultiVolumeBookDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MultiVolumeBookDoiIterator theMultiVolumeBook = (MultiVolumeBookDoiIterator)findAncestorWithClass(this, MultiVolumeBookDoiIterator.class);
			pageContext.getOut().print(theMultiVolumeBook.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing MultiVolumeBook for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for doi tag ");
		}
		return SKIP_BODY;
	}
}

