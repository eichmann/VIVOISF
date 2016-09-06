package edu.uiowa.slis.VIVOISF.Contract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContractRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContractRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ContractRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContractRO_0000056Iterator theContractRO_0000056Iterator = (ContractRO_0000056Iterator)findAncestorWithClass(this, ContractRO_0000056Iterator.class);
			pageContext.getOut().print(theContractRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Contract for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Contract for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

