package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterReproducesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterReproducesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterReproducesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterReproducesIterator theConferencePosterReproducesIterator = (ConferencePosterReproducesIterator)findAncestorWithClass(this, ConferencePosterReproducesIterator.class);
			pageContext.getOut().print(theConferencePosterReproducesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

