package edu.uiowa.slis.VIVOISF.Licensure;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LicensureSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LicensureSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(LicensureSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Licensure theLicensure = (Licensure)findAncestorWithClass(this, Licensure.class);
			if (!theLicensure.commitNeeded) {
				pageContext.getOut().print(theLicensure.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Licensure for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Licensure for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Licensure theLicensure = (Licensure)findAncestorWithClass(this, Licensure.class);
			return theLicensure.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Licensure for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Licensure for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Licensure theLicensure = (Licensure)findAncestorWithClass(this, Licensure.class);
			theLicensure.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Licensure for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Licensure for subjectURI tag ");
		}
	}
}

