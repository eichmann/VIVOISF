package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionCodeISO2Iterator thegeographical_region = (geographical_regionCodeISO2Iterator)findAncestorWithClass(this, geographical_regionCodeISO2Iterator.class);
			pageContext.getOut().print(thegeographical_region.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

