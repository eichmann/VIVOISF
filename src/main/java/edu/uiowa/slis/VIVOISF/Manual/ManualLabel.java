package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Manual theManual = (Manual)findAncestorWithClass(this, Manual.class);
			if (!theManual.commitNeeded) {
				pageContext.getOut().print(theManual.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Manual theManual = (Manual)findAncestorWithClass(this, Manual.class);
			return theManual.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Manual for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Manual theManual = (Manual)findAncestorWithClass(this, Manual.class);
			theManual.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for label tag ");
		}
	}
}

