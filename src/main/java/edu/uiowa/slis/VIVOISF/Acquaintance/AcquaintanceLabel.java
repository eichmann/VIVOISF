package edu.uiowa.slis.VIVOISF.Acquaintance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcquaintanceLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcquaintanceLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(AcquaintanceLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Acquaintance theAcquaintance = (Acquaintance)findAncestorWithClass(this, Acquaintance.class);
			if (!theAcquaintance.commitNeeded) {
				pageContext.getOut().print(theAcquaintance.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Acquaintance for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Acquaintance for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Acquaintance theAcquaintance = (Acquaintance)findAncestorWithClass(this, Acquaintance.class);
			return theAcquaintance.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Acquaintance for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Acquaintance for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Acquaintance theAcquaintance = (Acquaintance)findAncestorWithClass(this, Acquaintance.class);
			theAcquaintance.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Acquaintance for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Acquaintance for label tag ");
		}
	}
}

