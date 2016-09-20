package edu.uiowa.slis.VIVOISF.Contract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContractLocalAwardId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContractLocalAwardId currentInstance = null;
	private static final Log log = LogFactory.getLog(ContractLocalAwardId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContractLocalAwardIdIterator theContract = (ContractLocalAwardIdIterator)findAncestorWithClass(this, ContractLocalAwardIdIterator.class);
			pageContext.getOut().print(theContract.getLocalAwardId());
		} catch (Exception e) {
			log.error("Can't find enclosing Contract for localAwardId tag ", e);
			throw new JspTagException("Error: Can't find enclosing Contract for localAwardId tag ");
		}
		return SKIP_BODY;
	}
}

