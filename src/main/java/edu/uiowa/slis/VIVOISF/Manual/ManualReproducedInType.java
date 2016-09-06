package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManualReproducedInIterator theManualReproducedInIterator = (ManualReproducedInIterator)findAncestorWithClass(this, ManualReproducedInIterator.class);
			pageContext.getOut().print(theManualReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

