package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationSubcontractsGrant extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationSubcontractsGrant currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationSubcontractsGrant.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AssociationSubcontractsGrantIterator theAssociationSubcontractsGrantIterator = (AssociationSubcontractsGrantIterator)findAncestorWithClass(this, AssociationSubcontractsGrantIterator.class);
			pageContext.getOut().print(theAssociationSubcontractsGrantIterator.getSubcontractsGrant());
		} catch (Exception e) {
			log.error("Can't find enclosing Association for subcontractsGrant tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for subcontractsGrant tag ");
		}
		return SKIP_BODY;
	}
}

