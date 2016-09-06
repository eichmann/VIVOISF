package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingCodeISO2Iterator theself_governing = (self_governingCodeISO2Iterator)findAncestorWithClass(this, self_governingCodeISO2Iterator.class);
			pageContext.getOut().print(theself_governing.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

