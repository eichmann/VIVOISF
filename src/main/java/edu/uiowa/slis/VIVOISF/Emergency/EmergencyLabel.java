package edu.uiowa.slis.VIVOISF.Emergency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmergencyLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmergencyLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(EmergencyLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Emergency theEmergency = (Emergency)findAncestorWithClass(this, Emergency.class);
			if (!theEmergency.commitNeeded) {
				pageContext.getOut().print(theEmergency.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Emergency for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Emergency for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Emergency theEmergency = (Emergency)findAncestorWithClass(this, Emergency.class);
			return theEmergency.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Emergency for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Emergency for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Emergency theEmergency = (Emergency)findAncestorWithClass(this, Emergency.class);
			theEmergency.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Emergency for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Emergency for label tag ");
		}
	}
}

