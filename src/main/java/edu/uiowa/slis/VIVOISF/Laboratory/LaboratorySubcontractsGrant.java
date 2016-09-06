package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratorySubcontractsGrant extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratorySubcontractsGrant currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratorySubcontractsGrant.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LaboratorySubcontractsGrantIterator theLaboratorySubcontractsGrantIterator = (LaboratorySubcontractsGrantIterator)findAncestorWithClass(this, LaboratorySubcontractsGrantIterator.class);
			pageContext.getOut().print(theLaboratorySubcontractsGrantIterator.getSubcontractsGrant());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for subcontractsGrant tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for subcontractsGrant tag ");
		}
		return SKIP_BODY;
	}
}

