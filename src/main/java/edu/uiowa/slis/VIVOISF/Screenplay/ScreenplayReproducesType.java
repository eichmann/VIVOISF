package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayReproducesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayReproducesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayReproducesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScreenplayReproducesIterator theScreenplayReproducesIterator = (ScreenplayReproducesIterator)findAncestorWithClass(this, ScreenplayReproducesIterator.class);
			pageContext.getOut().print(theScreenplayReproducesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

