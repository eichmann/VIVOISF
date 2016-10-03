package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScreenplayHandleIterator theScreenplay = (ScreenplayHandleIterator)findAncestorWithClass(this, ScreenplayHandleIterator.class);
			pageContext.getOut().print(theScreenplay.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for handle tag ");
		}
		return SKIP_BODY;
	}
}

