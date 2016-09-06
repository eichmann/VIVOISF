package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultySubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusFaculty theEmeritusFaculty = (EmeritusFaculty)findAncestorWithClass(this, EmeritusFaculty.class);
			if (!theEmeritusFaculty.commitNeeded) {
				pageContext.getOut().print(theEmeritusFaculty.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			EmeritusFaculty theEmeritusFaculty = (EmeritusFaculty)findAncestorWithClass(this, EmeritusFaculty.class);
			return theEmeritusFaculty.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing EmeritusFaculty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			EmeritusFaculty theEmeritusFaculty = (EmeritusFaculty)findAncestorWithClass(this, EmeritusFaculty.class);
			theEmeritusFaculty.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for subjectURI tag ");
		}
	}
}

