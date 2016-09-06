package edu.uiowa.slis.VIVOISF.Campus;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CampusSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CampusSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(CampusSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Campus theCampus = (Campus)findAncestorWithClass(this, Campus.class);
			if (!theCampus.commitNeeded) {
				pageContext.getOut().print(theCampus.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Campus for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Campus for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Campus theCampus = (Campus)findAncestorWithClass(this, Campus.class);
			return theCampus.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Campus for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Campus for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Campus theCampus = (Campus)findAncestorWithClass(this, Campus.class);
			theCampus.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Campus for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Campus for subjectURI tag ");
		}
	}
}

