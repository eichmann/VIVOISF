package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionRecipientInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionRecipientInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionRecipientInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DivisionRecipientInverseIterator theDivisionRecipientInverseIterator = (DivisionRecipientInverseIterator)findAncestorWithClass(this, DivisionRecipientInverseIterator.class);
			pageContext.getOut().print(theDivisionRecipientInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Division for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for recipient tag ");
		}
		return SKIP_BODY;
	}
}

