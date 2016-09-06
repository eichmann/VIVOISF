package edu.uiowa.slis.VIVOISF.Security;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SecuritySubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SecuritySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(SecuritySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Security theSecurity = (Security)findAncestorWithClass(this, Security.class);
			if (!theSecurity.commitNeeded) {
				pageContext.getOut().print(theSecurity.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Security for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Security for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Security theSecurity = (Security)findAncestorWithClass(this, Security.class);
			return theSecurity.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Security for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Security for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Security theSecurity = (Security)findAncestorWithClass(this, Security.class);
			theSecurity.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Security for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Security for subjectURI tag ");
		}
	}
}

