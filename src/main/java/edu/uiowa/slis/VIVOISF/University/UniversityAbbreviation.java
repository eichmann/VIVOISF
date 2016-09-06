package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversityAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversityAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversityAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			University theUniversity = (University)findAncestorWithClass(this, University.class);
			if (!theUniversity.commitNeeded) {
				pageContext.getOut().print(theUniversity.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing University for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			University theUniversity = (University)findAncestorWithClass(this, University.class);
			return theUniversity.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing University for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			University theUniversity = (University)findAncestorWithClass(this, University.class);
			theUniversity.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing University for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for abbreviation tag ");
		}
	}
}

