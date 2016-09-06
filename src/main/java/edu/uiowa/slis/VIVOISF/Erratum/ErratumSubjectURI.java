package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Erratum theErratum = (Erratum)findAncestorWithClass(this, Erratum.class);
			if (!theErratum.commitNeeded) {
				pageContext.getOut().print(theErratum.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Erratum theErratum = (Erratum)findAncestorWithClass(this, Erratum.class);
			return theErratum.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Erratum for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Erratum theErratum = (Erratum)findAncestorWithClass(this, Erratum.class);
			theErratum.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for subjectURI tag ");
		}
	}
}

