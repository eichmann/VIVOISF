package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScreenplayDoiIterator theScreenplay = (ScreenplayDoiIterator)findAncestorWithClass(this, ScreenplayDoiIterator.class);
			pageContext.getOut().print(theScreenplay.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for doi tag ");
		}
		return SKIP_BODY;
	}
}

