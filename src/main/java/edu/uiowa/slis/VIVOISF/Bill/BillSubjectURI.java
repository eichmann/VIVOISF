package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(BillSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Bill theBill = (Bill)findAncestorWithClass(this, Bill.class);
			if (!theBill.commitNeeded) {
				pageContext.getOut().print(theBill.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Bill theBill = (Bill)findAncestorWithClass(this, Bill.class);
			return theBill.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Bill for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Bill theBill = (Bill)findAncestorWithClass(this, Bill.class);
			theBill.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for subjectURI tag ");
		}
	}
}

