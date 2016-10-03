package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScreenplayGtin14Iterator theScreenplay = (ScreenplayGtin14Iterator)findAncestorWithClass(this, ScreenplayGtin14Iterator.class);
			pageContext.getOut().print(theScreenplay.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

