package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScreenplayNumPagesIterator theScreenplay = (ScreenplayNumPagesIterator)findAncestorWithClass(this, ScreenplayNumPagesIterator.class);
			pageContext.getOut().print(theScreenplay.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for numPages tag ");
		}
		return SKIP_BODY;
	}
}

