package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScreenplayRO_0000056Iterator theScreenplayRO_0000056Iterator = (ScreenplayRO_0000056Iterator)findAncestorWithClass(this, ScreenplayRO_0000056Iterator.class);
			pageContext.getOut().print(theScreenplayRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

