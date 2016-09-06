package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScreenplayStatusIterator theScreenplayStatusIterator = (ScreenplayStatusIterator)findAncestorWithClass(this, ScreenplayStatusIterator.class);
			pageContext.getOut().print(theScreenplayStatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for status tag ");
		}
		return SKIP_BODY;
	}
}

