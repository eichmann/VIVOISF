package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LetterReproducedInIterator theLetterReproducedInIterator = (LetterReproducedInIterator)findAncestorWithClass(this, LetterReproducedInIterator.class);
			pageContext.getOut().print(theLetterReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

