package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionCodeISO3Iterator thegeographical_region = (geographical_regionCodeISO3Iterator)findAncestorWithClass(this, geographical_regionCodeISO3Iterator.class);
			pageContext.getOut().print(thegeographical_region.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

