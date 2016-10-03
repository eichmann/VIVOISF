package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualAuthorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualAuthorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualAuthorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManualAuthorListIterator theManualAuthorListIterator = (ManualAuthorListIterator)findAncestorWithClass(this, ManualAuthorListIterator.class);
			pageContext.getOut().print(theManualAuthorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for authorList tag ");
		}
		return SKIP_BODY;
	}
}

