package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayPages currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScreenplayPagesIterator theScreenplay = (ScreenplayPagesIterator)findAncestorWithClass(this, ScreenplayPagesIterator.class);
			pageContext.getOut().print(theScreenplay.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for pages tag ");
		}
		return SKIP_BODY;
	}
}

