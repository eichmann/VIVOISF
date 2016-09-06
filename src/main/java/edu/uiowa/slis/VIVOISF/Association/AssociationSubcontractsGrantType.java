package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationSubcontractsGrantType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationSubcontractsGrantType currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationSubcontractsGrantType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AssociationSubcontractsGrantIterator theAssociationSubcontractsGrantIterator = (AssociationSubcontractsGrantIterator)findAncestorWithClass(this, AssociationSubcontractsGrantIterator.class);
			pageContext.getOut().print(theAssociationSubcontractsGrantIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Association for subcontractsGrant tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for subcontractsGrant tag ");
		}
		return SKIP_BODY;
	}
}

