package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScreenplayUpcIterator theScreenplay = (ScreenplayUpcIterator)findAncestorWithClass(this, ScreenplayUpcIterator.class);
			pageContext.getOut().print(theScreenplay.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for upc tag ");
		}
		return SKIP_BODY;
	}
}

