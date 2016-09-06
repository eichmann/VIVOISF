package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManualARG_0000001Iterator theManual = (ManualARG_0000001Iterator)findAncestorWithClass(this, ManualARG_0000001Iterator.class);
			pageContext.getOut().print(theManual.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

