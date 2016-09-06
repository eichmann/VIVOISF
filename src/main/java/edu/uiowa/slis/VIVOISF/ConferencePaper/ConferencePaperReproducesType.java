package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperReproducesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperReproducesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperReproducesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperReproducesIterator theConferencePaperReproducesIterator = (ConferencePaperReproducesIterator)findAncestorWithClass(this, ConferencePaperReproducesIterator.class);
			pageContext.getOut().print(theConferencePaperReproducesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

