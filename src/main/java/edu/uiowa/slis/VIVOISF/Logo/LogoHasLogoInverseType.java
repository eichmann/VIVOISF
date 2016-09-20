package edu.uiowa.slis.VIVOISF.Logo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LogoHasLogoInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LogoHasLogoInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(LogoHasLogoInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LogoHasLogoInverseIterator theLogoHasLogoInverseIterator = (LogoHasLogoInverseIterator)findAncestorWithClass(this, LogoHasLogoInverseIterator.class);
			pageContext.getOut().print(theLogoHasLogoInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Logo for hasLogo tag ", e);
			throw new JspTagException("Error: Can't find enclosing Logo for hasLogo tag ");
		}
		return SKIP_BODY;
	}
}

