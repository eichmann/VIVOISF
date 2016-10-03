package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterOwnerIterator theConferencePosterOwnerIterator = (ConferencePosterOwnerIterator)findAncestorWithClass(this, ConferencePosterOwnerIterator.class);
			pageContext.getOut().print(theConferencePosterOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for owner tag ");
		}
		return SKIP_BODY;
	}
}

