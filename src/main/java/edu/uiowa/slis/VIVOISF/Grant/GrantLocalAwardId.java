package edu.uiowa.slis.VIVOISF.Grant;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GrantLocalAwardId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GrantLocalAwardId currentInstance = null;
	private static final Log log = LogFactory.getLog(GrantLocalAwardId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GrantLocalAwardIdIterator theGrant = (GrantLocalAwardIdIterator)findAncestorWithClass(this, GrantLocalAwardIdIterator.class);
			pageContext.getOut().print(theGrant.getLocalAwardId());
		} catch (Exception e) {
			log.error("Can't find enclosing Grant for localAwardId tag ", e);
			throw new JspTagException("Error: Can't find enclosing Grant for localAwardId tag ");
		}
		return SKIP_BODY;
	}
}

