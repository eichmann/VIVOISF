package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanySubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PrivateCompany thePrivateCompany = (PrivateCompany)findAncestorWithClass(this, PrivateCompany.class);
			if (!thePrivateCompany.commitNeeded) {
				pageContext.getOut().print(thePrivateCompany.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			PrivateCompany thePrivateCompany = (PrivateCompany)findAncestorWithClass(this, PrivateCompany.class);
			return thePrivateCompany.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing PrivateCompany for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			PrivateCompany thePrivateCompany = (PrivateCompany)findAncestorWithClass(this, PrivateCompany.class);
			thePrivateCompany.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for subjectURI tag ");
		}
	}
}

