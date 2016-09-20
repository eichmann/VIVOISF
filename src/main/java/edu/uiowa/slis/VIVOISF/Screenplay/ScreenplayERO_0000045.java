package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScreenplayERO_0000045Iterator theScreenplay = (ScreenplayERO_0000045Iterator)findAncestorWithClass(this, ScreenplayERO_0000045Iterator.class);
			pageContext.getOut().print(theScreenplay.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

