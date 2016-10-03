package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScreenplayLccnIterator theScreenplay = (ScreenplayLccnIterator)findAncestorWithClass(this, ScreenplayLccnIterator.class);
			pageContext.getOut().print(theScreenplay.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for lccn tag ");
		}
		return SKIP_BODY;
	}
}

