package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManualEanucc13Iterator theManual = (ManualEanucc13Iterator)findAncestorWithClass(this, ManualEanucc13Iterator.class);
			pageContext.getOut().print(theManual.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

