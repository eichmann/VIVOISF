package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitSubcontractsGrantType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitSubcontractsGrantType currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitSubcontractsGrantType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitSubcontractsGrantIterator theExtensionUnitSubcontractsGrantIterator = (ExtensionUnitSubcontractsGrantIterator)findAncestorWithClass(this, ExtensionUnitSubcontractsGrantIterator.class);
			pageContext.getOut().print(theExtensionUnitSubcontractsGrantIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for subcontractsGrant tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for subcontractsGrant tag ");
		}
		return SKIP_BODY;
	}
}

