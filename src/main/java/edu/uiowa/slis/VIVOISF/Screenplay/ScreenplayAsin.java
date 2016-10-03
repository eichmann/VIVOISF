package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScreenplayAsinIterator theScreenplay = (ScreenplayAsinIterator)findAncestorWithClass(this, ScreenplayAsinIterator.class);
			pageContext.getOut().print(theScreenplay.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for asin tag ");
		}
		return SKIP_BODY;
	}
}

