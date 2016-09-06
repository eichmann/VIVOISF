package edu.uiowa.slis.VIVOISF.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(DateLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Date theDate = (Date)findAncestorWithClass(this, Date.class);
			if (!theDate.commitNeeded) {
				pageContext.getOut().print(theDate.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Date for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Date for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Date theDate = (Date)findAncestorWithClass(this, Date.class);
			return theDate.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Date for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Date for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Date theDate = (Date)findAncestorWithClass(this, Date.class);
			theDate.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Date for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Date for label tag ");
		}
	}
}

