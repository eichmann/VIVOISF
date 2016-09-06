package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratorySubcontractsGrant extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratorySubcontractsGrant currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratorySubcontractsGrant.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratorySubcontractsGrantIterator theCoreLaboratorySubcontractsGrantIterator = (CoreLaboratorySubcontractsGrantIterator)findAncestorWithClass(this, CoreLaboratorySubcontractsGrantIterator.class);
			pageContext.getOut().print(theCoreLaboratorySubcontractsGrantIterator.getSubcontractsGrant());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for subcontractsGrant tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for subcontractsGrant tag ");
		}
		return SKIP_BODY;
	}
}

