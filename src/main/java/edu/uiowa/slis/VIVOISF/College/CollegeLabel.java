package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegeLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegeLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegeLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			College theCollege = (College)findAncestorWithClass(this, College.class);
			if (!theCollege.commitNeeded) {
				pageContext.getOut().print(theCollege.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing College for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			College theCollege = (College)findAncestorWithClass(this, College.class);
			return theCollege.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing College for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			College theCollege = (College)findAncestorWithClass(this, College.class);
			theCollege.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing College for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for label tag ");
		}
	}
}

