package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversityOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversityOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversityOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			University theUniversity = (University)findAncestorWithClass(this, University.class);
			if (!theUniversity.commitNeeded) {
				pageContext.getOut().print(theUniversity.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing University for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			University theUniversity = (University)findAncestorWithClass(this, University.class);
			return theUniversity.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing University for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			University theUniversity = (University)findAncestorWithClass(this, University.class);
			theUniversity.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing University for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for overview tag ");
		}
	}
}

