package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScreenplayOclcnumIterator theScreenplay = (ScreenplayOclcnumIterator)findAncestorWithClass(this, ScreenplayOclcnumIterator.class);
			pageContext.getOut().print(theScreenplay.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

