package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptReproducesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptReproducesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptReproducesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExcerptReproducesIterator theExcerptReproducesIterator = (ExcerptReproducesIterator)findAncestorWithClass(this, ExcerptReproducesIterator.class);
			pageContext.getOut().print(theExcerptReproducesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

