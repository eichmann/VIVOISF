package edu.uiowa.slis.VIVOISF.Contract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContractLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContractLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ContractLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Contract theContract = (Contract)findAncestorWithClass(this, Contract.class);
			if (!theContract.commitNeeded) {
				pageContext.getOut().print(theContract.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Contract for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Contract for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Contract theContract = (Contract)findAncestorWithClass(this, Contract.class);
			return theContract.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Contract for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Contract for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Contract theContract = (Contract)findAncestorWithClass(this, Contract.class);
			theContract.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Contract for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Contract for label tag ");
		}
	}
}

