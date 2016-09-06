package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionIsSuccessorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionIsSuccessorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionIsSuccessorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			economic_regionIsSuccessorOfIterator theeconomic_regionIsSuccessorOfIterator = (economic_regionIsSuccessorOfIterator)findAncestorWithClass(this, economic_regionIsSuccessorOfIterator.class);
			pageContext.getOut().print(theeconomic_regionIsSuccessorOfIterator.getIsSuccessorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for isSuccessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for isSuccessorOf tag ");
		}
		return SKIP_BODY;
	}
}

