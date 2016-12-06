package edu.uiowa.slis.VIVOISF.Addressing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AddressingRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AddressingRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(AddressingRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AddressingRelatedByIterator theAddressingRelatedByIterator = (AddressingRelatedByIterator)findAncestorWithClass(this, AddressingRelatedByIterator.class);
			pageContext.getOut().print(theAddressingRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Addressing for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Addressing for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

