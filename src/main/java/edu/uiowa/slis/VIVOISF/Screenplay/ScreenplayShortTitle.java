package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScreenplayShortTitleIterator theScreenplay = (ScreenplayShortTitleIterator)findAncestorWithClass(this, ScreenplayShortTitleIterator.class);
			pageContext.getOut().print(theScreenplay.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

