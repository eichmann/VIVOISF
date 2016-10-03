package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScreenplayPageStartIterator theScreenplay = (ScreenplayPageStartIterator)findAncestorWithClass(this, ScreenplayPageStartIterator.class);
			pageContext.getOut().print(theScreenplay.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

