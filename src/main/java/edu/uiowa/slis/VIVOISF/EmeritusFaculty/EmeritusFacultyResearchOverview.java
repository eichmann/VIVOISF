package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyResearchOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyResearchOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyResearchOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusFaculty theEmeritusFaculty = (EmeritusFaculty)findAncestorWithClass(this, EmeritusFaculty.class);
			if (!theEmeritusFaculty.commitNeeded) {
				pageContext.getOut().print(theEmeritusFaculty.getResearchOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for researchOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for researchOverview tag ");
		}
		return SKIP_BODY;
	}

	public String getResearchOverview() throws JspTagException {
		try {
			EmeritusFaculty theEmeritusFaculty = (EmeritusFaculty)findAncestorWithClass(this, EmeritusFaculty.class);
			return theEmeritusFaculty.getResearchOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing EmeritusFaculty for researchOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for researchOverview tag ");
		}
	}

	public void setResearchOverview(String researchOverview) throws JspTagException {
		try {
			EmeritusFaculty theEmeritusFaculty = (EmeritusFaculty)findAncestorWithClass(this, EmeritusFaculty.class);
			theEmeritusFaculty.setResearchOverview(researchOverview);
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for researchOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for researchOverview tag ");
		}
	}
}

