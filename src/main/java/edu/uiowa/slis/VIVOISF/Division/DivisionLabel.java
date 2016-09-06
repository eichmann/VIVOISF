package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Division theDivision = (Division)findAncestorWithClass(this, Division.class);
			if (!theDivision.commitNeeded) {
				pageContext.getOut().print(theDivision.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Division for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Division theDivision = (Division)findAncestorWithClass(this, Division.class);
			return theDivision.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Division for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Division theDivision = (Division)findAncestorWithClass(this, Division.class);
			theDivision.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Division for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for label tag ");
		}
	}
}

