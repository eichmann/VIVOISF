package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterReproduces extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterReproduces currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterReproduces.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LetterReproducesIterator theLetterReproducesIterator = (LetterReproducesIterator)findAncestorWithClass(this, LetterReproducesIterator.class);
			pageContext.getOut().print(theLetterReproducesIterator.getReproduces());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

