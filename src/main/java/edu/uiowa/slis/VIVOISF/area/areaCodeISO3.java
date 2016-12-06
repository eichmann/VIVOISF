package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(areaCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaCodeISO3Iterator thearea = (areaCodeISO3Iterator)findAncestorWithClass(this, areaCodeISO3Iterator.class);
			pageContext.getOut().print(thearea.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing area for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

