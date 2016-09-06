package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Division theDivision = (Division)findAncestorWithClass(this, Division.class);
			if (!theDivision.commitNeeded) {
				pageContext.getOut().print(theDivision.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Division for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			Division theDivision = (Division)findAncestorWithClass(this, Division.class);
			return theDivision.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing Division for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			Division theDivision = (Division)findAncestorWithClass(this, Division.class);
			theDivision.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing Division for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for overview tag ");
		}
	}
}

