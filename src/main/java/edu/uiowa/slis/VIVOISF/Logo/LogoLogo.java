package edu.uiowa.slis.VIVOISF.Logo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LogoLogo extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LogoLogo currentInstance = null;
	private static final Log log = LogFactory.getLog(LogoLogo.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LogoLogoIterator theLogo = (LogoLogoIterator)findAncestorWithClass(this, LogoLogoIterator.class);
			pageContext.getOut().print(theLogo.getLogo());
		} catch (Exception e) {
			log.error("Can't find enclosing Logo for logo tag ", e);
			throw new JspTagException("Error: Can't find enclosing Logo for logo tag ");
		}
		return SKIP_BODY;
	}
}

