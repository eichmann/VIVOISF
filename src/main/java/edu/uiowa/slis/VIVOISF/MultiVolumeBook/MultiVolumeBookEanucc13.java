package edu.uiowa.slis.VIVOISF.MultiVolumeBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultiVolumeBookEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MultiVolumeBookEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(MultiVolumeBookEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MultiVolumeBookEanucc13Iterator theMultiVolumeBook = (MultiVolumeBookEanucc13Iterator)findAncestorWithClass(this, MultiVolumeBookEanucc13Iterator.class);
			pageContext.getOut().print(theMultiVolumeBook.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing MultiVolumeBook for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

