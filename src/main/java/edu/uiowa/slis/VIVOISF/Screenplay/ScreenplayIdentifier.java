package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScreenplayIdentifierIterator theScreenplay = (ScreenplayIdentifierIterator)findAncestorWithClass(this, ScreenplayIdentifierIterator.class);
			pageContext.getOut().print(theScreenplay.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for identifier tag ");
		}
		return SKIP_BODY;
	}
}

