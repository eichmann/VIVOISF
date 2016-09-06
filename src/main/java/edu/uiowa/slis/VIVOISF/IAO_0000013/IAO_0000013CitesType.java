package edu.uiowa.slis.VIVOISF.IAO_0000013;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000013CitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000013CitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000013CitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000013CitesIterator theIAO_0000013CitesIterator = (IAO_0000013CitesIterator)findAncestorWithClass(this, IAO_0000013CitesIterator.class);
			pageContext.getOut().print(theIAO_0000013CitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000013 for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000013 for cites tag ");
		}
		return SKIP_BODY;
	}
}

