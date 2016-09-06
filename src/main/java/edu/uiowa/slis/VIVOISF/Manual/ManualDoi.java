package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManualDoiIterator theManual = (ManualDoiIterator)findAncestorWithClass(this, ManualDoiIterator.class);
			pageContext.getOut().print(theManual.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for doi tag ");
		}
		return SKIP_BODY;
	}
}

