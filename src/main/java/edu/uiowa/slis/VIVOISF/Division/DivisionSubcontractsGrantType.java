package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionSubcontractsGrantType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionSubcontractsGrantType currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionSubcontractsGrantType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DivisionSubcontractsGrantIterator theDivisionSubcontractsGrantIterator = (DivisionSubcontractsGrantIterator)findAncestorWithClass(this, DivisionSubcontractsGrantIterator.class);
			pageContext.getOut().print(theDivisionSubcontractsGrantIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Division for subcontractsGrant tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for subcontractsGrant tag ");
		}
		return SKIP_BODY;
	}
}

