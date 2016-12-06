package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionHasAddressIterator thePostdocPositionHasAddressIterator = (PostdocPositionHasAddressIterator)findAncestorWithClass(this, PostdocPositionHasAddressIterator.class);
			pageContext.getOut().print(thePostdocPositionHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

