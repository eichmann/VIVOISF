package edu.uiowa.slis.VIVOISF.GlobalCitationCount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GlobalCitationCountRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GlobalCitationCountRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(GlobalCitationCountRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GlobalCitationCountRO_0000056Iterator theGlobalCitationCountRO_0000056Iterator = (GlobalCitationCountRO_0000056Iterator)findAncestorWithClass(this, GlobalCitationCountRO_0000056Iterator.class);
			pageContext.getOut().print(theGlobalCitationCountRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GlobalCitationCount for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GlobalCitationCount for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

