package edu.uiowa.slis.VIVOISF.Telephone;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TelephoneSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TelephoneSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(TelephoneSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Telephone theTelephone = (Telephone)findAncestorWithClass(this, Telephone.class);
			if (!theTelephone.commitNeeded) {
				pageContext.getOut().print(theTelephone.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Telephone for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Telephone for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Telephone theTelephone = (Telephone)findAncestorWithClass(this, Telephone.class);
			return theTelephone.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Telephone for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Telephone for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Telephone theTelephone = (Telephone)findAncestorWithClass(this, Telephone.class);
			theTelephone.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Telephone for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Telephone for subjectURI tag ");
		}
	}
}

