package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayPresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayPresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayPresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScreenplayPresentedAtIterator theScreenplayPresentedAtIterator = (ScreenplayPresentedAtIterator)findAncestorWithClass(this, ScreenplayPresentedAtIterator.class);
			pageContext.getOut().print(theScreenplayPresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

