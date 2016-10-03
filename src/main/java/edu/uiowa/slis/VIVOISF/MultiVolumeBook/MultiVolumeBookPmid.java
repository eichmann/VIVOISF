package edu.uiowa.slis.VIVOISF.MultiVolumeBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultiVolumeBookPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MultiVolumeBookPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(MultiVolumeBookPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MultiVolumeBookPmidIterator theMultiVolumeBook = (MultiVolumeBookPmidIterator)findAncestorWithClass(this, MultiVolumeBookPmidIterator.class);
			pageContext.getOut().print(theMultiVolumeBook.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing MultiVolumeBook for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for pmid tag ");
		}
		return SKIP_BODY;
	}
}

