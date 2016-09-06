package edu.uiowa.slis.VIVOISF.TelephoneType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TelephoneTypeLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TelephoneTypeLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(TelephoneTypeLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			TelephoneType theTelephoneType = (TelephoneType)findAncestorWithClass(this, TelephoneType.class);
			if (!theTelephoneType.commitNeeded) {
				pageContext.getOut().print(theTelephoneType.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TelephoneType for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing TelephoneType for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			TelephoneType theTelephoneType = (TelephoneType)findAncestorWithClass(this, TelephoneType.class);
			return theTelephoneType.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing TelephoneType for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing TelephoneType for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			TelephoneType theTelephoneType = (TelephoneType)findAncestorWithClass(this, TelephoneType.class);
			theTelephoneType.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing TelephoneType for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing TelephoneType for label tag ");
		}
	}
}

