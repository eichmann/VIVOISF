package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScreenplayPmidIterator theScreenplay = (ScreenplayPmidIterator)findAncestorWithClass(this, ScreenplayPmidIterator.class);
			pageContext.getOut().print(theScreenplay.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for pmid tag ");
		}
		return SKIP_BODY;
	}
}

