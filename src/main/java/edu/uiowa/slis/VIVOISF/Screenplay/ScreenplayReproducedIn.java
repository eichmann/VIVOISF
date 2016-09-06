package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayReproducedIn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayReproducedIn currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayReproducedIn.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScreenplayReproducedInIterator theScreenplayReproducedInIterator = (ScreenplayReproducedInIterator)findAncestorWithClass(this, ScreenplayReproducedInIterator.class);
			pageContext.getOut().print(theScreenplayReproducedInIterator.getReproducedIn());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

