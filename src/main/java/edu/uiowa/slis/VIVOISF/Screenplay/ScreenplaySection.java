package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplaySection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplaySection currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplaySection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScreenplaySectionIterator theScreenplay = (ScreenplaySectionIterator)findAncestorWithClass(this, ScreenplaySectionIterator.class);
			pageContext.getOut().print(theScreenplay.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for section tag ");
		}
		return SKIP_BODY;
	}
}

