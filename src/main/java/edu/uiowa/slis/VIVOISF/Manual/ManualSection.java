package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualSection currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManualSectionIterator theManual = (ManualSectionIterator)findAncestorWithClass(this, ManualSectionIterator.class);
			pageContext.getOut().print(theManual.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for section tag ");
		}
		return SKIP_BODY;
	}
}

