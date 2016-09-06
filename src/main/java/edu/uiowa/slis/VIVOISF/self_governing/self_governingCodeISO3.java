package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingCodeISO3Iterator theself_governing = (self_governingCodeISO3Iterator)findAncestorWithClass(this, self_governingCodeISO3Iterator.class);
			pageContext.getOut().print(theself_governing.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

