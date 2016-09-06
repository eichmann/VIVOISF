package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisReproducesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisReproducesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisReproducesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisReproducesIterator theThesisReproducesIterator = (ThesisReproducesIterator)findAncestorWithClass(this, ThesisReproducesIterator.class);
			pageContext.getOut().print(theThesisReproducesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

