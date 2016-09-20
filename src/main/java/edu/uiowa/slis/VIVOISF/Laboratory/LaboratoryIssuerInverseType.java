package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryIssuerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryIssuerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryIssuerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LaboratoryIssuerInverseIterator theLaboratoryIssuerInverseIterator = (LaboratoryIssuerInverseIterator)findAncestorWithClass(this, LaboratoryIssuerInverseIterator.class);
			pageContext.getOut().print(theLaboratoryIssuerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for issuer tag ");
		}
		return SKIP_BODY;
	}
}

