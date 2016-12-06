package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(areaCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaCodeISO2Iterator thearea = (areaCodeISO2Iterator)findAncestorWithClass(this, areaCodeISO2Iterator.class);
			pageContext.getOut().print(thearea.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing area for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

