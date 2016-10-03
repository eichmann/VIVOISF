package edu.uiowa.slis.VIVOISF.MultiVolumeBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultiVolumeBookLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MultiVolumeBookLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(MultiVolumeBookLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MultiVolumeBookLccnIterator theMultiVolumeBook = (MultiVolumeBookLccnIterator)findAncestorWithClass(this, MultiVolumeBookLccnIterator.class);
			pageContext.getOut().print(theMultiVolumeBook.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing MultiVolumeBook for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for lccn tag ");
		}
		return SKIP_BODY;
	}
}

