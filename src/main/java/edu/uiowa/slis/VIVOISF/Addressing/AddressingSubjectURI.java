package edu.uiowa.slis.VIVOISF.Addressing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AddressingSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AddressingSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(AddressingSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Addressing theAddressing = (Addressing)findAncestorWithClass(this, Addressing.class);
			if (!theAddressing.commitNeeded) {
				pageContext.getOut().print(theAddressing.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Addressing for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Addressing for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Addressing theAddressing = (Addressing)findAncestorWithClass(this, Addressing.class);
			return theAddressing.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Addressing for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Addressing for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Addressing theAddressing = (Addressing)findAncestorWithClass(this, Addressing.class);
			theAddressing.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Addressing for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Addressing for subjectURI tag ");
		}
	}
}

