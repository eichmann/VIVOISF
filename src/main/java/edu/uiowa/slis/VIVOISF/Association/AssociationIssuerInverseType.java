package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationIssuerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationIssuerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationIssuerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AssociationIssuerInverseIterator theAssociationIssuerInverseIterator = (AssociationIssuerInverseIterator)findAncestorWithClass(this, AssociationIssuerInverseIterator.class);
			pageContext.getOut().print(theAssociationIssuerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Association for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for issuer tag ");
		}
		return SKIP_BODY;
	}
}

