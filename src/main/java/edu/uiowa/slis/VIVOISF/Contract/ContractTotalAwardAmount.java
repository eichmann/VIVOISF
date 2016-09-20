package edu.uiowa.slis.VIVOISF.Contract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContractTotalAwardAmount extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContractTotalAwardAmount currentInstance = null;
	private static final Log log = LogFactory.getLog(ContractTotalAwardAmount.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Contract theContract = (Contract)findAncestorWithClass(this, Contract.class);
			if (!theContract.commitNeeded) {
				pageContext.getOut().print(theContract.getTotalAwardAmount());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Contract for totalAwardAmount tag ", e);
			throw new JspTagException("Error: Can't find enclosing Contract for totalAwardAmount tag ");
		}
		return SKIP_BODY;
	}

	public String getTotalAwardAmount() throws JspTagException {
		try {
			Contract theContract = (Contract)findAncestorWithClass(this, Contract.class);
			return theContract.getTotalAwardAmount();
		} catch (Exception e) {
			log.error(" Can't find enclosing Contract for totalAwardAmount tag ", e);
			throw new JspTagException("Error: Can't find enclosing Contract for totalAwardAmount tag ");
		}
	}

	public void setTotalAwardAmount(String totalAwardAmount) throws JspTagException {
		try {
			Contract theContract = (Contract)findAncestorWithClass(this, Contract.class);
			theContract.setTotalAwardAmount(totalAwardAmount);
		} catch (Exception e) {
			log.error("Can't find enclosing Contract for totalAwardAmount tag ", e);
			throw new JspTagException("Error: Can't find enclosing Contract for totalAwardAmount tag ");
		}
	}
}

