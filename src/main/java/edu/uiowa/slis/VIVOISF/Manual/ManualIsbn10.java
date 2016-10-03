package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManualIsbn10Iterator theManual = (ManualIsbn10Iterator)findAncestorWithClass(this, ManualIsbn10Iterator.class);
			pageContext.getOut().print(theManual.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

