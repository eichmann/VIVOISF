package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentPatentNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentPatentNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentPatentNumber.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Patent thePatent = (Patent)findAncestorWithClass(this, Patent.class);
			if (!thePatent.commitNeeded) {
				pageContext.getOut().print(thePatent.getPatentNumber());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for patentNumber tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for patentNumber tag ");
		}
		return SKIP_BODY;
	}

	public String getPatentNumber() throws JspTagException {
		try {
			Patent thePatent = (Patent)findAncestorWithClass(this, Patent.class);
			return thePatent.getPatentNumber();
		} catch (Exception e) {
			log.error(" Can't find enclosing Patent for patentNumber tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for patentNumber tag ");
		}
	}

	public void setPatentNumber(String patentNumber) throws JspTagException {
		try {
			Patent thePatent = (Patent)findAncestorWithClass(this, Patent.class);
			thePatent.setPatentNumber(patentNumber);
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for patentNumber tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for patentNumber tag ");
		}
	}
}

