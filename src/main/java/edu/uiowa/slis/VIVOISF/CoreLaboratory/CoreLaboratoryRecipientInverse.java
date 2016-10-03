package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryRecipientInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryRecipientInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryRecipientInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratoryRecipientInverseIterator theCoreLaboratoryRecipientInverseIterator = (CoreLaboratoryRecipientInverseIterator)findAncestorWithClass(this, CoreLaboratoryRecipientInverseIterator.class);
			pageContext.getOut().print(theCoreLaboratoryRecipientInverseIterator.getRecipientInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for recipient tag ");
		}
		return SKIP_BODY;
	}
}

