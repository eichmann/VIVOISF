package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusFaculty theEmeritusFaculty = (EmeritusFaculty)findAncestorWithClass(this, EmeritusFaculty.class);
			if (!theEmeritusFaculty.commitNeeded) {
				pageContext.getOut().print(theEmeritusFaculty.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			EmeritusFaculty theEmeritusFaculty = (EmeritusFaculty)findAncestorWithClass(this, EmeritusFaculty.class);
			return theEmeritusFaculty.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing EmeritusFaculty for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			EmeritusFaculty theEmeritusFaculty = (EmeritusFaculty)findAncestorWithClass(this, EmeritusFaculty.class);
			theEmeritusFaculty.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for overview tag ");
		}
	}
}

