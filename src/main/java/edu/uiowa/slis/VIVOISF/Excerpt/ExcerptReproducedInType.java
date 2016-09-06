package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExcerptReproducedInIterator theExcerptReproducedInIterator = (ExcerptReproducedInIterator)findAncestorWithClass(this, ExcerptReproducedInIterator.class);
			pageContext.getOut().print(theExcerptReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

