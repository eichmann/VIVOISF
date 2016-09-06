package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			School theSchool = (School)findAncestorWithClass(this, School.class);
			if (!theSchool.commitNeeded) {
				pageContext.getOut().print(theSchool.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing School for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			School theSchool = (School)findAncestorWithClass(this, School.class);
			return theSchool.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing School for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			School theSchool = (School)findAncestorWithClass(this, School.class);
			theSchool.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing School for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for overview tag ");
		}
	}
}

