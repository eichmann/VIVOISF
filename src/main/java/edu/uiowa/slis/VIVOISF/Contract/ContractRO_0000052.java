package edu.uiowa.slis.VIVOISF.Contract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContractRO_0000052 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContractRO_0000052 currentInstance = null;
	private static final Log log = LogFactory.getLog(ContractRO_0000052.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContractRO_0000052Iterator theContractRO_0000052Iterator = (ContractRO_0000052Iterator)findAncestorWithClass(this, ContractRO_0000052Iterator.class);
			pageContext.getOut().print(theContractRO_0000052Iterator.getRO_0000052());
		} catch (Exception e) {
			log.error("Can't find enclosing Contract for RO_0000052 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Contract for RO_0000052 tag ");
		}
		return SKIP_BODY;
	}
}

