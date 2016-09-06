package edu.uiowa.slis.VIVOISF.Contract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContractSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContractSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ContractSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Contract theContract = (Contract)findAncestorWithClass(this, Contract.class);
			if (!theContract.commitNeeded) {
				pageContext.getOut().print(theContract.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Contract for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Contract for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Contract theContract = (Contract)findAncestorWithClass(this, Contract.class);
			return theContract.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Contract for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Contract for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Contract theContract = (Contract)findAncestorWithClass(this, Contract.class);
			theContract.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Contract for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Contract for subjectURI tag ");
		}
	}
}

