package edu.uiowa.slis.VIVOISF.IAO_0000013;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000013ReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000013ReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000013ReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000013ReproducedInIterator theIAO_0000013ReproducedInIterator = (IAO_0000013ReproducedInIterator)findAncestorWithClass(this, IAO_0000013ReproducedInIterator.class);
			pageContext.getOut().print(theIAO_0000013ReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000013 for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000013 for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

