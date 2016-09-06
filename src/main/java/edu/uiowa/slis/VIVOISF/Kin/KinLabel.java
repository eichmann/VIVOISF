package edu.uiowa.slis.VIVOISF.Kin;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KinLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KinLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(KinLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Kin theKin = (Kin)findAncestorWithClass(this, Kin.class);
			if (!theKin.commitNeeded) {
				pageContext.getOut().print(theKin.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Kin for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kin for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Kin theKin = (Kin)findAncestorWithClass(this, Kin.class);
			return theKin.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Kin for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kin for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Kin theKin = (Kin)findAncestorWithClass(this, Kin.class);
			theKin.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Kin for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kin for label tag ");
		}
	}
}

