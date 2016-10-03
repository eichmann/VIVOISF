package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayContent currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScreenplayContentIterator theScreenplay = (ScreenplayContentIterator)findAncestorWithClass(this, ScreenplayContentIterator.class);
			pageContext.getOut().print(theScreenplay.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for content tag ");
		}
		return SKIP_BODY;
	}
}

