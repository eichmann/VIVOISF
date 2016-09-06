package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyOutreachOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyOutreachOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyOutreachOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusFaculty theEmeritusFaculty = (EmeritusFaculty)findAncestorWithClass(this, EmeritusFaculty.class);
			if (!theEmeritusFaculty.commitNeeded) {
				pageContext.getOut().print(theEmeritusFaculty.getOutreachOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for outreachOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for outreachOverview tag ");
		}
		return SKIP_BODY;
	}

	public String getOutreachOverview() throws JspTagException {
		try {
			EmeritusFaculty theEmeritusFaculty = (EmeritusFaculty)findAncestorWithClass(this, EmeritusFaculty.class);
			return theEmeritusFaculty.getOutreachOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing EmeritusFaculty for outreachOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for outreachOverview tag ");
		}
	}

	public void setOutreachOverview(String outreachOverview) throws JspTagException {
		try {
			EmeritusFaculty theEmeritusFaculty = (EmeritusFaculty)findAncestorWithClass(this, EmeritusFaculty.class);
			theEmeritusFaculty.setOutreachOverview(outreachOverview);
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for outreachOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for outreachOverview tag ");
		}
	}
}

