package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScreenplayARG_0000001Iterator theScreenplay = (ScreenplayARG_0000001Iterator)findAncestorWithClass(this, ScreenplayARG_0000001Iterator.class);
			pageContext.getOut().print(theScreenplay.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

