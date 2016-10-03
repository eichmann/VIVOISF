package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScreenplayOwnerIterator theScreenplayOwnerIterator = (ScreenplayOwnerIterator)findAncestorWithClass(this, ScreenplayOwnerIterator.class);
			pageContext.getOut().print(theScreenplayOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for owner tag ");
		}
		return SKIP_BODY;
	}
}

