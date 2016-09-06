package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegeOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegeOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegeOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			College theCollege = (College)findAncestorWithClass(this, College.class);
			if (!theCollege.commitNeeded) {
				pageContext.getOut().print(theCollege.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing College for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			College theCollege = (College)findAncestorWithClass(this, College.class);
			return theCollege.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing College for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			College theCollege = (College)findAncestorWithClass(this, College.class);
			theCollege.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing College for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for overview tag ");
		}
	}
}

