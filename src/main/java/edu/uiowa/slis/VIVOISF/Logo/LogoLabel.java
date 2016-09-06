package edu.uiowa.slis.VIVOISF.Logo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LogoLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LogoLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(LogoLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Logo theLogo = (Logo)findAncestorWithClass(this, Logo.class);
			if (!theLogo.commitNeeded) {
				pageContext.getOut().print(theLogo.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Logo for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Logo for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Logo theLogo = (Logo)findAncestorWithClass(this, Logo.class);
			return theLogo.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Logo for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Logo for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Logo theLogo = (Logo)findAncestorWithClass(this, Logo.class);
			theLogo.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Logo for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Logo for label tag ");
		}
	}
}

