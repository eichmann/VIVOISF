package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			School theSchool = (School)findAncestorWithClass(this, School.class);
			if (!theSchool.commitNeeded) {
				pageContext.getOut().print(theSchool.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing School for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			School theSchool = (School)findAncestorWithClass(this, School.class);
			return theSchool.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing School for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			School theSchool = (School)findAncestorWithClass(this, School.class);
			theSchool.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing School for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for abbreviation tag ");
		}
	}
}

