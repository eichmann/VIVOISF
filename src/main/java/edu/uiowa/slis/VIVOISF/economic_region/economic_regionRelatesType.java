package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			economic_regionRelatesIterator theeconomic_regionRelatesIterator = (economic_regionRelatesIterator)findAncestorWithClass(this, economic_regionRelatesIterator.class);
			pageContext.getOut().print(theeconomic_regionRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for relates tag ");
		}
		return SKIP_BODY;
	}
}

