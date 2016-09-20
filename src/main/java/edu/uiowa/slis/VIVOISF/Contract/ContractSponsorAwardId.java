package edu.uiowa.slis.VIVOISF.Contract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContractSponsorAwardId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContractSponsorAwardId currentInstance = null;
	private static final Log log = LogFactory.getLog(ContractSponsorAwardId.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Contract theContract = (Contract)findAncestorWithClass(this, Contract.class);
			if (!theContract.commitNeeded) {
				pageContext.getOut().print(theContract.getSponsorAwardId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Contract for sponsorAwardId tag ", e);
			throw new JspTagException("Error: Can't find enclosing Contract for sponsorAwardId tag ");
		}
		return SKIP_BODY;
	}

	public String getSponsorAwardId() throws JspTagException {
		try {
			Contract theContract = (Contract)findAncestorWithClass(this, Contract.class);
			return theContract.getSponsorAwardId();
		} catch (Exception e) {
			log.error(" Can't find enclosing Contract for sponsorAwardId tag ", e);
			throw new JspTagException("Error: Can't find enclosing Contract for sponsorAwardId tag ");
		}
	}

	public void setSponsorAwardId(String sponsorAwardId) throws JspTagException {
		try {
			Contract theContract = (Contract)findAncestorWithClass(this, Contract.class);
			theContract.setSponsorAwardId(sponsorAwardId);
		} catch (Exception e) {
			log.error("Can't find enclosing Contract for sponsorAwardId tag ", e);
			throw new JspTagException("Error: Can't find enclosing Contract for sponsorAwardId tag ");
		}
	}
}

