package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualContent currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManualContentIterator theManual = (ManualContentIterator)findAncestorWithClass(this, ManualContentIterator.class);
			pageContext.getOut().print(theManual.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for content tag ");
		}
		return SKIP_BODY;
	}
}

