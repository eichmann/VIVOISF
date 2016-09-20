package edu.uiowa.slis.VIVOISF.Contract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContractGrantDirectCosts extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContractGrantDirectCosts currentInstance = null;
	private static final Log log = LogFactory.getLog(ContractGrantDirectCosts.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Contract theContract = (Contract)findAncestorWithClass(this, Contract.class);
			if (!theContract.commitNeeded) {
				pageContext.getOut().print(theContract.getGrantDirectCosts());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Contract for grantDirectCosts tag ", e);
			throw new JspTagException("Error: Can't find enclosing Contract for grantDirectCosts tag ");
		}
		return SKIP_BODY;
	}

	public String getGrantDirectCosts() throws JspTagException {
		try {
			Contract theContract = (Contract)findAncestorWithClass(this, Contract.class);
			return theContract.getGrantDirectCosts();
		} catch (Exception e) {
			log.error(" Can't find enclosing Contract for grantDirectCosts tag ", e);
			throw new JspTagException("Error: Can't find enclosing Contract for grantDirectCosts tag ");
		}
	}

	public void setGrantDirectCosts(String grantDirectCosts) throws JspTagException {
		try {
			Contract theContract = (Contract)findAncestorWithClass(this, Contract.class);
			theContract.setGrantDirectCosts(grantDirectCosts);
		} catch (Exception e) {
			log.error("Can't find enclosing Contract for grantDirectCosts tag ", e);
			throw new JspTagException("Error: Can't find enclosing Contract for grantDirectCosts tag ");
		}
	}
}

