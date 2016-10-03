package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScreenplayPageEndIterator theScreenplay = (ScreenplayPageEndIterator)findAncestorWithClass(this, ScreenplayPageEndIterator.class);
			pageContext.getOut().print(theScreenplay.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

