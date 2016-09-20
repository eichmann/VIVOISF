package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryIssuerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryIssuerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryIssuerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratoryIssuerInverseIterator theCoreLaboratoryIssuerInverseIterator = (CoreLaboratoryIssuerInverseIterator)findAncestorWithClass(this, CoreLaboratoryIssuerInverseIterator.class);
			pageContext.getOut().print(theCoreLaboratoryIssuerInverseIterator.getIssuerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for issuer tag ");
		}
		return SKIP_BODY;
	}
}

