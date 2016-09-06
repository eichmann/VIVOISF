package edu.uiowa.slis.VIVOISF.Licensure;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LicensureLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LicensureLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(LicensureLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Licensure theLicensure = (Licensure)findAncestorWithClass(this, Licensure.class);
			if (!theLicensure.commitNeeded) {
				pageContext.getOut().print(theLicensure.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Licensure for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Licensure for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Licensure theLicensure = (Licensure)findAncestorWithClass(this, Licensure.class);
			return theLicensure.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Licensure for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Licensure for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Licensure theLicensure = (Licensure)findAncestorWithClass(this, Licensure.class);
			theLicensure.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Licensure for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Licensure for label tag ");
		}
	}
}

