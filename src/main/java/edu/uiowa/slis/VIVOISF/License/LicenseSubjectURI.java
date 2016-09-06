package edu.uiowa.slis.VIVOISF.License;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LicenseSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LicenseSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(LicenseSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			License theLicense = (License)findAncestorWithClass(this, License.class);
			if (!theLicense.commitNeeded) {
				pageContext.getOut().print(theLicense.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing License for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing License for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			License theLicense = (License)findAncestorWithClass(this, License.class);
			return theLicense.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing License for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing License for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			License theLicense = (License)findAncestorWithClass(this, License.class);
			theLicense.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing License for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing License for subjectURI tag ");
		}
	}
}

