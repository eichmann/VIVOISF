package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryRecipientInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryRecipientInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryRecipientInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LaboratoryRecipientInverseIterator theLaboratoryRecipientInverseIterator = (LaboratoryRecipientInverseIterator)findAncestorWithClass(this, LaboratoryRecipientInverseIterator.class);
			pageContext.getOut().print(theLaboratoryRecipientInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for recipient tag ");
		}
		return SKIP_BODY;
	}
}

