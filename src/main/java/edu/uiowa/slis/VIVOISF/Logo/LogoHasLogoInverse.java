package edu.uiowa.slis.VIVOISF.Logo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LogoHasLogoInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LogoHasLogoInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(LogoHasLogoInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LogoHasLogoInverseIterator theLogoHasLogoInverseIterator = (LogoHasLogoInverseIterator)findAncestorWithClass(this, LogoHasLogoInverseIterator.class);
			pageContext.getOut().print(theLogoHasLogoInverseIterator.getHasLogoInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Logo for hasLogo tag ", e);
			throw new JspTagException("Error: Can't find enclosing Logo for hasLogo tag ");
		}
		return SKIP_BODY;
	}
}

