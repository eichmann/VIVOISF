package edu.uiowa.slis.VIVOISF.MultiVolumeBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultiVolumeBookOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MultiVolumeBookOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(MultiVolumeBookOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultiVolumeBookOwnerIterator theMultiVolumeBookOwnerIterator = (MultiVolumeBookOwnerIterator)findAncestorWithClass(this, MultiVolumeBookOwnerIterator.class);
			pageContext.getOut().print(theMultiVolumeBookOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing MultiVolumeBook for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for owner tag ");
		}
		return SKIP_BODY;
	}
}

