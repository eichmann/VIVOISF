package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScreenplayEditionIterator theScreenplay = (ScreenplayEditionIterator)findAncestorWithClass(this, ScreenplayEditionIterator.class);
			pageContext.getOut().print(theScreenplay.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for edition tag ");
		}
		return SKIP_BODY;
	}
}

