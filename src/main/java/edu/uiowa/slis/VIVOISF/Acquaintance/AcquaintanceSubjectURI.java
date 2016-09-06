package edu.uiowa.slis.VIVOISF.Acquaintance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcquaintanceSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcquaintanceSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(AcquaintanceSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Acquaintance theAcquaintance = (Acquaintance)findAncestorWithClass(this, Acquaintance.class);
			if (!theAcquaintance.commitNeeded) {
				pageContext.getOut().print(theAcquaintance.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Acquaintance for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Acquaintance for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Acquaintance theAcquaintance = (Acquaintance)findAncestorWithClass(this, Acquaintance.class);
			return theAcquaintance.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Acquaintance for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Acquaintance for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Acquaintance theAcquaintance = (Acquaintance)findAncestorWithClass(this, Acquaintance.class);
			theAcquaintance.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Acquaintance for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Acquaintance for subjectURI tag ");
		}
	}
}

