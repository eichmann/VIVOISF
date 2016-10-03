package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScreenplayCodenIterator theScreenplay = (ScreenplayCodenIterator)findAncestorWithClass(this, ScreenplayCodenIterator.class);
			pageContext.getOut().print(theScreenplay.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for coden tag ");
		}
		return SKIP_BODY;
	}
}

