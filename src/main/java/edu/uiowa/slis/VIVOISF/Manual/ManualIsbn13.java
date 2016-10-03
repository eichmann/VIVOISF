package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManualIsbn13Iterator theManual = (ManualIsbn13Iterator)findAncestorWithClass(this, ManualIsbn13Iterator.class);
			pageContext.getOut().print(theManual.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

