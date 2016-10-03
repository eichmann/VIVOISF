package edu.uiowa.slis.VIVOISF.MultiVolumeBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultiVolumeBookGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MultiVolumeBookGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(MultiVolumeBookGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MultiVolumeBookGtin14Iterator theMultiVolumeBook = (MultiVolumeBookGtin14Iterator)findAncestorWithClass(this, MultiVolumeBookGtin14Iterator.class);
			pageContext.getOut().print(theMultiVolumeBook.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing MultiVolumeBook for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

