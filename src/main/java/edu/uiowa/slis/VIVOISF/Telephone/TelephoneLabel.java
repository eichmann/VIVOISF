package edu.uiowa.slis.VIVOISF.Telephone;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TelephoneLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TelephoneLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(TelephoneLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Telephone theTelephone = (Telephone)findAncestorWithClass(this, Telephone.class);
			if (!theTelephone.commitNeeded) {
				pageContext.getOut().print(theTelephone.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Telephone for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Telephone for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Telephone theTelephone = (Telephone)findAncestorWithClass(this, Telephone.class);
			return theTelephone.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Telephone for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Telephone for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Telephone theTelephone = (Telephone)findAncestorWithClass(this, Telephone.class);
			theTelephone.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Telephone for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Telephone for label tag ");
		}
	}
}

