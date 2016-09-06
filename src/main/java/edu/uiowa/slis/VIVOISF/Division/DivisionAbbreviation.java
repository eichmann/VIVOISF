package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Division theDivision = (Division)findAncestorWithClass(this, Division.class);
			if (!theDivision.commitNeeded) {
				pageContext.getOut().print(theDivision.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Division for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Division theDivision = (Division)findAncestorWithClass(this, Division.class);
			return theDivision.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Division for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Division theDivision = (Division)findAncestorWithClass(this, Division.class);
			theDivision.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Division for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for abbreviation tag ");
		}
	}
}

