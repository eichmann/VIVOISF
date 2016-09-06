package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Institute theInstitute = (Institute)findAncestorWithClass(this, Institute.class);
			if (!theInstitute.commitNeeded) {
				pageContext.getOut().print(theInstitute.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			Institute theInstitute = (Institute)findAncestorWithClass(this, Institute.class);
			return theInstitute.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing Institute for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			Institute theInstitute = (Institute)findAncestorWithClass(this, Institute.class);
			theInstitute.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for overview tag ");
		}
	}
}

