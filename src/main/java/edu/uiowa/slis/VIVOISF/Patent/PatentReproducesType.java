package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentReproducesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentReproducesType currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentReproducesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PatentReproducesIterator thePatentReproducesIterator = (PatentReproducesIterator)findAncestorWithClass(this, PatentReproducesIterator.class);
			pageContext.getOut().print(thePatentReproducesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

