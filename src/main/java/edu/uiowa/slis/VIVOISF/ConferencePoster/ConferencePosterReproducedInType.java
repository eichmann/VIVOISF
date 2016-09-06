package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterReproducedInIterator theConferencePosterReproducedInIterator = (ConferencePosterReproducedInIterator)findAncestorWithClass(this, ConferencePosterReproducedInIterator.class);
			pageContext.getOut().print(theConferencePosterReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

