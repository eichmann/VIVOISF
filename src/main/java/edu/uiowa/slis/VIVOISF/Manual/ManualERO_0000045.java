package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManualERO_0000045Iterator theManual = (ManualERO_0000045Iterator)findAncestorWithClass(this, ManualERO_0000045Iterator.class);
			pageContext.getOut().print(theManual.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

