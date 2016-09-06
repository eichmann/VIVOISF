package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyTeachingOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyTeachingOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyTeachingOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusFaculty theEmeritusFaculty = (EmeritusFaculty)findAncestorWithClass(this, EmeritusFaculty.class);
			if (!theEmeritusFaculty.commitNeeded) {
				pageContext.getOut().print(theEmeritusFaculty.getTeachingOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for teachingOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for teachingOverview tag ");
		}
		return SKIP_BODY;
	}

	public String getTeachingOverview() throws JspTagException {
		try {
			EmeritusFaculty theEmeritusFaculty = (EmeritusFaculty)findAncestorWithClass(this, EmeritusFaculty.class);
			return theEmeritusFaculty.getTeachingOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing EmeritusFaculty for teachingOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for teachingOverview tag ");
		}
	}

	public void setTeachingOverview(String teachingOverview) throws JspTagException {
		try {
			EmeritusFaculty theEmeritusFaculty = (EmeritusFaculty)findAncestorWithClass(this, EmeritusFaculty.class);
			theEmeritusFaculty.setTeachingOverview(teachingOverview);
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for teachingOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for teachingOverview tag ");
		}
	}
}

