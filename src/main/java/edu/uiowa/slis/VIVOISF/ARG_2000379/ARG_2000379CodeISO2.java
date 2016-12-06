package edu.uiowa.slis.VIVOISF.ARG_2000379;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000379CodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000379CodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000379CodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ARG_2000379CodeISO2Iterator theARG_2000379 = (ARG_2000379CodeISO2Iterator)findAncestorWithClass(this, ARG_2000379CodeISO2Iterator.class);
			pageContext.getOut().print(theARG_2000379.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000379 for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000379 for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

