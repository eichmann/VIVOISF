package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScreenplayShortDescriptionIterator theScreenplay = (ScreenplayShortDescriptionIterator)findAncestorWithClass(this, ScreenplayShortDescriptionIterator.class);
			pageContext.getOut().print(theScreenplay.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

