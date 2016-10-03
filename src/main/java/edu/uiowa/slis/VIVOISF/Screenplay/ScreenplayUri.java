package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayUri currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScreenplayUriIterator theScreenplay = (ScreenplayUriIterator)findAncestorWithClass(this, ScreenplayUriIterator.class);
			pageContext.getOut().print(theScreenplay.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for uri tag ");
		}
		return SKIP_BODY;
	}
}

