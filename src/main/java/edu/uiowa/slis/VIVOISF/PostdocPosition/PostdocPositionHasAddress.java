package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionHasAddressIterator thePostdocPositionHasAddressIterator = (PostdocPositionHasAddressIterator)findAncestorWithClass(this, PostdocPositionHasAddressIterator.class);
			pageContext.getOut().print(thePostdocPositionHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

