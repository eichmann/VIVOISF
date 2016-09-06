package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegeAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegeAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegeAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			College theCollege = (College)findAncestorWithClass(this, College.class);
			if (!theCollege.commitNeeded) {
				pageContext.getOut().print(theCollege.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing College for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			College theCollege = (College)findAncestorWithClass(this, College.class);
			return theCollege.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing College for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			College theCollege = (College)findAncestorWithClass(this, College.class);
			theCollege.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing College for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for abbreviation tag ");
		}
	}
}

