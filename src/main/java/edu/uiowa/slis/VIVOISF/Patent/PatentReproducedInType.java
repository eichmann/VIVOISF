package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PatentReproducedInIterator thePatentReproducedInIterator = (PatentReproducedInIterator)findAncestorWithClass(this, PatentReproducedInIterator.class);
			pageContext.getOut().print(thePatentReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

