package edu.uiowa.slis.VIVOISF.Communication;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommunicationLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommunicationLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(CommunicationLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Communication theCommunication = (Communication)findAncestorWithClass(this, Communication.class);
			if (!theCommunication.commitNeeded) {
				pageContext.getOut().print(theCommunication.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Communication for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Communication for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Communication theCommunication = (Communication)findAncestorWithClass(this, Communication.class);
			return theCommunication.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Communication for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Communication for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Communication theCommunication = (Communication)findAncestorWithClass(this, Communication.class);
			theCommunication.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Communication for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Communication for label tag ");
		}
	}
}

