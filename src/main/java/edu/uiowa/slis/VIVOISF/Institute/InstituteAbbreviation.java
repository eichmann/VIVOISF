package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Institute theInstitute = (Institute)findAncestorWithClass(this, Institute.class);
			if (!theInstitute.commitNeeded) {
				pageContext.getOut().print(theInstitute.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Institute theInstitute = (Institute)findAncestorWithClass(this, Institute.class);
			return theInstitute.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Institute for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Institute theInstitute = (Institute)findAncestorWithClass(this, Institute.class);
			theInstitute.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for abbreviation tag ");
		}
	}
}

